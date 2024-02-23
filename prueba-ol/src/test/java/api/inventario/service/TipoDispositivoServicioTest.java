package api.inventario.service;

import api.inventario.models.TipoDispositivo;
import api.inventario.repository.TipoDispositivoRepositorio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class TipoDispositivoServicioTest {

    @Mock
    private TipoDispositivoRepositorio tipoDispositivoRepositorio;

    @InjectMocks
    private TipoDispositivoServicio tipoDispositivoServicio;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testObtenerTodos() {
        List<TipoDispositivo> tipoDispositivos = new ArrayList<>();
        tipoDispositivos.add(new TipoDispositivo(1L, "Tipo 1"));
        tipoDispositivos.add(new TipoDispositivo(2L, "Tipo 2"));

        when(tipoDispositivoRepositorio.findAll()).thenReturn(tipoDispositivos);

        List<TipoDispositivo> result = tipoDispositivoServicio.obtenerTodos();

        assertEquals(2, result.size());
        verify(tipoDispositivoRepositorio, times(1)).findAll();
    }

    @Test
    public void testObtenerPorIdExistente() {
        Long id = 1L;
        TipoDispositivo tipoDispositivo = new TipoDispositivo(id, "Tipo 1");

        when(tipoDispositivoRepositorio.findById(id)).thenReturn(Optional.of(tipoDispositivo));

        TipoDispositivo result = tipoDispositivoServicio.obtenerPorId(id);

        assertEquals(tipoDispositivo, result);
        verify(tipoDispositivoRepositorio, times(1)).findById(id);
    }

    @Test
    public void testObtenerPorIdNoExistente() {
        Long id = 1L;

        when(tipoDispositivoRepositorio.findById(id)).thenReturn(Optional.empty());

        TipoDispositivo result = tipoDispositivoServicio.obtenerPorId(id);

        assertNull(result);
        verify(tipoDispositivoRepositorio, times(1)).findById(id);
    }

    @Test
    public void testCrear() {
        TipoDispositivo tipoDispositivo = new TipoDispositivo(null, "Nuevo Tipo");

        when(tipoDispositivoRepositorio.save(tipoDispositivo)).thenReturn(tipoDispositivo);

        TipoDispositivo result = tipoDispositivoServicio.crear(tipoDispositivo);

        assertEquals(tipoDispositivo, result);
        verify(tipoDispositivoRepositorio, times(1)).save(tipoDispositivo);
    }

    @Test
    public void testActualizarExistente() {
        Long id = 1L;
        TipoDispositivo tipoDispositivo = new TipoDispositivo(id, "Tipo 1");

        when(tipoDispositivoRepositorio.existsById(id)).thenReturn(true);
        when(tipoDispositivoRepositorio.save(tipoDispositivo)).thenReturn(tipoDispositivo);

        TipoDispositivo result = tipoDispositivoServicio.actualizar(id, tipoDispositivo);

        assertEquals(tipoDispositivo, result);
        verify(tipoDispositivoRepositorio, times(1)).existsById(id);
        verify(tipoDispositivoRepositorio, times(1)).save(tipoDispositivo);
    }

    @Test
    public void testActualizarNoExistente() {
        Long id = 1L;
        TipoDispositivo tipoDispositivo = new TipoDispositivo(id, "Tipo 1");

        when(tipoDispositivoRepositorio.existsById(id)).thenReturn(false);

        TipoDispositivo result = tipoDispositivoServicio.actualizar(id, tipoDispositivo);

        assertNull(result);
        verify(tipoDispositivoRepositorio, times(1)).existsById(id);
        verify(tipoDispositivoRepositorio, never()).save(tipoDispositivo);
    }

    @Test
    public void testEliminar() {
        Long id = 1L;

        tipoDispositivoServicio.eliminar(id);

        verify(tipoDispositivoRepositorio, times(1)).deleteById(id);
    }
}

