package api.inventario.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Digits(integer=10, fraction=0)
    private Long id;

    @Pattern(regexp="^[0-9]+$")
    @NotBlank
    private String identificador;

    @Pattern(regexp="^[0-9]+$", message="El teléfono solo puede contener números")
    private String tipoIdentificacion;

    @NotBlank
    private String primerNombre;

    private String segundoNombre;

    @NotBlank
    private String primerApellido;

    private String segundoApellido;

    @Email
    @NotBlank
    @Column(name = "correo_electronico", unique = true)
    private String correoElectronico;

    @Pattern(regexp="^[0-9]+$")
    @NotBlank
    @Column(name = "telefono", unique = true)
    private String telefono;

    @NotNull
    @Column(name = "usuario", unique = true)
    private String usuario;

    @NotNull
    private String contrasena;

    @NotNull
    private String rol;

    @NotNull
    private String grupo;

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public Usuario(Object o, String nuevoUsuario, String mail) {
    }

    public Usuario(Long id, String usuario1) {
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", identificador='" + identificador + '\'' +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", rol='" + rol + '\'' +
                ", grupo='" + grupo + '\'' +
                '}';
    }
}

