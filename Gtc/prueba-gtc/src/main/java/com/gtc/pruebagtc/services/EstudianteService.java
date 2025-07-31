package com.gtc.pruebagtc.services;

import com.gtc.pruebagtc.exceptions.RecursoNoEncontradoException;
import com.gtc.pruebagtc.exceptions.ValidacionException;
import com.gtc.pruebagtc.mapper.EstudianteMapper;
import com.gtc.pruebagtc.models.dto.EstudianteDTO;
import com.gtc.pruebagtc.models.entitys.Estudiante;
import com.gtc.pruebagtc.projection.EstudianteNombreProyeccion;
import com.gtc.pruebagtc.repository.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudianteService {

    private final EstudianteRepository repository;

    public EstudianteDTO agregar(EstudianteDTO dto) {
        validarEstudiante(dto);
        Estudiante entity = EstudianteMapper.toEntity(dto);
        return EstudianteMapper.toDto(repository.save(entity));
    }

    public EstudianteDTO editar(EstudianteDTO dto) {
        validarEstudiante(dto);
        Estudiante existente = repository.findById(dto.getId())
                .orElseThrow(() -> new RecursoNoEncontradoException("Estudiante con ID " + dto.getId() + " no encontrado."));
        existente.setNombre(dto.getNombre());
        existente.setCorreo(dto.getCorreo());
        return EstudianteMapper.toDto(repository.save(existente));
    }

    public List<EstudianteNombreProyeccion> listar() {
        return repository.findAllBy();
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    private void validarEstudiante(EstudianteDTO dto) {
        List<String> errores = new ArrayList<>();
        if (dto.getNombre() == null || dto.getNombre().trim().isEmpty()) {
            errores.add("El nombre es obligatorio.");
        }
        if (dto.getCorreo() == null || dto.getCorreo().trim().isEmpty()) {
            errores.add("El correo es obligatorio.");
        } else if (!dto.getCorreo().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            errores.add("Debe ser un correo válido.");
        }
        if (!errores.isEmpty()) {
            throw new ValidacionException(String.join("; ", errores));
        }
    }
}

