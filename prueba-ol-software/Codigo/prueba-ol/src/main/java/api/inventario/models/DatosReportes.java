package api.inventario.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity(name="datos_reportes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DatosReportes {


    @Id
    @Digits(integer=10, fraction=0)
    private Long id;

    @NotBlank
    private String column1;

    @NotBlank
    private String column2;

    @NotBlank
    private String column3;

    public DatosReportes(String value1, String value2, String value3) {
    }

    @Override
    public String toString() {
        return "DatosReportes(id=" + id + ", column1='" + column1 + "', column2='" + column2 + "', column3='" + column3 + "')";
    }

}
