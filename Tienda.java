import java.util.Scanner;


public class Tienda {
	static Scanner input = new Scanner(System.in);
	static Producto p1 = new Producto("Leche", 15.50);
	static Producto p2 = new Producto("Refresco", 10.50);
	static Producto p3 = new Producto("Condones", 21.50);
	static Producto p4 = new Producto("Chetos", 6.00);
	static Producto p5 = new Producto("Cahuasakis", 32.50);
	public static void main(String[] args) {
		 System.out.println("\t\tBIENVENIDO A LA MINIMICROTIENDITITITA, ESTAMOS PARA SERVIRTE.");
		 System.out.println("\t\tEstos son los productos que tenemos a la venta: \n");
		 System.out.println(p1);
		 System.out.println(p2);
		 System.out.println(p3);
		 System.out.println(p4);
		 System.out.println(p5);

	}
}
