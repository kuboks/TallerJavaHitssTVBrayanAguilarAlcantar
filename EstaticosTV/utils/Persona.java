package utils;

public class Persona {
    private String nombre;
    private int edad;

    private static int total;

    public Persona(String nombre, int edad) {
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        total++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "{" + "nombre:" + nombre +", edad:" + edad +"}";
    }
}
