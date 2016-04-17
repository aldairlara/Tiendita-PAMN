/*
 *  Programación Avanzada y Métodos Numéricos
 *
 *  Grupo: 02
 *
 *	Espejel Alejandro
 *	Urbina Garrido Mauricio
 *
 */
public class Producto {
	private String nombre;
	private double compra;
	private double precio;
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public double comprar(double compra) {
		this.compra = compra;
		return compra;
	}
	@Override
	public String toString() {
		return this.nombre + "\t$" + this.precio;
	}
	public double getPrecio() {
		return this.precio;
	}
	public double getCompra() {
		return this.compra;
	}
}
