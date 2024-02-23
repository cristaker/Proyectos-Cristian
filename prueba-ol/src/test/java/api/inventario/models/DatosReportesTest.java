package api.inventario.models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatosReportesTest {

    @Test
    void constructorYGetterSetterDeberianFuncionarCorrectamente() {
        Long id = 1L;
        String column1 = "Columna1";
        String column2 = "Columna2";
        String column3 = "Columna3";

        DatosReportes datosReportes = new DatosReportes(id, column1, column2, column3);

        assertEquals(id, datosReportes.getId());
        assertEquals(column1, datosReportes.getColumn1());
        assertEquals(column2, datosReportes.getColumn2());
        assertEquals(column3, datosReportes.getColumn3());

        Long newId = 2L;
        String newColumn1 = "NewColumn1";
        String newColumn2 = "NewColumn2";
        String newColumn3 = "NewColumn3";

        datosReportes.setId(newId);
        datosReportes.setColumn1(newColumn1);
        datosReportes.setColumn2(newColumn2);
        datosReportes.setColumn3(newColumn3);

        assertEquals(newId, datosReportes.getId());
        assertEquals(newColumn1, datosReportes.getColumn1());
        assertEquals(newColumn2, datosReportes.getColumn2());
        assertEquals(newColumn3, datosReportes.getColumn3());
    }

    @Test
    void equalsYHashCodeDeberianFuncionarCorrectamente() {
        DatosReportes datosReportes1 = new DatosReportes(1L, "Columna1", "Columna2", "Columna3");
        DatosReportes datosReportes2 = new DatosReportes(1L, "Columna1", "Columna2", "Columna3");
        DatosReportes datosReportes3 = new DatosReportes(2L, "Columna4", "Columna5", "Columna6");

        assertEquals(datosReportes1, datosReportes2);
        assertEquals(datosReportes1.hashCode(), datosReportes2.hashCode());

        assertEquals(datosReportes1.hashCode(), datosReportes1.hashCode());
        assertEquals(datosReportes1.equals(datosReportes1), true);

        assertEquals(datosReportes1.equals(datosReportes2), datosReportes2.equals(datosReportes1));

        assertEquals(datosReportes1.equals(datosReportes2) && datosReportes2.equals(datosReportes3), datosReportes1.equals(datosReportes3));

        assertEquals(datosReportes1.equals(null), false);
    }

    @Test
    void toStringDeberiaRetornarCadenaFormateadaCorrectamente() {
        DatosReportes datosReportes = new DatosReportes(1L, "Columna1", "Columna2", "Columna3");

        String result = datosReportes.toString();

        assertEquals("DatosReportes(id=1, column1='Columna1', column2='Columna2', column3='Columna3')", result);
    }
}

