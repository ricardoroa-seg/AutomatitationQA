public class SocioPremium extends Socio
{
    private boolean habilitado;
    private double costoExtra;

    public SocioPremium(int codigoSocio, String nombre, double cuotaMensual, String actividad, boolean habilitado) {
        super(codigoSocio, nombre, cuotaMensual, actividad);
        this.habilitado=habilitado;
        costoExtra= 2;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public double getCostoExtra() {
        return costoExtra;
    }

    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }

    @Override
    public double calculoCuota() {
        if (habilitado){
            return super.calculoCuota() + costoExtra;
        }

        else{
           return super.calculoCuota()  ;
        }
    }

}

