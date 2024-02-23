package api.inventario.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatosTest {

    @Test
    void constructorYGetterSetterDeberianFuncionarCorrectamente() {
        Long id = 1L;
        String nombre = "Nombre1";
        String descripcion = "Descripción1";

        Datos datos = new Datos();
        datos.setId(id);
        datos.setNombre(nombre);
        datos.setDescripcion(descripcion);

        assertEquals(id, datos.getId());
        assertEquals(nombre, datos.getNombre());
        assertEquals(descripcion, datos.getDescripcion());
    }

    @Test
    void notNullTest() {
        Datos datos = new Datos();

        assertNotNull(datos);
    }
}

