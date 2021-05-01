package com.sumativa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumativa.models.Producto;
import com.sumativa.models.Venta;
import com.sumativa.repositories.ProductosRepository;
import com.sumativa.services.VentaService;

@Controller
public class VentasControllers {
	@Autowired
	VentaService ventaService;
	@Autowired
	ProductosRepository productosRepository;
	
	Producto producto;
	@RequestMapping("/ventas/save")
	public String ventas(@RequestParam(value="id") Long id, @RequestParam(value="cantidad") Integer cantidad,Model model) {
		Venta venta= new Venta();
		System.out.println(id+"acaaa"+cantidad);
		Optional<Producto> producto = productosRepository.findById(id);
		venta.setProducto(producto.get().getNombre());
		venta.setPrecio(producto.get().getPrecio());
		venta.setTotal(producto.get().getPrecio()*cantidad);
		venta.setCantidad(cantidad);
		venta = ventaService.guardarVenta(venta);
		return "redirect:/ventas";
	}

}
