package api.inventario.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class TipoDispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Digits(integer=10, fraction=0)
    private Long id;

    @NotBlank
    private String nombre;

    public TipoDispositivo(long id, String tipoActualizado) {
    }

    public TipoDispositivo(Long o, String nuevoTipo) {
    }

    @Override
    public String toString() {
        return "TipoDispositivo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
