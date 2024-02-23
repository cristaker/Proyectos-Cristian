package api.inventario.controllers;

import api.inventario.models.SolicitudLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private ServicioExternoControlador externalService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody SolicitudLogin request) {
        String jwtToken = externalService.login(request);
        return ResponseEntity.ok(jwtToken);
    }
}

