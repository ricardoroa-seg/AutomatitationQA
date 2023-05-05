public class CuentaAhorros extends CuentaBancaria{

    private boolean cuentaActiva;
    public CuentaAhorros(float Saldo, float TasaAnual,boolean cuentaActiva) {
        super(Saldo, TasaAnual);
        this.cuentaActiva=cuentaActiva;
    }

    public boolean isCuentaActiva() {
        return cuentaActiva;
    }

    public void validarCuentaActiva() {

        if (getSaldo() < 1000) {
            cuentaActiva=false;
            System.out.println("La cuenta esta inactiva");
        } else {
            cuentaActiva=true;
            System.out.println("La cuenta esta activa");
        }
    }

    @Override
    public Float consignarCantidad(float valorCantidad) {
        if (cuentaActiva) {

            return super.consignarCantidad(valorCantidad);

        }else{
            System.out.println("La cuenta esta inactiva");
            return super.getSaldo();

        }


    }

         public int numeroTransacciones(){
         return getNumeroRetiros()+getNumeroConsignaciones();
    }


    @Override
    public Float retirarCantidad(float retirarCantidad) {
       // this.retirarCantidad=retirarCantidad;
        if (cuentaActiva) {

            return super.retirarCantidad(retirarCantidad);
        }else{
            System.out.println("La cuenta esta inactiva");
            return super.getSaldo();

        }

    }

    @Override
    public Float extractoMensual() {


        if(getNumeroRetiros()>4) {
            return super.extractoMensual() - (1000*getNumeroRetiros());
        }
        else{
        return super.extractoMensual();
        }
    }

    @Override
    public String Imprimir() {
        return "El saldo es  "  +getSaldo()+ " la comision mensual "  +getComisionMensual()+ "Numero de transacciones " + numeroTransacciones() ;
    }

}
