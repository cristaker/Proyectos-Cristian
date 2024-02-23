package api.inventario.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class ReporteCsvRequest {

    @NotNull
    private List<DatosReportes> data;

    @NotBlank
    private String fileName;

    public ReporteCsvRequest(String data, String file) {
    }

    @Override
    public String toString() {
        return "ReporteCsvRequest{" +
                "data=" + data +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
