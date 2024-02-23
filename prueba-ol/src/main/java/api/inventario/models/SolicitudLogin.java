package api.inventario.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SolicitudLogin {

    @Id
    @Digits(integer=10, fraction=0)
    private Long id;

    @Column(name = "user", unique = true)
    private String user;

    @NotNull
    private String password;

    public SolicitudLogin(String user, String password) {
    }

    @Override
    public String toString() {
        return "SolicitudLogin{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
