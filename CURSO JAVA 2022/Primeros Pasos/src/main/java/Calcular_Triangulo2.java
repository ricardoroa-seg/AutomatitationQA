import java.util.Scanner;

public class Calcular_Triangulo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese Valor Original: ");
		double precio_original = entrada.nextDouble(); 
		
	 final double impuesto=0.18;
//	double precio_original;
	double precio_final;
	
	
	precio_final= precio_original * impuesto;
		
	double s=Math.round(precio_final);
		
	System.out.print(s);

		
	}

}
