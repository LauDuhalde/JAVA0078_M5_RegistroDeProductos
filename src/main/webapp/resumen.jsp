<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de productos</title>
</head>
<body>
	<div>
		<h2>Lista de Productos Registrados</h2>
	    <table border="1">
	        <tr>
	            <th>Nombre</th>
	            <th>Categoría</th>
	            <th>Precio</th>
	            <th>Oferta</th>
	            <th>Cantidad de caracteres</th>
	        </tr>
	        <c:forEach var="p" items="${productos}">
            <tr>
                <!-- Mostrar valores con c:out -->
                <td><c:out value="${p.nombre}" /></td>
                <td><c:out value="${p.categoria}" /></td>

                <!-- Validar precio -->
                <td>
                    <c:if test="${p.precio lt 0}">
                        <span style="color:red;">Precio inválido</span>
                    </c:if>
                    <c:if test="${p.precio ge 0}">
                        <c:out value="${p.precio}" />
                    </c:if>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${p.oferta}">Sí</c:when>
                        <c:otherwise>No</c:otherwise>
                    </c:choose>
                </td>

                <!-- Longitud del nombre -->
                <td><c:out value="${fn:length(p.nombre)}" /></td>
            </tr>
        </c:forEach>
	    </table>
	
	    <br>
	    <a href="registro">Registrar otro producto</a>
	</div>
</body>
</html>