public class Main {
    public static void main(String[] args){


        Socio miSocio=new Socio(0000,"fernando",500000,"Boxeo");
        SocioPremium miSocioPremiun=new SocioPremium(0000,"fernando",500000,"Boxeo",true);

      //  miSocio.calculoCuota();
        System.out.println(miSocio.calculoCuota());
        miSocio.setCuotaMensual(12000);
        System.out.println(miSocio.calculoCuota());
        miSocio.Imprimir();
        System.out.println( miSocio.Imprimir());

        System.out.println(miSocioPremiun.calculoCuota());
        System.out.println( miSocioPremiun.Imprimir());
    }
}
