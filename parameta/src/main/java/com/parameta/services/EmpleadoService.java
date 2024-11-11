package com.parameta.services;

import com.parameta.exceptions.EdadInvalidaException;
import com.parameta.exceptions.FechaNacimientoNulaException;
import com.parameta.exceptions.FechaVinculacionNulaException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Service
public class EmpleadoService {

    public boolean esMayorDeEdad(Date fechaNacimiento) {

        if (fechaNacimiento == null) {
            throw new FechaNacimientoNulaException("La fecha de nacimiento no puede ser nula");
        }

        LocalDate nacimiento = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int edad = Period.between(nacimiento, LocalDate.now()).getYears();

        if (edad < 0) {
            throw new EdadInvalidaException("La fecha de nacimiento no es válida");
        }

        return edad >= 18;
    }

    public Period calcularEdad(Date fechaNacimiento) {

        if (fechaNacimiento == null) {
            throw new FechaNacimientoNulaException("La fecha de nacimiento no puede ser nula");
        }

        LocalDate nacimiento = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period edad = Period.between(nacimiento, LocalDate.now());

        if (edad.getYears() < 0) {
            throw new EdadInvalidaException("La edad no es válida");
        }

        return edad;
    }

    public Period calcularTiempoVinculacion(Date fechaVinculacion) {

        if (fechaVinculacion == null) {
            throw new FechaVinculacionNulaException("La fecha de vinculación no puede ser nula");
        }

        LocalDate vinculacion = fechaVinculacion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(vinculacion, LocalDate.now());
    }
}

