package api.inventario.controllers;

import api.inventario.models.ModeloDispositivo;
import api.inventario.service.ModeloDispositivoServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ModelosDispositivosControladorTest {

    @Mock
    private ModeloDispositivoServicio modeloDispositivoServicio;

    @InjectMocks
    private ModelosDispositivosControlador modelosDispositivosControlador;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testObtenerModeloPorId() {
        Long id = 1L;
        ModeloDispositivo modeloDispositivo = new ModeloDispositivo();
        modeloDispositivo.setId(id);
        when(modeloDispositivoServicio.obtenerModeloPorId(id)).thenReturn(modeloDispositivo);

        ResponseEntity<ModeloDispositivo> response = modelosDispositivosControlador.obtenerModeloPorId(id);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(modeloDispositivo, response.getBody());
        verify(modeloDispositivoServicio, times(1)).obtenerModeloPorId(id);
    }

    @Test
    void testCrearModelo() {
        ModeloDispositivo modeloDispositivo = new ModeloDispositivo();
        when(modeloDispositivoServicio.crearModelo(modeloDispositivo)).thenReturn(modeloDispositivo);

        ResponseEntity<ModeloDispositivo> response = modelosDispositivosControlador.crearModelo(modeloDispositivo);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(modeloDispositivo, response.getBody());
        verify(modeloDispositivoServicio, times(1)).crearModelo(modeloDispositivo);
    }

    @Test
    void testActualizarModelo() {
        Long id = 1L;
        ModeloDispositivo modeloDispositivo = new ModeloDispositivo();
        modeloDispositivo.setId(id);
        when(modeloDispositivoServicio.actualizarModelo(id, modeloDispositivo)).thenReturn(modeloDispositivo);

        ResponseEntity<ModeloDispositivo> response = modelosDispositivosControlador.actualizarModelo(id, modeloDispositivo);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(modeloDispositivo, response.getBody());
        verify(modeloDispositivoServicio, times(1)).actualizarModelo(id, modeloDispositivo);
    }

    @Test
    void testEliminarModelo() {
        Long id = 1L;

        ResponseEntity<?> response = modelosDispositivosControlador.eliminarModelo(id);

        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(modeloDispositivoServicio, times(1)).eliminarModelo(id);
    }
}

