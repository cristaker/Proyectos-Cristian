package api.inventario.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispositivoTest {

    @Test
    public void testGetterAndSetter() {
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setId(1L);
        dispositivo.setNombre("Nombre Dispositivo");
        dispositivo.setEstado(Estado.ACTIVO);

        assertEquals(1L, dispositivo.getId());
        assertEquals("Nombre Dispositivo", dispositivo.getNombre());
        assertEquals(Estado.ACTIVO, dispositivo.getEstado());
    }
}

