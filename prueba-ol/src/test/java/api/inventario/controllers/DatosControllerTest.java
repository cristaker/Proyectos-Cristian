package api.inventario.controllers;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.models.Datos;
import api.inventario.models.SolicitudLogin;
import api.inventario.repository.DatosRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class DatosControllerTest {

    @Mock
    private ServicioExternoControlador externalService;

    @Mock
    private DatosRepository datosRepository;

    @InjectMocks
    private DatosController datosController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testLogin() {
        SolicitudLogin request = new SolicitudLogin();
        String jwtToken = "mockedToken";
        when(externalService.login(request)).thenReturn(jwtToken);

        ResponseEntity<String> response = datosController.login(request);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(jwtToken, response.getBody());
    }

    @Test
    void testObtenerDatos() {
        Long id = 1L;
        Datos datos = new Datos();
        datos.setId(id);
        Optional<Datos> optionalDatos = Optional.of(datos);
        when(datosRepository.findById(id)).thenReturn(optionalDatos);

        ResponseEntity<Datos> response = datosController.obtenerDatos(id);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(datos, response.getBody());
    }

    @Test
    void testObtenerDatosNoEncontrado() {
        Long id = 1L;
        when(datosRepository.findById(id)).thenReturn(Optional.empty());

        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> {
            datosController.obtenerDatos(id);
        });

        assertEquals("Datos no encontrados con id: " + id, exception.getMessage());
    }

    @Test
    void testCrearDatos() {
        Datos datos = new Datos();
        Datos nuevoDatos = new Datos();
        when(datosRepository.save(datos)).thenReturn(nuevoDatos);

        ResponseEntity<Datos> response = datosController.crearDatos(datos);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(nuevoDatos, response.getBody());
    }
}

