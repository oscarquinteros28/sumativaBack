package com.sumativa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumativa.models.Usuario;
import com.sumativa.repositories.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> allUsuario() {
		return usuarioRepository.findAll();
	}

	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
