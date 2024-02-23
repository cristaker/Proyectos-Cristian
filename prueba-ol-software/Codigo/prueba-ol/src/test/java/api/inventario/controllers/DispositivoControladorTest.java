package api.inventario.controllers;

import api.inventario.models.Dispositivo;
import api.inventario.service.DispositivoServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class DispositivoControladorTest {

    @Mock
    private DispositivoServicio dispositivoServicio;

    @InjectMocks
    private DispositivoControlador dispositivoControlador;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testObtenerDispositivoPorId() {
        Long id = 1L;
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setId(id);
        when(dispositivoServicio.obtenerDispositivoPorId(id)).thenReturn(dispositivo);

        ResponseEntity<Dispositivo> response = dispositivoControlador.obtenerDispositivoPorId(id);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(dispositivo, response.getBody());
    }

    @Test
    void testCrearDispositivo() {
        Dispositivo dispositivo = new Dispositivo();
        Dispositivo nuevoDispositivo = new Dispositivo();
        when(dispositivoServicio.crearDispositivo(dispositivo)).thenReturn(nuevoDispositivo);

        ResponseEntity<Dispositivo> response = dispositivoControlador.crearDispositivo(dispositivo);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(nuevoDispositivo, response.getBody());
    }

    @Test
    void testActualizarDispositivo() {
        Long id = 1L;
        Dispositivo dispositivo = new Dispositivo();
        when(dispositivoServicio.actualizarDispositivo(id, dispositivo)).thenReturn(dispositivo);

        ResponseEntity<Dispositivo> response = dispositivoControlador.actualizarDispositivo(id, dispositivo);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(dispositivo, response.getBody());
    }

    @Test
    void testEliminarDispositivo() {
        Long id = 1L;

        ResponseEntity<?> response = dispositivoControlador.eliminarDispositivo(id);

        verify(dispositivoServicio, times(1)).eliminarDispositivo(id);
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }
}

