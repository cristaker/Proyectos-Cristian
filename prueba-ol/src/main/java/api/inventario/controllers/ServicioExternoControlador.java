package api.inventario.controllers;

import api.inventario.Exceptions.ExternalServiceException;
import api.inventario.models.SolicitudLogin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServicioExternoControlador {

    private final RestTemplate restTemplate;

    public ServicioExternoControlador(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String login(SolicitudLogin request) {
        ResponseEntity<String> response = restTemplate.postForEntity("https://dev.olsoftware.com:5670/api/aspirantes/login", request, String.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            throw new ExternalServiceException("Error al iniciar sesión en el servicio externo");
        }
    }
}

