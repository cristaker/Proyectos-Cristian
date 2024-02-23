package api.inventario.controllers;

import api.inventario.service.ModeloDispositivoServicio;
import api.inventario.models.ModeloDispositivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dispositivos/modelos")
public class ModelosDispositivosControlador {

    @Autowired
    private ModeloDispositivoServicio modeloDispositivoServicio;

    @GetMapping("/{id}")
    public ResponseEntity<ModeloDispositivo> obtenerModeloPorId(@PathVariable Long id) {
        ModeloDispositivo modeloDispositivo = modeloDispositivoServicio.obtenerModeloPorId(id);
        return ResponseEntity.ok(modeloDispositivo);
    }

    @PostMapping
    public ResponseEntity<ModeloDispositivo> crearModelo(@RequestBody ModeloDispositivo modeloDispositivo) {
        ModeloDispositivo nuevoModelo = modeloDispositivoServicio.crearModelo(modeloDispositivo);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoModelo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModeloDispositivo> actualizarModelo(@PathVariable Long id, @RequestBody ModeloDispositivo modeloDispositivo) {
        ModeloDispositivo modeloActualizado = modeloDispositivoServicio.actualizarModelo(id, modeloDispositivo);
        return ResponseEntity.ok(modeloActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarModelo(@PathVariable Long id) {
        modeloDispositivoServicio.eliminarModelo(id);
        return ResponseEntity.noContent().build();
    }
}
