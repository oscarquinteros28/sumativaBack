package com.sumativa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumativa.services.UsuarioService;
import com.sumativa.models.Usuario;

@Controller
public class UsuariosControllers {
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/usuarios/save")
	public String usuarios(@RequestParam(value="nombre") String nombre, @RequestParam(value="pass") String pass,Model model) {
		
		System.out.println(nombre+" - "+pass);
		Usuario usuario= new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(pass);
		usuario = usuarioService.guardarUsuario(usuario);
		return "redirect:/";
	}	
	
}
