package api.inventario.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstadoTest {

    @Test
    public void testCodigo() {
        assertEquals("A", Estado.ACTIVO.getCodigo());
        assertEquals("I", Estado.INACTIVO.getCodigo());
    }

    @Test
    public void testEnumValueOf() {
        assertEquals(Estado.ACTIVO, Estado.valueOf("ACTIVO"));
        assertEquals(Estado.INACTIVO, Estado.valueOf("INACTIVO"));
    }

    @Test
    public void testEnumValues() {
        Estado[] estados = Estado.values();
        assertEquals(2, estados.length);
        assertEquals(Estado.ACTIVO, estados[0]);
        assertEquals(Estado.INACTIVO, estados[1]);
    }
}

