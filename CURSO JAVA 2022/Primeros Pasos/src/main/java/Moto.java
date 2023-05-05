public class Moto extends Vehiculo{

private int cilindraje;
private int potencia;
    public Moto(String marca, int modelo, String color, int cilindraje, int potencia ) {    
        super(marca, modelo, color);
        this.cilindraje = cilindraje;
        this.potencia=potencia;

    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
