package com.sumativa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumativa.models.Producto;
import com.sumativa.models.Usuario;
import com.sumativa.models.Venta;
import com.sumativa.repositories.ProductosRepository;
import com.sumativa.repositories.UsuarioRepository;
import com.sumativa.repositories.VentasRepository;
import com.sumativa.services.ProductoService;
import com.sumativa.services.UsuarioService;
import com.sumativa.services.VentaService;

@RestController
public class ApiControllers {
	@Autowired
	UsuarioService usuarioService;
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ProductosRepository productosRepository;
	@Autowired
	ProductoService productosService;
	
	@Autowired
	VentasRepository ventasRepository;
	@Autowired
	VentaService ventasService;
	
	
	@RequestMapping("/usuario/listar")
	public List<Usuario> listaAlumnos(){
		
		List<Usuario> usuario_lista = usuarioService.allUsuario();
		
		return usuario_lista;
	}
	
	@RequestMapping("/usuario/buscar/{id}")
	public Optional<Usuario> buscarUsuario(@PathVariable("id") Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return usuario;
	}
	
	@RequestMapping("/usuario/eliminar/{id}")
	public String eliminarUsuario(@PathVariable("id") Long id) {
		usuarioRepository.deleteById(id);
		return "usuario eliminado";
	}
	
	@RequestMapping("/usuario/actualizar/nombre/{id}/{nombre}")
	public String actualizarUsuarioNombre(@PathVariable("id") Long id, @PathVariable("nombre") String nombre) {
		Optional<Usuario> user = usuarioRepository.findById(id);
		Usuario userA = user.get();
		userA.setNombre(nombre);
		usuarioRepository.save(userA);
		return "Nombre de usuario actualizado";
	}	
	
	@RequestMapping("/usuario/actualizar/password/{id}/{pass}")
	public String actualizarUsuarioPassword(@PathVariable("id") Long id, @PathVariable("pass") String pass) {
		Optional<Usuario> user = usuarioRepository.findById(id);
		Usuario userA = user.get();
		userA.setPassword(pass);
		usuarioRepository.save(userA);
		return "Clave de usuario actualizada";
	}
	
	@RequestMapping("/producto/listar")
	public List<Producto> listaProductos(){
		
		List<Producto> producto_lista = productosService.allProductos();
		
		return producto_lista;
	}
	
	@RequestMapping("/producto/buscar/{id}")
	public Optional<Producto> buscarProducto(@PathVariable("id") Long id) {
		Optional<Producto> producto = productosRepository.findById(id);
		return producto;
	}
	
	@RequestMapping("/producto/eliminar/{id}")
	public String eliminarProducto(@PathVariable("id") Long id) {
		productosRepository.deleteById(id);
		return "Producto eliminado";
	}
	
	@RequestMapping("/producto/actualizar/nombre/{id}/{nombre}")
	public String actualizarProductoNombre(@PathVariable("id") Long id, @PathVariable("nombre") String nombre) {
		Optional<Producto> producto = productosRepository.findById(id);
		Producto productoA = producto.get();
		productoA.setNombre(nombre);
		productosRepository.save(productoA);
		return "Nombre de producto actualizado";
	}	
	
	@RequestMapping("/producto/actualizar/precio/{id}/{precio}")
	public String actualizarPrecioProducto(@PathVariable("id") Long id, @PathVariable("precio") Integer precio) {
		Optional<Producto> producto = productosRepository.findById(id);
		Producto productoA = producto.get();
		productoA.setPrecio(precio);
		productosRepository.save(productoA);
		return "El precio del producto fue actualizado";
	}
	
	@RequestMapping("/producto/actualizar/descripcion/{id}/{descripcion}")
	public String actualizarDescripcionProducto(@PathVariable("id") Long id, @PathVariable("descripcion") String descripcion) {
		Optional<Producto> producto = productosRepository.findById(id);
		Producto productoA = producto.get();
		productoA.setDescripcion(descripcion);
		productosRepository.save(productoA);
		return "La descripcion del producto fue actualizado";
	}
	
	@RequestMapping("/venta/listar")
	public List<Venta> listaVentas(){
		
		List<Venta> venta_lista = ventasService.allVentas();
		
		return venta_lista;
	}
	
	@RequestMapping("/venta/buscar/{id}")
	public Optional<Venta> buscarVenta(@PathVariable("id") Long id) {
		Optional<Venta> venta = ventasRepository.findById(id);
		return venta;
	}
	
	@RequestMapping("/venta/eliminar/{id}")
	public String eliminarVenta(@PathVariable("id") Long id) {
		ventasRepository.deleteById(id);
		return "Venta eliminada";
	}
	
}
