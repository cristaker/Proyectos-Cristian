package api.inventario.controllers;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.models.Fabricante;
import api.inventario.service.FabricanteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteControlador {

    private final FabricanteServicio fabricanteServicio;

    @Autowired
    public FabricanteControlador(FabricanteServicio fabricanteServicio) {
        this.fabricanteServicio = fabricanteServicio;
    }

    @GetMapping
    public ResponseEntity<List<Fabricante>> obtenerTodosLosFabricantes() {
        List<Fabricante> fabricantes = fabricanteServicio.obtenerTodosLosFabricantes();
        return ResponseEntity.ok(fabricantes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fabricante> obtenerFabricantePorId(@PathVariable Long id) {
        Fabricante fabricante = fabricanteServicio.obtenerFabricantePorId(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fabricante no encontrado con id: " + id));
        return ResponseEntity.ok(fabricante);
    }

    @PostMapping
    public ResponseEntity<Fabricante> crearFabricante(@RequestBody Fabricante fabricante) {
        Fabricante nuevoFabricante = fabricanteServicio.crearFabricante(fabricante);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoFabricante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fabricante> actualizarFabricante(@PathVariable Long id, @RequestBody Fabricante fabricante) {
        Fabricante fabricanteActualizado = fabricanteServicio.actualizarFabricante(id, fabricante);
        return ResponseEntity.ok(fabricanteActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarFabricante(@PathVariable Long id) {
        fabricanteServicio.eliminarFabricante(id);
        return ResponseEntity.noContent().build();
    }
}
