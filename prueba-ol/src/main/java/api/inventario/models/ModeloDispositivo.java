package api.inventario.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class ModeloDispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Digits(integer=10, fraction=0)
    private Long id;

    @NotBlank
    private String nombre;

    @ManyToOne
    private Fabricante fabricante;

    @Override
    public String toString() {
        return "ModeloDispositivo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fabricante=" + fabricante +
                '}';
    }
}
