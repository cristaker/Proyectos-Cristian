package com.gtc.pruebagtc.controllers;

import com.gtc.pruebagtc.models.dto.EstudianteDTO;
import com.gtc.pruebagtc.models.response.ApiResponse;
import com.gtc.pruebagtc.projection.EstudianteNombreProyeccion;
import com.gtc.pruebagtc.services.EstudianteService;
import com.gtc.pruebagtc.utils.MensajeRespuesta;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
@RequiredArgsConstructor
public class EstudianteController {

    private final EstudianteService service;

    @PostMapping
    public ResponseEntity<ApiResponse<EstudianteDTO>> agregar(@RequestBody EstudianteDTO dto) {
        EstudianteDTO creado = service.agregar(dto);
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK, MensajeRespuesta.ESTUDIANTE_CREADO.getMensaje(), creado));
    }

    @PutMapping
    public ResponseEntity<ApiResponse<EstudianteDTO>> editar(@RequestBody EstudianteDTO dto) {
        EstudianteDTO actualizado = service.editar(dto);
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK, MensajeRespuesta.ESTUDIANTE_ACTUALIZADO.getMensaje(), actualizado));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<EstudianteNombreProyeccion>>> listar() {
        List<EstudianteNombreProyeccion> lista = service.listar();
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK, MensajeRespuesta.LISTA_ESTUDIANTES.getMensaje(), lista));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK, MensajeRespuesta.ESTUDIANTE_ELIMINADO.getMensaje(), null));
    }
}