package api.inventario.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricanteTest {

    @Test
    public void testConstructorAndGetters() {
        Long id = 1L;
        String nombre = "Fabricante1";
        Fabricante fabricante = new Fabricante();
        fabricante.setId(id);
        fabricante.setNombre(nombre);

        assertEquals(id, fabricante.getId());
        assertEquals(nombre, fabricante.getNombre());
    }

    @Test
    public void testToString() {
        Long id = 1L;
        String nombre = "Fabricante1";
        Fabricante fabricante = new Fabricante();
        fabricante.setId(id);
        fabricante.setNombre(nombre);

        String expectedToString = "Fabricante{id=1, nombre='Fabricante1'}";
        assertEquals(expectedToString, fabricante.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Fabricante fabricante1 = new Fabricante();
        fabricante1.setId(1L);
        fabricante1.setNombre("Fabricante1");

        Fabricante fabricante2 = new Fabricante();
        fabricante2.setId(1L);
        fabricante2.setNombre("Fabricante1");

        assertEquals(fabricante1, fabricante2);
        assertEquals(fabricante1.hashCode(), fabricante2.hashCode());
    }
}

