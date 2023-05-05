import sun.security.mscapi.CPublicKey;

public class MainPerro {
    public static void main(String[] args) {

        Perro miPerrito = new Perro("Chaplin","Negro","Fernando",10.2f,12,true,"Pitbul");
        System.out.println(miPerrito.sonido());
        System.out.println(miPerrito.imprimir());
        miPerrito.setNombre("Romeo");
        System.out.println(miPerrito.imprimir());
    }
}
