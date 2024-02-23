package api.inventario.service;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.models.Dispositivo;
import api.inventario.repository.DispositivoRepositorio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DispositivoServicioTest {

    @Mock
    private DispositivoRepositorio dispositivoRepositorio;

    @InjectMocks
    private DispositivoServicio dispositivoServicio;

    @Test
    public void testObtenerDispositivoExistentePorId() {
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setId(1L);
        dispositivo.setNombre("Dispositivo de prueba");

        when(dispositivoRepositorio.findById(1L)).thenReturn(Optional.of(dispositivo));

        Dispositivo dispositivoObtenido = dispositivoServicio.obtenerDispositivoPorId(1L);

        assertEquals(dispositivo, dispositivoObtenido);
        verify(dispositivoRepositorio, times(1)).findById(1L);
    }

    @Test
    public void testObtenerDispositivoNoExistentePorId() {
        when(dispositivoRepositorio.findById(1L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> dispositivoServicio.obtenerDispositivoPorId(1L));
        verify(dispositivoRepositorio, times(1)).findById(1L);
    }

    @Test
    public void testCrearDispositivo() {
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setId(1L);
        dispositivo.setNombre("Dispositivo de prueba");

        when(dispositivoRepositorio.save(dispositivo)).thenReturn(dispositivo);

        Dispositivo dispositivoCreado = dispositivoServicio.crearDispositivo(dispositivo);

        assertEquals(dispositivo, dispositivoCreado);
        verify(dispositivoRepositorio, times(1)).save(dispositivo);
    }

    @Test
    public void testActualizarDispositivoExistente() {
        Dispositivo dispositivoExistente = new Dispositivo();
        dispositivoExistente.setId(1L);
        dispositivoExistente.setNombre("Dispositivo existente");

        Dispositivo dispositivoActualizado = new Dispositivo();
        dispositivoActualizado.setId(1L);
        dispositivoActualizado.setNombre("Dispositivo actualizado");

        when(dispositivoRepositorio.findById(1L)).thenReturn(Optional.of(dispositivoExistente));
        when(dispositivoRepositorio.save(dispositivoExistente)).thenReturn(dispositivoActualizado);

        Dispositivo dispositivoResultado = dispositivoServicio.actualizarDispositivo(1L, dispositivoActualizado);

        assertEquals(dispositivoActualizado, dispositivoResultado);
        verify(dispositivoRepositorio, times(1)).findById(1L);
        verify(dispositivoRepositorio, times(1)).save(dispositivoExistente);
    }

    @Test
    public void testActualizarDispositivoNoExistente() {
        Dispositivo dispositivoNoExistente = new Dispositivo();
        dispositivoNoExistente.setId(1L);
        dispositivoNoExistente.setNombre("Dispositivo no existente");

        when(dispositivoRepositorio.findById(1L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> dispositivoServicio.actualizarDispositivo(1L, dispositivoNoExistente));
        verify(dispositivoRepositorio, times(1)).findById(1L);
        verify(dispositivoRepositorio, never()).save(dispositivoNoExistente);
    }

    @Test
    public void testEliminarDispositivo() {
        dispositivoServicio.eliminarDispositivo(1L);
        verify(dispositivoRepositorio, times(1)).deleteById(1L);
    }
}

