package cl.clases;

public class Producto {
	private String nombre;
	private String categoria;
	private int precio;
	private boolean oferta;
	public Producto(String nombre, String categoria, int precio, boolean oferta) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.oferta = oferta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean isOferta() {
		return oferta;
	}
	public void setOferta(boolean oferta) {
		this.oferta = oferta;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", oferta=" + oferta
				+ "]";
	}
	
	
	
}
