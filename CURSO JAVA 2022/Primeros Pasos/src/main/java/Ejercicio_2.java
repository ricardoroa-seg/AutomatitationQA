import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.print("Digite numeros enteros");
		int num_entero=entrada.nextInt();
		int a=0;
		for (int conteo=num_entero;conteo>=0;conteo--) {
			
			a+=conteo;
			

	}
		
		System.out.println(a);
}
}