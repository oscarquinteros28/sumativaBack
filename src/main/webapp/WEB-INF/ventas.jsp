<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/">Usuarios</a>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="productos">Productos</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="ventas">Ventas</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
	<div>
		<h2>Ingrese Productos</h2>
		<form action="/ventas/save" method="POST">
			<label for="id">Producto: </label>
			<select class="form-select" name="id" id="id">
				<c:forEach var="item" items="${producto_lista}">
					<option value="${item.id}"><c:out value = "${item.nombre}"/></option>
	  	    	</c:forEach>
			</select>
			<label for="cantidad">Cantidad: </label> 
			<input type="number" id="cantidad" name="cantidad">
			<input type="submit" value="enviar">
		</form>
		<table class="table" style="width:50%">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Producto</th>
		      <th scope="col">Cantidad</th>
		      <th scope="col">Precio</th>
  		      <th scope="col">Total</th>
  		      <th scope="col">Accion</th>
		    </tr>
		  </thead>
		  <tbody>
		   <c:forEach var="item" items="${ventas_lista}">
	         <tr>
		      <td><c:out value = "${item.id}"/></td>
		      <td><c:out value = "${item.producto}"/></td>
		      <td><c:out value = "${item.cantidad}"/></td>
  		      <td>$<c:out value = "${item.precio}"/></td>
		      <td>$<c:out value = "${item.total}"/></td>
  		      <th scope="row"><a href="/venta/eliminar/${item.id}">eliminar</a></th>
		    </tr>
	       </c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>