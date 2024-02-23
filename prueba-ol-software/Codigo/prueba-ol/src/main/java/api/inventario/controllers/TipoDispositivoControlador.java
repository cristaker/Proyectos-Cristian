package api.inventario.controllers;

import api.inventario.models.TipoDispositivo;
import api.inventario.service.TipoDispositivoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/dispositivo/tipos")
public class TipoDispositivoControlador {

    @Autowired
    private TipoDispositivoServicio tipoDispositivoServicio;

    public TipoDispositivoControlador(TipoDispositivoServicio tipoDispositivoServicio) {
        this.tipoDispositivoServicio = tipoDispositivoServicio;
    }

    @GetMapping
    public ResponseEntity<List<TipoDispositivo>> obtenerTodosTiposDispositivos() {
        List<TipoDispositivo> tiposDispositivos = tipoDispositivoServicio.obtenerTodos();
        return ResponseEntity.ok(tiposDispositivos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDispositivo> obtenerTipoDispositivoPorId(@PathVariable Long id) {
        TipoDispositivo tipoDispositivo = tipoDispositivoServicio.obtenerPorId(id);
        return ResponseEntity.ok(tipoDispositivo);
    }

    @PostMapping
    public ResponseEntity<TipoDispositivo> crearTipoDispositivo(@RequestBody TipoDispositivo tipoDispositivo) {
        TipoDispositivo nuevoTipoDispositivo = tipoDispositivoServicio.crear(tipoDispositivo);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoTipoDispositivo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoDispositivo> actualizarTipoDispositivo(@PathVariable Long id, @RequestBody TipoDispositivo tipoDispositivo) {
        TipoDispositivo tipoDispositivoActualizado = tipoDispositivoServicio.actualizar(id, tipoDispositivo);
        return ResponseEntity.ok(tipoDispositivoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTipoDispositivo(@PathVariable Long id) {
        tipoDispositivoServicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
