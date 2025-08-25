package poo;

import java.util.Objects;

public class Persona {

    // Atributos
    private String nombre;
    private int edad;

    // Contructores
    public Persona() {

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        // Solo se puede usar una llamada de un contructor, al hacer 2
        // la segunda ya no se toma en cuenta y genera error
        // Se usa this(variable) para llamar otro constructor dentro de un constructor
        this(nombre);

        // this.nombre = nombre;
        this.edad = edad;
    }

    // public Persona(int edad, String nombre) {
    // this.nombre = nombre;
    // this.edad = edad;
    // }

    public String getNombre() {
        return nombre;
    }

    // Geter y seters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        //Notacion JSON: {atributo: valor, atributo: valor}
        return "{nombre:" + nombre + ", edad:" + edad + "}";
    }

    @Override
    public boolean equals(Object obj) {

        //Verifica si comparten la misma direccion de memoria
        if(this == obj) return true;
        //Verifica si el objeto es nullo
        //Verifica si el objeto es del tipo Persona
        if(obj== null || getClass() != obj.getClass()) return false;
        // se hace un casteo del objeto para asegurar que sean del tipo persona
        Persona p= (Persona) obj;
        //Compara this.nombre (objeto1) y el nombre del objeto2 (p)
        // return Objects.equals(nombre, p.nombre);
        
        // return nombre.equals(p.nombre);

        // return edad == p.edad;



        return nombre.equalsIgnoreCase(p.nombre) && edad== p.edad;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    // Implementacion generada
    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    //     result = prime * result + edad;
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Persona other = (Persona) obj;
    //     if (nombre == null) {
    //         if (other.nombre != null)
    //             return false;
    //     } else if (!nombre.equals(other.nombre))
    //         return false;
    //     if (edad != other.edad)
    //         return false;
    //     return true;
    // }
    
}
