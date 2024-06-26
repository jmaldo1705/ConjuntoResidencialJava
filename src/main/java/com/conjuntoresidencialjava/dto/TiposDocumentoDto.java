package com.conjuntoresidencialjava.dto;

import lombok.Value;

import java.io.Serializable;


@Value
public class TiposDocumentoDto implements Serializable {
    Integer id;
    String nombre;
}