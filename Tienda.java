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
		 System.out.println("\t1.-" + p1);
		 System.out.println("\t2.-" + p2);
		 System.out.println("\t3.-" + p3);
		 System.out.println("\t4.-" + p4);
		 System.out.println("\t5.-" + p5);
		 String r;
		 double total = 0;
		 double[] subTot = new double[5];
		 double cantidad = 0;
		 double pago =0;
		 double cambio = 0;
		 do {
		 	int opc = 0;
		 	System.out.print("\n\tQue deseas producto deseas comprar?: ");
		 	opc = input.nextInt();
		 	switch(opc) {
		 		case 1:
		 		System.out.print("\tCuantos litros de leche deseas comprar? ");
		 		cantidad = input.nextDouble();
		 		subTot[0] = p1.comprar(cantidad)*p1.getPrecio();
		 		break;
		 		case 2:
		 		System.out.print("\tCuantos litros de Refresco deseas comprar? ");
		 		cantidad = input.nextDouble();
		 		subTot[1] = p2.comprar(cantidad)*p2.getPrecio();
		 		break;
		 		case 3:
		 		System.out.print("\tCuantos Condones deseas comprar? ");
		 		cantidad = input.nextDouble();
		 		subTot[2] = p3.comprar(cantidad)*p3.getPrecio();
		 		break;
		 		case 4:
		 		System.out.print("\tCuantos Chetos deseas comprar? ");
		 		cantidad = input.nextDouble();
		 		subTot[3] = p4.comprar(cantidad)*p4.getPrecio();
		 		break;
		 		case 5:
		 		System.out.print("\tCuantas cahuamas deseas comprar? ");
		 		cantidad = input.nextDouble();
		 		subTot[4] = p5.comprar(cantidad)*p5.getPrecio();
		 		break;
		 		default:
		 		System.out.println("\tOPCION INCORRECTA");
		 	}
		 	System.out.print("\tDeseas comprar otro?(s/n): ");
		 	r = input.nextLine();
		 	r = input.nextLine();
		 }while(!r.equals("n"));
		 
		 for(double producto : subTot){
			total+=producto;
		}
		System.out.println("\n\tSu total es de " + total);
		System.out.print("\n\tEl cliente pago: ");
		pago = input.nextDouble();
		cambio = pago - total;

		 //<RECIBO></RECIBO>
		 System.out.println("\n*********************************");
		 System.out.println("\n     TIENDA UNIVERSITARIA FI     ");
		 System.out.println("\n\n*Lomas-ajeas col del diablo #666");
		 System.out.println("\n");
		 System.out.println("\n" + p1.getCompra() + "\tLeche\t$ " + subTot[0]);
		 System.out.println("\n" + p2.getCompra() + "\tRefresco\t$ " +  subTot[1]);
		 System.out.println("\n" + p3.getCompra() + "\tCondones\t$ " +  subTot[2]);
		 System.out.println("\n" + p4.getCompra() + "\tChetos\t$ " +  subTot[3]);
		 System.out.println("\n" + p5.getCompra() + "\tCaguamas\t$ " +  subTot[4]);
		 System.out.println("\nTotal:\t$ " +  total);
		 System.out.println("\n---------------------------------");
		 System.out.println("\nPago de:\t $ " +  pago);
		 System.out.println("\nCambio de:\t $ " +  cambio);
		 System.out.println("\n---------------------------------");
		 System.out.println("\n\tGRACIAS POR SU COMPRA\t");
		 System.out.println("\n\n*********************************");
	
	}
}
