package api.inventario.controllers;

import api.inventario.models.TipoDispositivo;
import api.inventario.service.TipoDispositivoServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class TipoDispositivoControladorTest {

    private TipoDispositivoServicio tipoDispositivoServicioMock;
    private TipoDispositivoControlador tipoDispositivoControlador;

    @BeforeEach
    void setUp() {
        tipoDispositivoServicioMock = mock(TipoDispositivoServicio.class);
        tipoDispositivoControlador = new TipoDispositivoControlador(tipoDispositivoServicioMock);
    }

    @Test
    void obtenerTodosTiposDispositivosDeberiaRetornarListaDeTiposDispositivos() {
        List<TipoDispositivo> tiposDispositivos = Arrays.asList(
                new TipoDispositivo(1L, "Tipo 1"),
                new TipoDispositivo(2L, "Tipo 2")
        );
        when(tipoDispositivoServicioMock.obtenerTodos()).thenReturn(tiposDispositivos);

        ResponseEntity<List<TipoDispositivo>> response = tipoDispositivoControlador.obtenerTodosTiposDispositivos();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(tiposDispositivos, response.getBody());
    }

    @Test
    void obtenerTipoDispositivoPorIdDeberiaRetornarTipoDispositivo() {
        long id = 1L;
        TipoDispositivo tipoDispositivo = new TipoDispositivo(id, "Tipo 1");
        when(tipoDispositivoServicioMock.obtenerPorId(id)).thenReturn(tipoDispositivo);

        ResponseEntity<TipoDispositivo> response = tipoDispositivoControlador.obtenerTipoDispositivoPorId(id);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(tipoDispositivo, response.getBody());
    }

    @Test
    void crearTipoDispositivoDeberiaRetornarNuevoTipoDispositivo() {
        TipoDispositivo tipoDispositivoEntrada = new TipoDispositivo(1L, "Nuevo Tipo");
        when(tipoDispositivoServicioMock.crear(tipoDispositivoEntrada)).thenReturn(tipoDispositivoEntrada);

        ResponseEntity<TipoDispositivo> response = tipoDispositivoControlador.crearTipoDispositivo(tipoDispositivoEntrada);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(tipoDispositivoEntrada, response.getBody());
    }

    @Test
    void actualizarTipoDispositivoDeberiaRetornarTipoDispositivoActualizado() {
        long id = 1L;
        TipoDispositivo tipoDispositivoActualizado = new TipoDispositivo(id, "Tipo Actualizado");
        when(tipoDispositivoServicioMock.actualizar(id, tipoDispositivoActualizado)).thenReturn(tipoDispositivoActualizado);

        ResponseEntity<TipoDispositivo> response = tipoDispositivoControlador.actualizarTipoDispositivo(id, tipoDispositivoActualizado);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(tipoDispositivoActualizado, response.getBody());
    }

    @Test
    void eliminarTipoDispositivoDeberiaRetornarNoContent() {
        long id = 1L;

        ResponseEntity<?> response = tipoDispositivoControlador.eliminarTipoDispositivo(id);

        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        assertNull(response.getBody());
        verify(tipoDispositivoServicioMock, times(1)).eliminar(id);
    }
}


