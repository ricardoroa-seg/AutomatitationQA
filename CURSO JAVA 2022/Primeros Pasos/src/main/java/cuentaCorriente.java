
public class cuentaCorriente extends CuentaBancaria{


    private float Sobregiro=0;

    public cuentaCorriente(float Saldo, float TasaAnual) {
        super(Saldo, TasaAnual);
    }

    public float getSobregiro() {
        return Sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        Sobregiro = sobregiro;
    }

    @Override
    public Float retirarCantidad(float retirarCantidad) {

        if (getSaldo() > retirarCantidad) {
            Sobregiro = getSaldo() - retirarCantidad;
            return super.retirarCantidad(Sobregiro);
        }
        else{
           // getSaldo()=getSaldo()-retirarCantidad;
            return super.retirarCantidad(retirarCantidad);
        }

    }

    @Override
    public Float consignarCantidad(float valorCantidad) {

        if (Sobregiro< 0) {
           // getSaldo() = Sobregiro + valorCantidad;
            return super.consignarCantidad(valorCantidad)  + Sobregiro;
        }else{

            return super.consignarCantidad(valorCantidad);
        }
    }

    @Override
    public Float extractoMensual() {
        return super.extractoMensual();
    }

    @Override
    public String Imprimir() {
        return super.Imprimir()+" " + Sobregiro+ "Numero de transacciones "+ super.getNumeroConsignaciones()+super.getNumeroRetiros() ;
    }
}
