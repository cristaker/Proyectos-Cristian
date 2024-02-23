package api.inventario.Exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExternalServiceExceptionTest {

    @Test
    public void testConstructor() {
        String message = "Error en el servicio externo";
        ExternalServiceException exception = new ExternalServiceException(message);

        assertEquals(message, exception.getMessage());
    }
}

