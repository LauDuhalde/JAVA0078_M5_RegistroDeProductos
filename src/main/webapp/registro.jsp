<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
</head>
<body>
	<div>
		<h2>Registro de Producto</h2>
	    <form action="registro" method="post">
	        <!-- Nombre del producto -->
	        <label for="nombre">Nombre del producto:</label>
	        <input type="text" id="nombre" name="nombre" required>
	        <br><br>
	
	        <!-- Categoría -->
	        <label for="categoria">Categoría:</label>
	        <select id="categoria" name="categoria" required>
	            <option value="">Seleccione...</option>
	            <option value="Electrónica">Electrónica</option>
	            <option value="Ropa">Ropa</option>
	            <option value="Hogar">Hogar</option>
	        </select>
	        <br><br>
	
	        <!-- Precio -->
	        <label for="precio">Precio:</label>
	        <input type="number" id="precio" name="precio" step="0.01" required>
	        <br><br>
	
	        <!-- Oferta -->
	        <label for="oferta">¿Está en oferta?</label>
	        <input type="checkbox" id="oferta" name="oferta" value="true">
	        <br><br>
	
	        <!-- Botón -->
	        <button type="submit">Registrar</button>
	    </form>
	</div>
</body>
</html>