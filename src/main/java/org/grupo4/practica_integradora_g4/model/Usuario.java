package org.grupo4.practica_integradora_g4.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString

public class Usuario {
    private String email;
    private String clave;
    private LocalDate fechaUltimaConexion;
    private Integer numeroAccesos;
    private Auditoria auditoria;
}
