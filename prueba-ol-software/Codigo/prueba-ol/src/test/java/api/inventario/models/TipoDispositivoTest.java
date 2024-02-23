package api.inventario.models;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipoDispositivoTest {

    private static Validator validator;

    @BeforeAll
    static void setup() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void testValidTipoDispositivo() {
        TipoDispositivo tipoDispositivo = new TipoDispositivo();
        tipoDispositivo.setId(1L);
        tipoDispositivo.setNombre("Nombre de Tipo");

        Set<ConstraintViolation<TipoDispositivo>> violations = validator.validate(tipoDispositivo);
        assertEquals(0, violations.size());
    }

    @Test
    public void testNombreNotBlank() {
        TipoDispositivo tipoDispositivo = new TipoDispositivo();
        tipoDispositivo.setId(1L);
        tipoDispositivo.setNombre("");

        Set<ConstraintViolation<TipoDispositivo>> violations = validator.validate(tipoDispositivo);
        assertEquals(1, violations.size());
        assertEquals("nombre", violations.iterator().next().getPropertyPath().toString());
    }

    @Test
    public void testIdNotNull() {
        TipoDispositivo tipoDispositivo = new TipoDispositivo();
        tipoDispositivo.setId(null);
        tipoDispositivo.setNombre("Nombre de Tipo");

        Set<ConstraintViolation<TipoDispositivo>> violations = validator.validate(tipoDispositivo);
        assertEquals(0, violations.size());
    }
}

