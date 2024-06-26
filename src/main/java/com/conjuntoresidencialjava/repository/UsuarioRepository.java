package com.conjuntoresidencialjava.repository;

import com.conjuntoresidencialjava.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}