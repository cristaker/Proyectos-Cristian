package api.inventario.controllers;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.models.Fabricante;
import api.inventario.service.FabricanteServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class FabricanteControladorTest {

    @Mock
    private FabricanteServicio fabricanteServicio;

    @InjectMocks
    private FabricanteControlador fabricanteControlador;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testObtenerTodosLosFabricantes() {
        List<Fabricante> fabricantes = new ArrayList<>();
        when(fabricanteServicio.obtenerTodosLosFabricantes()).thenReturn(fabricantes);

        ResponseEntity<List<Fabricante>> response = fabricanteControlador.obtenerTodosLosFabricantes();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(fabricantes, response.getBody());
    }

    @Test
    void testObtenerFabricantePorIdExistente() {
        Long id = 1L;
        Fabricante fabricante = new Fabricante();
        fabricante.setId(id);
        when(fabricanteServicio.obtenerFabricantePorId(id)).thenReturn(Optional.of(fabricante));

        ResponseEntity<Fabricante> response = fabricanteControlador.obtenerFabricantePorId(id);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(fabricante, response.getBody());
    }

    @Test
    void testObtenerFabricantePorIdNoExistente() {
        Long id = 1L;
        when(fabricanteServicio.obtenerFabricantePorId(id)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> fabricanteControlador.obtenerFabricantePorId(id));
    }

    @Test
    void testCrearFabricante() {
        Fabricante fabricante = new Fabricante();
        Fabricante nuevoFabricante = new Fabricante();
        when(fabricanteServicio.crearFabricante(fabricante)).thenReturn(nuevoFabricante);

        ResponseEntity<Fabricante> response = fabricanteControlador.crearFabricante(fabricante);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(nuevoFabricante, response.getBody());
    }

    @Test
    void testActualizarFabricante() {
        Long id = 1L;
        Fabricante fabricante = new Fabricante();
        when(fabricanteServicio.actualizarFabricante(id, fabricante)).thenReturn(fabricante);

        ResponseEntity<Fabricante> response = fabricanteControlador.actualizarFabricante(id, fabricante);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(fabricante, response.getBody());
    }

    @Test
    void testEliminarFabricante() {
        Long id = 1L;

        ResponseEntity<?> response = fabricanteControlador.eliminarFabricante(id);

        verify(fabricanteServicio, times(1)).eliminarFabricante(id);
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }
}