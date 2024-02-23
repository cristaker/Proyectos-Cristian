package api.inventario.models;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteCsvRequestTest {

    private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @Test
    public void testToString() {
        List<DatosReportes> data = Collections.emptyList();
        String fileName = "test.csv";

        ReporteCsvRequest request = new ReporteCsvRequest();
        request.setData(data);
        request.setFileName(fileName);

        String expectedToString = "ReporteCsvRequest{data=[], fileName='test.csv'}";
        assertEquals(expectedToString, request.toString());
    }

    @Test
    public void testValidRequest() {
        List<DatosReportes> data = Collections.emptyList();
        String fileName = "test.csv";

        ReporteCsvRequest request = new ReporteCsvRequest();
        request.setData(data);
        request.setFileName(fileName);

        Set<ConstraintViolation<ReporteCsvRequest>> violations = validator.validate(request);
        assertEquals(0, violations.size());
    }

    @Test
    public void testDataNotNull() {
        List<DatosReportes> data = null;
        String fileName = "test.csv";

        ReporteCsvRequest request = new ReporteCsvRequest();
        request.setData(data);
        request.setFileName(fileName);

        Set<ConstraintViolation<ReporteCsvRequest>> violations = validator.validate(request);
        assertEquals(1, violations.size());
        assertEquals("data", violations.iterator().next().getPropertyPath().toString());
    }

    @Test
    public void testFileNameNotBlank() {
        List<DatosReportes> data = Collections.emptyList();
        String fileName = "";

        ReporteCsvRequest request = new ReporteCsvRequest();
        request.setData(data);
        request.setFileName(fileName);

        Set<ConstraintViolation<ReporteCsvRequest>> violations = validator.validate(request);
        assertEquals(1, violations.size());
        assertEquals("fileName", violations.iterator().next().getPropertyPath().toString());
    }
}


