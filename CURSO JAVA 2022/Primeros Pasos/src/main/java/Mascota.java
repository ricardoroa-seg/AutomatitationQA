public class Mascota {

     private String nombre;
    private String color;
    private String dueno;
    private Float peso;
    private int altura ;

    public Mascota(String nombre, String color, String dueno, Float peso, int altura) {
        this.nombre = nombre;
        this.color = color;
        this.dueno = dueno;
        this.peso = peso;
        this.altura = altura;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDueño() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String imprimir(){

        return dueno+ " " +nombre+ " " +altura+ " " +color+ " " +peso;
    }
}
