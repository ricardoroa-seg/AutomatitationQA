public class CuentaBancaria {

    private float Saldo;
    private float TasaAnual;
    private int numeroConsignaciones = 0;
    private int numeroRetiros = 0;
    private float ComisionMensual = 0;
    //private String actividad ;

    public CuentaBancaria(float Saldo,float TasaAnual) {
        this.Saldo = Saldo;
        this.TasaAnual = TasaAnual;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public float getSaldo() {
        return Saldo;
    }

    public float calcularTasaMensual() {

  return getTasaAnual()/12;
    }

    public float getComisionMensual() {
        return ComisionMensual;
    }

    public float getTasaAnual() {
        return TasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        TasaAnual = tasaAnual;
    }

    public Float consignarCantidad(float valorCantidad) {
        return getSaldo()+valorCantidad;
    }

    public Float retirarCantidad(float retirarCantidad) {

        if (getSaldo()>retirarCantidad){
            Saldo=Saldo-retirarCantidad;
        }
        else{
            Saldo=Saldo;
            System.out.println("No se puede retirar");
        }



        return getSaldo();
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public Float CalcularInteres() {
        return getSaldo();
    }

    public Float extractoMensual() {

        return Saldo- ComisionMensual-calcularTasaMensual();
    }

    public String Imprimir() {

        return "El saldo es  "  +Saldo+ " con tasa Anual es "  +TasaAnual+ "Numero de consignaciones " + numeroConsignaciones+ " Comision Mensual" +ComisionMensual+ "Numero de retiros " +numeroRetiros;
    }

}