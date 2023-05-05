import sun.security.mscapi.CPublicKey;

public class MainVehiculo {

    public static void main(String[] args) {

        Carro micarrito=new Carro("chevrolet",2008,"verde",20,5,5 );
        Moto mmimotico=new Moto("HONDA",2013,"verde",250,10);

        System.out.println("Marca de mi carrito" +micarrito.getMarca());
        System.out.println("El carro tiene combustible para " +micarrito.duracionCombustible() + " En kilometros");
        micarrito.setGalonesCombustible(10);
        System.out.println("El carro tiene combustible para " +micarrito.duracionCombustible() + " En kilometros");
        System.out.println(micarrito.Encender());

        System.out.println("Marca de mi motico es " +mmimotico.getMarca());
        System.out.println("Mi Cilindraje " +mmimotico.getCilindraje());
        System.out.println("La moto es modelo " +mmimotico.getModelo());


    }
}
