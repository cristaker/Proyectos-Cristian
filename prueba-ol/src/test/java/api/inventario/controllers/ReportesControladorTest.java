package api.inventario.controllers;

import api.inventario.models.ReporteCsvRequest;
import api.inventario.models.ReportePdfRequest;
import api.inventario.service.ReportesServicio;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReportesControladorTest {

    @Mock
    private ReportesServicio reportesServicio;

    @InjectMocks
    private ReportesControlador reportesControlador;

    private Validator validator;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void generateCsvReporteSolicitudExitosa() {
        ReporteCsvRequest request = new ReporteCsvRequest("data", "filename.csv");
        HttpServletResponse response = new MockHttpServletResponse();

        reportesControlador.generateCsvReport(request, response);

        verify(reportesServicio, times(1)).generarReporteCSV(request.getData(), request.getFileName(), response);
    }

    @Test
    void generatePdfReport_ValidRequest_Success() {
        ReportePdfRequest request = new ReportePdfRequest("data", "filename.pdf");
        HttpServletResponse response = new MockHttpServletResponse();

        reportesControlador.generatePdfReport(request, response);

        verify(reportesServicio, times(1)).generarReportePDF(request.getData(), request.getFileName(), response);
    }
}

