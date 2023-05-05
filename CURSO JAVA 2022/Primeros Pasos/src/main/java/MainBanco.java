public class MainBanco {

    public static void main(String[] args){


        CuentaBancaria mibanca=new CuentaBancaria(22,2 );
        CuentaAhorros miBancaAhorro=new CuentaAhorros(22,12,true);
        cuentaCorriente  miBancoCorriente=new cuentaCorriente(21,12);
        //SocioPremium miSocioPremiun=new SocioPremium(0000,"fernando",500000,"Boxeo",true);


        System.out.println(mibanca.Imprimir());
        System.out.println(miBancaAhorro.Imprimir());
        System.out.println(miBancoCorriente.Imprimir());

       // System.out.println( miSocioPremiun.Imprimir());
    }
}
