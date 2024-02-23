package api.inventario.models;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModeloDispositivoTest {

    @Mock
    private Fabricante fabricanteMock;

    @Test
    public void testGetterSetter() {
        Long id = 1L;
        String nombre = "Modelo1";

        ModeloDispositivo modelo = new ModeloDispositivo();
        modelo.setId(id);
        modelo.setNombre(nombre);
        modelo.setFabricante(fabricanteMock);

        assertEquals(id, modelo.getId());
        assertEquals(nombre, modelo.getNombre());
        assertEquals(fabricanteMock, modelo.getFabricante());
    }

    @Test
    public void testToString() {
        Long id = 1L;
        String nombre = "Modelo1";

        ModeloDispositivo modelo = new ModeloDispositivo();
        modelo.setId(id);
        modelo.setNombre(nombre);
        modelo.setFabricante(fabricanteMock);

        String expectedToString = "ModeloDispositivo{id=1, nombre='Modelo1', fabricante=" + fabricanteMock + "}";
        assertEquals(expectedToString, modelo.toString());
    }
}

