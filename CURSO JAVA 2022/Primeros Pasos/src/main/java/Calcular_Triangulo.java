import java.util.Scanner;

public class Calcular_Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese Base: ");
		double base = entrada.nextDouble(); 
		
//		Scanner e = new Scanner(System.in);
		System.out.print("Ingrese Altura: ");
		double altura = entrada.nextDouble(); 
		
		
//		double altura=5;
//		double base=4;
		
		double calculo=(base*altura)/2;
		
				double s=Math.round(calculo);
				
				System.out.print(s);

	}

}
