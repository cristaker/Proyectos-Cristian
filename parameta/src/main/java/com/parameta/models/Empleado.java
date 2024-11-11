package com.parameta.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombres;

    @NotBlank
    private String apellidos;

    @NotBlank
    private String tipoDocumento;

    @NotBlank
    private String numeroDocumento;

    @Past
    @NotNull
    private Date fechaNacimiento;

    @NotNull
    private Date fechaVinculacion;

    @NotBlank
    private String cargo;

    @NotNull
    @Positive
    private Double salario;
}
