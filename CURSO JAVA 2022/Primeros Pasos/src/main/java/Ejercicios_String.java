
public class Ejercicios_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Nombre="Ricardo Andres Roa Hurtado";
	    System.out.println("Mi nombre es " + Nombre); 
	    System.out.println("Mi nombre tiene " + Nombre.length() + " letras."); 
	    System.out.println("Mi primera letra de " + Nombre + " es la " + Nombre.charAt(0));
	    int ultima_letra;
	    
	    ultima_letra=Nombre.length();
	    
	    System.out.println("Y la ultima letra es la " + Nombre.charAt(ultima_letra-1) );
		
		
	}

}
