package api.inventario.models;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    private static Validator validator;

    @BeforeAll
    static void setup() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void testValidUsuario() {
        Usuario usuario = new Usuario();
        usuario.setIdentificador("1234567890");
        usuario.setPrimerNombre("cristian");
        usuario.setPrimerApellido("sanchez");
        usuario.setCorreoElectronico("csanchez@example.com");
        usuario.setTelefono("1234567890");
        usuario.setUsuario("csanchez");
        usuario.setContrasena("12345678");
        usuario.setRol("admin");
        usuario.setGrupo("grupo");

        Set<ConstraintViolation<Usuario>> violations = validator.validate(usuario);
        assertEquals(0, violations.size());
    }

    @Test
    public void testBlankPrimerNombre() {
        Usuario usuario = new Usuario();
        usuario.setIdentificador("1234567890");
        usuario.setPrimerNombre("");
        usuario.setPrimerApellido("sanchez");
        usuario.setCorreoElectronico("csanchez@example.com");
        usuario.setTelefono("1234567890");
        usuario.setUsuario("csanchez");
        usuario.setContrasena("12345678");
        usuario.setRol("admin");
        usuario.setGrupo("grupo");

        Set<ConstraintViolation<Usuario>> violations = validator.validate(usuario);
        assertEquals(1, violations.size());
        assertEquals("primerNombre", violations.iterator().next().getPropertyPath().toString());
    }

    @Test
    public void testNullUsuario() {
        Usuario usuario = new Usuario();
        usuario.setIdentificador("1234567890");
        usuario.setPrimerNombre("cristian");
        usuario.setPrimerApellido("sanchez");
        usuario.setCorreoElectronico("csanchez@example.com");
        usuario.setTelefono("1234567890");
        usuario.setContrasena("password");
        usuario.setRol("admin");
        usuario.setGrupo("grupo");

        Set<ConstraintViolation<Usuario>> violations = validator.validate(usuario);
        assertEquals(1, violations.size());
        assertEquals("usuario", violations.iterator().next().getPropertyPath().toString());
    }
}
