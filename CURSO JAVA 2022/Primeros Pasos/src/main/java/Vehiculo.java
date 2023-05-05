public class Vehiculo {

    private String marca;
    private int modelo;
   // private String color[]={"blanco","negro","rojo","naranja","amarillo","verde","azul","violeta"};
    private String color;
    public Vehiculo (String marca,int modelo,String color){

        this.marca=marca;
        this.color=color;
        this.modelo=modelo;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
