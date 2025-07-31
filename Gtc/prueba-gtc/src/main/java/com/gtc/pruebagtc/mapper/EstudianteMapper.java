package com.gtc.pruebagtc.mapper;

import com.gtc.pruebagtc.models.dto.EstudianteDTO;
import com.gtc.pruebagtc.models.entitys.Estudiante;

public class EstudianteMapper {

    public static EstudianteDTO toDto(Estudiante entity) {
        EstudianteDTO dto = new EstudianteDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setCorreo(entity.getCorreo());
        return dto;
    }

    public static Estudiante toEntity(EstudianteDTO dto) {
        Estudiante entity = new Estudiante();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setCorreo(dto.getCorreo());
        return entity;
    }
}

