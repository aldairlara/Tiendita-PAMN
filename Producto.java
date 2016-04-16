public class Producto {
	private String nombre;
	private int compra = 0;
	private int opcion;
	private double precio;
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public int comprar(int compra) {
		this.compra = compra;
		return compra;
	}
	@Override
	public String toString() {
		return "\tProducto: " + this.nombre + "\tPrecio: " + this.precio;
	}
}
