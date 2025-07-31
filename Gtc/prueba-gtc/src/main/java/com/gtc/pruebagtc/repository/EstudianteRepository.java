package com.gtc.pruebagtc.repository;

import com.gtc.pruebagtc.models.entitys.Estudiante;
import com.gtc.pruebagtc.projection.EstudianteNombreProyeccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    List<EstudianteNombreProyeccion> findAllBy();
}
