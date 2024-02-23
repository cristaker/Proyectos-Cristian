package api.inventario.controllers;

import api.inventario.models.Dispositivo;
import api.inventario.service.DispositivoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoControlador {

    @Autowired
    private DispositivoServicio dispositivoServicio;

    @GetMapping("/{id}")
    public ResponseEntity<Dispositivo> obtenerDispositivoPorId(@PathVariable Long id) {
        Dispositivo dispositivo = dispositivoServicio.obtenerDispositivoPorId(id);
        return ResponseEntity.ok(dispositivo);
    }

    @PostMapping
    public ResponseEntity<Dispositivo> crearDispositivo(@RequestBody Dispositivo dispositivo) {
        Dispositivo nuevoDispositivo = dispositivoServicio.crearDispositivo(dispositivo);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoDispositivo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dispositivo> actualizarDispositivo(@PathVariable Long id, @RequestBody Dispositivo dispositivo) {
        Dispositivo dispositivoActualizado = dispositivoServicio.actualizarDispositivo(id, dispositivo);
        return ResponseEntity.ok(dispositivoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarDispositivo(@PathVariable Long id) {
        dispositivoServicio.eliminarDispositivo(id);
        return ResponseEntity.noContent().build();
    }
}
