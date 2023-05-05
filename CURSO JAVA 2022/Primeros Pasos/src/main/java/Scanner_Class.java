import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca su nombre Porfavor");
		String nombre_usuario=entrada.nextLine();
		System.out.println("Introduzca su Edad");
		int edad=entrada.nextInt();
		System.out.println("Hola " + nombre_usuario + ". En el año que viene tendras: " + (edad+1) + " años");
		 entrada.close();
	}

}
