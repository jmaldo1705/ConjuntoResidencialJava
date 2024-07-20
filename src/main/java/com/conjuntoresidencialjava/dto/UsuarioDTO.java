package com.conjuntoresidencialjava.dto;

import lombok.Value;


@Value
public class UsuarioDTO {
    Integer id;
    TiposDocumentoDTO idTipoDocumento;
    String nombre;
    String noDocumento;
    String correo;
    Boolean estado;
}