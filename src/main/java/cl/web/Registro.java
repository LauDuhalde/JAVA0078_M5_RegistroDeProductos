package cl.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import cl.clases.Inventario;
import cl.clases.Producto;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/registro.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Capturar los datos
		String nombre = request.getParameter("nombre");
		String  categoria = request.getParameter("categoria");
		int precio = Integer.parseInt(request.getParameter("precio"));
		boolean oferta = (request.getParameter("oferta") != null); //Si checkbox no está seleccionado se recibe null
		
		//Crea producto
		Producto producto = new Producto(nombre, categoria, precio, oferta);
		
		//Agrega producto a listado
		Inventario.agregarProducto(producto);
		
		//Agregamos un atributo al request
		request.setAttribute("productos", Inventario.getListaDeProductos());
				
		//Redirige a resumen.jsp
		request.getRequestDispatcher("/resumen.jsp").forward(request, response);
		
	}

}
