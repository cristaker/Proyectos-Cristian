package api.inventario.models;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportePdfRequestTest {

    private static Validator validator;

    @BeforeAll
    static void setup() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void testToString() {
        List<DatosReportes> data = Collections.emptyList();
        String fileName = "test.pdf";

        ReportePdfRequest request = new ReportePdfRequest();
        request.setData(data);
        request.setFileName(fileName);

        String expectedToString = "ReportePdfRequest{data=[], fileName='test.pdf'}";
        assertEquals(expectedToString, request.toString());
    }

    @Test
    public void testValidRequest() {
        List<DatosReportes> data = Collections.emptyList();
        String fileName = "test.pdf";

        ReportePdfRequest request = new ReportePdfRequest();
        request.setData(data);
        request.setFileName(fileName);

        Set<ConstraintViolation<ReportePdfRequest>> violations = validator.validate(request);
        assertEquals(0, violations.size());
    }

    @Test
    public void testDataNotNull() {
        List<DatosReportes> data = null;
        String fileName = "test.pdf";

        ReportePdfRequest request = new ReportePdfRequest();
        request.setData(data);
        request.setFileName(fileName);

        Set<ConstraintViolation<ReportePdfRequest>> violations = validator.validate(request);
        assertEquals(1, violations.size());
        assertEquals("data", violations.iterator().next().getPropertyPath().toString());
    }

    @Test
    public void testFileNameNotBlank() {
        List<DatosReportes> data = Collections.emptyList();
        String fileName = "";

        ReportePdfRequest request = new ReportePdfRequest();
        request.setData(data);
        request.setFileName(fileName);

        Set<ConstraintViolation<ReportePdfRequest>> violations = validator.validate(request);
        assertEquals(1, violations.size());
        assertEquals("fileName", violations.iterator().next().getPropertyPath().toString());
    }
}

