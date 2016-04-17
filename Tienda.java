import java.util.Scanner;


public class Tienda {
	static Scanner input = new Scanner(System.in);
	static Producto p1 = new Producto("Leche", 15.50);
	static Producto p2 = new Producto("Refresco", 10.50);
	static Producto p3 = new Producto("Condones", 21.50);
	static Producto p4 = new Producto("Chetos", 6.00);
	static Producto p5 = new Producto("Cahuasakis", 32.50);
	public static void main(String[] args) {
	 System.out.println("\n\t\tBIENVENIDO A LA MINIMICROTIENDITITITA, ESTAMOS PARA SERVIRTE.");
		 System.out.println("\t\tEstos son los productos que tenemos a la venta: \n");
		 System.out.println(p1);
		 System.out.println(p2);
		 System.out.println(p3);
		 System.out.println(p4);
		 System.out.println(p5);
		 do {
		 	int res = 0;
		 	int cantidad = 0;
		 	int opc = 0;
		 	System.out.println("\n\tQue producto deseas comprar?: ");
		 	System.out.println("\n1: leche\n2: Refresco\n3: Condones\n4: Chetos\n 5: Cahuasakis");
		 	opc = input.nextInt();
		 	switch(opc) {
		 		case 1:
		 		System.out.println("Cuantos litros de leche deseas comprar? ");
		 		cantidad = input.nextInt();
		 		p1.comprar(cantidad);
		 		break;
		 		case 2:
		 		System.out.println("Cuantos litros de Refresco deseas comprar? ");
		 		cantidad = input.nextInt();
		 		p2.comprar(cantidad);
		 		break;
		 		case 3:
		 		System.out.println("Cuantos Condones deseas comprar? ");
		 		cantidad = input.nextInt();
		 		p3.comprar(cantidad);
		 		break;
		 		case 4:
		 		System.out.println("Cuantos Chetos deseas comprar? ");
		 		cantidad = input.nextInt();
		 		p4.comprar(cantidad);
		 		break;
		 		case 5:
		 		System.out.println("Cuantas cahuamas deseas comprar? ");
		 		cantidad = input.nextInt();
		 		p5.comprar(cantidad);
		 		break;
		 		default:
		 		System.out.println("OPCION INCORRECTA");
		 	}
		 	System.out.println("Deseas comprar otro?(si/no)");
		 	res = input.nextInt();
		 }while(true);
	}
}
