public class Perro extends Mascota{

    boolean esAdoptado;
    String raza;

    public Perro(String nombre, String color, String dueno, Float peso, int altura, boolean esAdoptado,String raza) {
        super(nombre, color, dueno, peso, altura);
        this.esAdoptado=esAdoptado;
        this.raza=raza;
    }

    public boolean isEsAdoptado() {
        return esAdoptado;
    }

    public void setEsAdoptado(boolean esAdoptado) {
        this.esAdoptado = esAdoptado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        raza = raza;
    }

    public String sonido(){

        esAdoptado=true;
        return "Guauu Guauuu" + esAdoptado;
    }


}
