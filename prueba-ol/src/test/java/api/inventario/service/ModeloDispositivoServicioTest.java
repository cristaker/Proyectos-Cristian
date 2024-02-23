package api.inventario.service;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.models.ModeloDispositivo;
import api.inventario.repository.ModeloDispositivoRepositorio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ModeloDispositivoServicioTest {

    @Mock
    private ModeloDispositivoRepositorio modeloDispositivoRepositorio;

    private ModeloDispositivoServicio modeloDispositivoServicio;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        modeloDispositivoServicio = new ModeloDispositivoServicio(modeloDispositivoRepositorio);
    }

    @Test
    public void testObtenerModeloExistentePorId() {
        ModeloDispositivo modeloDispositivo = new ModeloDispositivo();
        when(modeloDispositivoRepositorio.findById(1L)).thenReturn(Optional.of(modeloDispositivo));

        ModeloDispositivo resultado = modeloDispositivoServicio.obtenerModeloPorId(1L);

        assertNotNull(resultado);
        assertEquals(modeloDispositivo, resultado);
        verify(modeloDispositivoRepositorio, times(1)).findById(1L);
    }

    @Test
    public void testObtenerModeloNoExistentePorId() {
        when(modeloDispositivoRepositorio.findById(1L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> modeloDispositivoServicio.obtenerModeloPorId(1L));
        verify(modeloDispositivoRepositorio, times(1)).findById(1L);
    }

    @Test
    public void testCrearModelo() {
        ModeloDispositivo modeloDispositivo = new ModeloDispositivo();
        when(modeloDispositivoRepositorio.save(modeloDispositivo)).thenReturn(modeloDispositivo);

        ModeloDispositivo resultado = modeloDispositivoServicio.crearModelo(modeloDispositivo);

        assertNotNull(resultado);
        assertEquals(modeloDispositivo, resultado);
        verify(modeloDispositivoRepositorio, times(1)).save(modeloDispositivo);
    }

    @Test
    public void testEliminarModelo() {
        modeloDispositivoServicio.eliminarModelo(1L);
        verify(modeloDispositivoRepositorio, times(1)).deleteById(1L);
    }
}

