package com.sumativa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumativa.models.Producto;
import com.sumativa.services.ProductoService;

@Controller
public class ProductosControllers {
	
	@Autowired
	ProductoService productoService;
	@RequestMapping("/productos/save")
	public String productos(@RequestParam(value="nombre") String nombre, @RequestParam(value="precio") Integer precio, @RequestParam(value="descripcion") String descripcion,Model model) {
		
		System.out.println(nombre+" - "+precio+" - "+descripcion);
		Producto producto= new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		producto.setDescripcion(descripcion);
		producto = productoService.guardarProducto(producto);
		return "redirect:/productos";
	}
	
}
