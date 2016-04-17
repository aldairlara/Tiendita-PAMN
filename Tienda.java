import java.util.Scanner;


public class Tienda {
	static Scanner input = new Scanner(System.in);
	static Producto p1 = new Producto("Leche", 15.50);
	static Producto p2 = new Producto("Refresco", 10.50);
	static Producto p3 = new Producto("Condones", 21.50);
	static Producto p4 = new Producto("Chetos", 6.00);
	static Producto p5 = new Producto("Cahuasakis", 32.50);
	public static void main(String[] args) {
		Tienda fin = new Tienda();
	 	System.out.println("\n\t\tBIENVENIDO A LA MINIMICROTIENDITITITA, ESTAMOS PARA SERVIRTE.");
		 System.out.println("\t\tEstos son los productos que tenemos a la venta: \n");
		 System.out.println(p1);
		 System.out.println(p2);
		 System.out.println(p3);
		 System.out.println(p4);
		 System.out.println(p5);
		 int res;
		 int cantidad1 = 0;
		 int cantidad2 = 0;
		 int cantidad3 = 0;
		 int cantidad4 = 0;
		 int cantidad5 = 0;
		 do {
		 	int opc = 0;
		 	System.out.println("\n\tQue producto deseas comprar?: ");
		 	System.out.println("\n1: leche\n2: Refresco\n3: Condones\n4: Chetos\n5: Cahuasakis");
		 	opc = input.nextInt();
		 	switch(opc) {
		 		case 1:
		 		System.out.println("Cuantos litros de leche deseas comprar? ");
		 		cantidad1 = input.nextInt();
		 		p1.comprar(cantidad1);
		 		break;
		 		case 2:
		 		System.out.println("Cuantos litros de Refresco deseas comprar? ");
		 		cantidad2 = input.nextInt();
		 		p2.comprar(cantidad2);
		 		break;
		 		case 3:
		 		System.out.println("Cuantos Condones deseas comprar? ");
		 		cantidad3 = input.nextInt();
		 		p3.comprar(cantidad3);
		 		break;
		 		case 4:
		 		System.out.println("Cuantos Chetos deseas comprar? ");
		 		cantidad4 = input.nextInt();
		 		p4.comprar(cantidad4);
		 		break;
		 		case 5:
		 		System.out.println("Cuantas cahuamas deseas comprar? ");
		 		cantidad5 = input.nextInt();
		 		p5.comprar(cantidad5);
		 		break;
		 		default:
		 		System.out.println("OPCION INCORRECTA");
		 	}
		 	System.out.println("Deseas comprar otro? 1.si\t2.no)");
		 	res = input.nextInt();
		 	/*System.out.println(cantidad1);
		 	System.out.println(cantidad2);
		 	System.out.println(cantidad3);		Esta parte fue para ver que guardara las cantidades
		 	System.out.println(cantidad4);
		 	System.out.println(cantidad5);*/
		 }while(res == 1);
		 	
		 
		 //CALCULO DEL TOTAL
		 int tot1 = 0;
		 int tot2 = 0;
		 int tot3 = 0;
		 int tot4 = 0;
		 int tot5 = 0;
		 int total = 0;
		 int pago = 0;
		 int cambio = 0;
		 int falta = 0;
		 //este calculo no trabaja
		 tot1 = cantidad1*(p1.precio);
		 tot2 = cantidad1*p2.precio;
		 tot3 = cantidad1*p3.precio;
		 tot4 = cantidad1*p4.precio;
		 tot5 = cantidad1*p5.precio;//hasta aqui, marca errores en el * y en el . del pn.precio para n del 1 al 5
		 total = tot1 + tot2 + tot3 + tot4 + tot5;
		 cambio = pago - total;
		 System.out.println("Con cuanto dinero va a pagar?");
		 pago = input.nextInt();
		 if(pago < total){
		 	falta = total - cambio;
		 	System.out.println("Te faltan $ " + falta + " pesos carnal");
		 }//aqui hay que hacer que vaya sumando lo que le falte de dinero

		 //RECIBO
		 System.out.println("\n*********************************");
		 System.out.println("\n     TIENDA UNIVERSITARIA FI     ");
		 System.out.println("\n\n*inserte aqui direccion");
		 System.out.println("\n");
		 System.out.println("\n");
		 System.out.println("\n");
		 System.out.println("\n" + cantidad1 + "\tLeche\t$ " + tot1);
		 System.out.println("\n" + cantidad2 + "\tRefresco\t$ " +  tot2);
		 System.out.println("\n" + cantidad3 + "\tCondones\t$ " +  tot3);
		 System.out.println("\n" + cantidad4 + "\tChetos\t$ " +  tot4);
		 System.out.println("\n" + cantidad5 + "\tCaguamas\t$ " +  tot5);
		 System.out.println("\nTotal:\t$ " +  total);
		 System.out.println("\n---------------------------------");
		 System.out.println("\nPago de:\t $ " +  pago);
		 System.out.println("\nCambio de:\t $ " +  cambio);
		 System.out.println("\n---------------------------------");
		 System.out.println("\n\tGRACIAS POR SU COMPRA\t");
		 System.out.println("\n\n*********************************");

	}
}
