package api.inventario.controllers;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.repository.DatosRepository;
import api.inventario.models.Datos;
import api.inventario.models.SolicitudLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/datos")
public class DatosController {

    @Autowired
    private ServicioExternoControlador externalService;

    @Autowired
    private DatosRepository datosRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody SolicitudLogin request) {
        String jwtToken = externalService.login(request);
        return ResponseEntity.ok(jwtToken);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Datos> obtenerDatos(@PathVariable Long id) {
        Datos datos = datosRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Datos no encontrados con id: " + id));
        return ResponseEntity.ok(datos);
    }

    @PostMapping
    public ResponseEntity<Datos> crearDatos(@RequestBody Datos datos) {
        Datos nuevoDatos = datosRepository.save(datos);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoDatos);
    }
}

