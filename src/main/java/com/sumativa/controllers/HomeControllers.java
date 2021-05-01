package com.sumativa.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sumativa.models.Producto;
import com.sumativa.models.Usuario;
import com.sumativa.models.Venta;
import com.sumativa.services.ProductoService;
import com.sumativa.services.UsuarioService;
import com.sumativa.services.VentaService;


@Controller
public class HomeControllers {
	
	@Autowired
	ProductoService productosService;
	@Autowired
	UsuarioService usuariosService;
	@Autowired
	VentaService ventasService;
	
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Usuario> usuario_lista = usuariosService.allUsuario();
		model.addAttribute("usuario_lista", usuario_lista);
		return "usuarios.jsp";
	}
	
	@RequestMapping("/productos")
	public String productos(Model model) {
		List<Producto> producto_lista = productosService.allProductos();
		model.addAttribute("producto_lista", producto_lista);
		return "productos.jsp";
	}
	
	@RequestMapping("/ventas")
	public String ventas(Model model) {
		List<Venta> ventas_lista = ventasService.allVentas();
		model.addAttribute("ventas_lista", ventas_lista);
		List<Producto> producto_lista = productosService.allProductos();
		model.addAttribute("producto_lista", producto_lista);
		return "ventas.jsp";
	}
}
