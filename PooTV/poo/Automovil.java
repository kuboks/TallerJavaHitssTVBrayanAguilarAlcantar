package poo;

public class Automovil {
    // Atributos public, private, protected, (default)

    // Evitar la ñ en nombrado de atributos de preferencia usar en ingles
    private String marca;
    private String color;
    private int anio;
    private Integer numeroPuertas = 4;

    // Geter y seter de los atributos
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // Metodos
    public void arrancar(){
        
    }
}
