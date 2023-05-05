public class Socio {

   private int codigoSocio;
    private String nombre ;
    private double cuotaMensual;
    private String actividad ;

//    public Socio (int codigoSocio, String nombre, double cuotaMensual, String actividad){
//
//      this.actividad=actividad;
//      this.codigoSocio=codigoSocio;
//      this.cuotaMensual=cuotaMensual;
//      this.nombre=nombre;
//
//
//
//
//
//    }


    public Socio(int codigoSocio, String nombre, double cuotaMensual, String actividad) {
        this.codigoSocio = codigoSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public int getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public double calculoCuota(){

        return cuotaMensual * 1.05;

    }
    public String Imprimir() {

       return "El usuario "  +nombre+ " con codigo "  +codigoSocio+ "paga una cuota mensual de" +calculoCuota();
    }

}
