package cl.clases;

import java.util.ArrayList;

public class Inventario {
    private static ArrayList<Producto> listaDeProductos = new ArrayList<>();

	public static ArrayList<Producto> getListaDeProductos() {
		return listaDeProductos;
	}

	public static void agregarProducto(Producto producto) {
		listaDeProductos.add(producto);
	}
    
}
