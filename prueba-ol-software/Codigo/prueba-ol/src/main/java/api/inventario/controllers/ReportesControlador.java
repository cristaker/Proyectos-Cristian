package api.inventario.controllers;

import api.inventario.models.ReporteCsvRequest;
import api.inventario.models.ReportePdfRequest;
import api.inventario.service.ReportesServicio;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reportes")
public class ReportesControlador {

    @Autowired
    private ReportesServicio reportesServicio;

    @PostMapping("/csv")
    public void generateCsvReport(@Valid @RequestBody ReporteCsvRequest request,
                                  HttpServletResponse response) {
        reportesServicio.generarReporteCSV(request.getData(),request.getFileName(), response);
    }

    @PostMapping("/pdf")
    public void generatePdfReport(@Valid @RequestBody ReportePdfRequest request, HttpServletResponse response) {
        reportesServicio.generarReportePDF(request.getData(), request.getFileName(), response);
    }
}


