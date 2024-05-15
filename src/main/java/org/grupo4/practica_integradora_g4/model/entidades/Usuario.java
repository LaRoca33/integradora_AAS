package org.grupo4.practica_integradora_g4.model.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import org.grupo4.practica_integradora_g4.validaciones.ComprobarClaves;
import org.grupo4.practica_integradora_g4.validaciones.ComprobarEmail;
import org.grupo4.practica_integradora_g4.validaciones.ComprobarNombreEmail;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Validated
@ComprobarClaves
@Entity
public class Usuario {
    @Id
    @NotNull
    @NotBlank
    @ComprobarEmail
    @ComprobarNombreEmail
    private String email;
    @NotNull
    @NotBlank
    @Size(min=6, max=12)
    //@Pattern(regexp ="(?=.*[0-9])(?=.*[a-zñ])(?=.*[A-ZÑ])(?=.*[!#$%&]).*")
    private String clave;
    @NotNull
    private String confirmarClave;
    @NotNull
    @NotBlank
    private String pregRec;
    @NotNull
    @NotBlank
    private String respRec;
    private LocalDate fechaUltimaConexion=LocalDate.now();
    private Integer numeroAccesos=0;
    private Auditoria auditoria;
}

