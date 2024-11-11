package com.parameta.controllers;

import com.parameta.exceptions.EmpleadoNoMayorDeEdadException;
import com.parameta.exceptions.ErrorServicioSoapException;
import com.parameta.models.Empleado;
import com.parameta.models.ErrorResponse;
import com.parameta.models.TiempoVinculacion;
import com.parameta.services.EmpleadoService;
import com.parameta.services.SoapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/parameta")
@Validated
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private SoapService soapService;

    @GetMapping("/validate-and-save")
    public ResponseEntity<?> validarYGuardar(@Valid @RequestBody Empleado empleado) {

        try {

            if (!empleadoService.esMayorDeEdad(empleado.getFechaNacimiento())) {
                throw new EmpleadoNoMayorDeEdadException("El empleado debe ser mayor de 18 años");
            }

            soapService.enviarYGuardarEmpleado(empleado);

            Map<String, Object> response = new HashMap<>();
            response.put("empleado", empleado);

            Period edadPeriod = empleadoService.calcularEdad(empleado.getFechaNacimiento());
            response.put("edad", new TiempoVinculacion(edadPeriod));

            Period tiempoVinculacionPeriod = empleadoService.calcularTiempoVinculacion(empleado.getFechaVinculacion());
            response.put("tiempoVinculacion", new TiempoVinculacion(tiempoVinculacionPeriod));

            return ResponseEntity.ok(response);

        } catch (EmpleadoNoMayorDeEdadException ex) {
            ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);

        } catch (ErrorServicioSoapException ex) {
            ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);

        } catch (Exception ex) {
            ErrorResponse errorResponse = new ErrorResponse("Ocurrió un error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
}

