package api.inventario.service;

import api.inventario.models.DatosReportes;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Service
public class ReportesServicio {

    public void generarReporteCSV(List<DatosReportes> data, String fileName, HttpServletResponse response) {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=" + StringUtils.cleanPath(fileName + ".csv"));

        try {
            PrintWriter writer = response.getWriter();
            writer.println("Column1,Column2,Column3");

            for (DatosReportes datosReportes : data) {
                writer.println(datosReportes.getColumn1() + "," + datosReportes.getColumn2() + "," + datosReportes.getColumn3());
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generarReportePDF(List<DatosReportes> data, String fileName, HttpServletResponse response) {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=" + StringUtils.cleanPath(fileName + ".pdf"));

        try (PdfWriter writer = new PdfWriter(response.getOutputStream());
             PdfDocument pdf = new PdfDocument(writer);
             Document document = new Document(pdf)) {

            for (DatosReportes datosReportes : data) {
                document.add(new Paragraph(datosReportes.getColumn1() + ", " + datosReportes.getColumn2() + ", " + datosReportes.getColumn3()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

