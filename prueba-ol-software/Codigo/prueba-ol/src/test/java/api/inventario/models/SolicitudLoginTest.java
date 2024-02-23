package api.inventario.models;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolicitudLoginTest {

    private static Validator validator;

    @BeforeAll
    static void setup() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void testValidSolicitudLogin() {
        SolicitudLogin solicitudLogin = new SolicitudLogin();
        solicitudLogin.setId(1L);
        solicitudLogin.setUser("testuser");
        solicitudLogin.setPassword("testpassword");

        Set<ConstraintViolation<SolicitudLogin>> violations = validator.validate(solicitudLogin);
        assertEquals(0, violations.size());
    }

    @Test
    public void testPasswordNotNull() {
        SolicitudLogin solicitudLogin = new SolicitudLogin();
        solicitudLogin.setId(1L);
        solicitudLogin.setUser("testuser");
        solicitudLogin.setPassword(null);

        Set<ConstraintViolation<SolicitudLogin>> violations = validator.validate(solicitudLogin);
        assertEquals(1, violations.size());
        assertEquals("password", violations.iterator().next().getPropertyPath().toString());
    }

    @Test
    public void testUsernameNotNull() {
        SolicitudLogin solicitudLogin = new SolicitudLogin();
        solicitudLogin.setId(1L);
        solicitudLogin.setUser(null);
        solicitudLogin.setPassword("testpassword");

        Set<ConstraintViolation<SolicitudLogin>> violations = validator.validate(solicitudLogin);
        assertEquals(0, violations.size());
    }
}

