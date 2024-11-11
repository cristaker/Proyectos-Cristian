package com.parameta.services;

import com.parameta.exceptions.ErrorServicioSoapException;
import com.parameta.models.Empleado;
import com.parameta.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoapService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public boolean enviarEmpleado(Empleado empleado) {
        return true;
    }

    public void enviarYGuardarEmpleado(Empleado empleado) {
        try {
            if (!enviarEmpleado(empleado)) {
                throw new ErrorServicioSoapException("Error al intentar enviar el empleado al servicio soap");
            }
            empleadoRepository.save(empleado);

        } catch (ErrorServicioSoapException e) {
            throw new ErrorServicioSoapException("Error al comunicar con el servicio soap: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error desconocido al procesar el empleado: " + e.getMessage());
        }
    }
}

