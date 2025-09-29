# Proyecto: JAVA0078_M5_RegistroDeProductos

Este proyecto es una aplicación web simple desarrollada con **Jakarta Servlets y JSP**, que permite registrar productos en memoria y visualizarlos en una tabla.

---

## Estructura del Proyecto

```
src/main/java
 └── cl/
     ├── clases/
     │   ├── Producto.java
     │   └── Inventario.java
     └── web/
         └── Registro.java
src/main/webapp/
 ├── registro.jsp
 └── resumen.jsp
```
---

## Flujo de la Aplicación

1. El usuario accede a `http://localhost:8080/JAVA0078_M5_RegistroDeProductos/` para cargar el formulario.
2. Completa el formulario con:
   - Nombre del producto
   - Categoría (Electrónica, Ropa, Hogar)
   - Precio
   - Oferta (checkbox)
3. El formulario envía la información al **Servlet Registro** mediante POST.
4. El Servlet crea un objeto `Producto` y lo guarda en `Inventario` (ArrayList en memoria).
5. Los datos se muestran en `resumen.jsp` con validaciones JSTL.

---

## Clases Principales

### Producto.java
Representa un producto con sus atributos:
- `nombre`
- `categoria`
- `precio`
- `oferta`

Incluye getters, setters y `toString()`.

### Inventario.java
Mantiene una lista estática de productos en memoria:
- `agregarProducto(Producto)`
- `getListaDeProductos()`

### Registro.java (Servlet)
Controla el flujo entre vistas:
- `doGet()` → muestra `registro.jsp`
- `doPost()` → recibe datos, crea el producto y redirige a `resumen.jsp`

---

## JSPs

### registro.jsp
Formulario de registro de producto con inputs de texto, select, número y checkbox.

### resumen.jsp
Muestra la lista de productos registrados con:
- `<c:out>` → salida segura de valores
- `<c:if>` → validación de precio negativo y mensaje de oferta
- `<c:choose>`, `<c:when>`, `<c:otherwise>` → categoría
- `<fn:length>` → longitud del nombre del producto

---

## Requisitos

- Java 17 o superior
- Apache Tomcat 10+
- Jakarta EE (Servlets 5)
- JSTL para Jakarta (`jakarta.servlet.jsp.jstl` y `jakarta.servlet.jsp.jstl-api`)

---

## Ejecución

1. Importa el proyecto en **Spring Tool Suite (STS)** o **Eclipse** como *Dynamic Web Project*.
2. Configura Apache Tomcat como servidor.
3. Despliega la aplicación en Tomcat.
4. Accede a:
   - Formulario: [http://localhost:8080/JAVA0078_M5_RegistroDeProductos/](http://localhost:8080/JAVA0078_M5_RegistroDeProductos/)

---

## Autor
- Laura Duhalde

---

Proyecto desarrollado como práctica de Servlets + JSP con almacenamiento en memoria.
