package com.conjuntoresidencialjava.mapper;

import com.conjuntoresidencialjava.dto.UsuarioDTO;
import com.conjuntoresidencialjava.entity.Usuario;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioDTO toUsuarioDTO(Usuario usuario);

    List<UsuarioDTO> toUsuarioDTOs(List<Usuario> usuarios);
}
