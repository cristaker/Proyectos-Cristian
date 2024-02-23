package api.inventario.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Digits(integer=10, fraction=0)
    private Long id;

    @NotBlank
    private String nombre;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne
    private TipoDispositivo tipo;

    @ManyToOne
    private Fabricante fabricante;

    @ManyToOne
    private ModeloDispositivo modelo;

    @NotBlank
    private String numeroSerie;

    @NotBlank
    private String numeroInventario;

    @NotBlank
    private String comentarios;

    @ManyToOne
    private Usuario usuarioAsignado;

}
