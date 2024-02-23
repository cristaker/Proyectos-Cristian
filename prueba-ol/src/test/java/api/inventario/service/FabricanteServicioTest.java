package api.inventario.service;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.models.Fabricante;
import api.inventario.repository.FabricanteRepositorio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FabricanteServicioTest {

    @Mock
    private FabricanteRepositorio fabricanteRepositorio;

    @InjectMocks
    private FabricanteServicio fabricanteServicio;

    @Test
    public void testObtenerTodosLosFabricantes() {
        List<Fabricante> fabricantes = List.of(new Fabricante(), new Fabricante());
        when(fabricanteRepositorio.findAll()).thenReturn(fabricantes);

        List<Fabricante> fabricantesObtenidos = fabricanteServicio.obtenerTodosLosFabricantes();

        assertEquals(fabricantes, fabricantesObtenidos);
        verify(fabricanteRepositorio, times(1)).findAll();
    }

    @Test
    public void testObtenerFabricanteExistentePorId() {
        Fabricante fabricante = new Fabricante();
        fabricante.setId(1L);

        when(fabricanteRepositorio.findById(1L)).thenReturn(Optional.of(fabricante));

        Optional<Fabricante> fabricanteObtenido = fabricanteServicio.obtenerFabricantePorId(1L);

        assertTrue(fabricanteObtenido.isPresent());
        assertEquals(fabricante, fabricanteObtenido.get());
        verify(fabricanteRepositorio, times(1)).findById(1L);
    }

    @Test
    public void testCrearFabricante() {
        Fabricante fabricante = new Fabricante();
        fabricante.setId(1L);

        when(fabricanteRepositorio.save(fabricante)).thenReturn(fabricante);

        Fabricante fabricanteCreado = fabricanteServicio.crearFabricante(fabricante);

        assertEquals(fabricante, fabricanteCreado);
        verify(fabricanteRepositorio, times(1)).save(fabricante);
    }

    @Test
    public void testActualizarFabricanteExistente() {
        Fabricante fabricanteExistente = new Fabricante();
        fabricanteExistente.setId(1L);
        fabricanteExistente.setNombre("Fabricante Existente");

        Fabricante fabricanteActualizado = new Fabricante();
        fabricanteActualizado.setId(1L);
        fabricanteActualizado.setNombre("Fabricante Actualizado");

        when(fabricanteRepositorio.findById(1L)).thenReturn(Optional.of(fabricanteExistente));
        when(fabricanteRepositorio.save(fabricanteExistente)).thenReturn(fabricanteActualizado);

        Fabricante fabricanteResultado = fabricanteServicio.actualizarFabricante(1L, fabricanteActualizado);

        assertEquals(fabricanteActualizado, fabricanteResultado);
        verify(fabricanteRepositorio, times(1)).findById(1L);
        verify(fabricanteRepositorio, times(1)).save(fabricanteExistente);
    }

    @Test
    public void testActualizarFabricanteNoExistente() {
        Fabricante fabricanteNoExistente = new Fabricante();
        fabricanteNoExistente.setId(1L);
        fabricanteNoExistente.setNombre("Fabricante No Existente");

        when(fabricanteRepositorio.findById(1L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> fabricanteServicio.actualizarFabricante(1L, fabricanteNoExistente));
        verify(fabricanteRepositorio, times(1)).findById(1L);
        verify(fabricanteRepositorio, never()).save(fabricanteNoExistente);
    }

    @Test
    public void testEliminarFabricante() {
        fabricanteServicio.eliminarFabricante(1L);
        verify(fabricanteRepositorio, times(1)).deleteById(1L);
    }
}

