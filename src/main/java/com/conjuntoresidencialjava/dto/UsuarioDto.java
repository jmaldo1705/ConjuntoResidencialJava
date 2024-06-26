package com.conjuntoresidencialjava.dto;

import lombok.Value;

import java.io.Serializable;


@Value
public class UsuarioDto implements Serializable {
    Integer id;
    TiposDocumentoDto idTipoDocumento;
    String nombre;
    String password;
    String noDocumento;
    String correo;
    Boolean estado;
}