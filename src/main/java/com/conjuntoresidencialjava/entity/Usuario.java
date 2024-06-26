package com.conjuntoresidencialjava.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_documento")
    private TiposDocumento idTipoDocumento;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "no_documento", length = 50)
    private String noDocumento;

    @Column(name = "correo", length = 50)
    private String correo;

    @Column(name = "estado")
    private Boolean estado;

}