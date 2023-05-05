public class Carro extends Vehiculo {

    private int autonomia;
    private int galonesCombustible;
    private int cantidadPasajeros;
    private boolean encendido;


    public Carro(String marca, int modelo, String color, int autonomia, int galonesCombustible, int cantidadPasajeros) {
        super(marca, modelo, color);
        this.autonomia=autonomia;
        this.galonesCombustible=galonesCombustible;
        this.encendido=encendido;
        this.cantidadPasajeros=cantidadPasajeros;

    }

    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public float getGalonesCombustible() {
        return galonesCombustible;
    }

    public void setGalonesCombustible(int galonesCombustible) {
        this.galonesCombustible = galonesCombustible;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String Encender() {
        boolean encendido=true;
        return "El auto esta prendido";
    }
    public int duracionCombustible(){

        return autonomia*galonesCombustible ;
    }
}