package test;

// import poo.Automovil;
import poo.Calculadora;
import poo.Persona;

public class TestMain {
    public static void main(String[] args) {
        // Automovil automovil= new Automovil();
        Persona persona1= new Persona("Kubo");
        Persona persona2= new Persona(23);
        Persona persona3= new Persona("Kubo", 24);
        Persona persona4= new Persona();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());

        System.out.println("Son iguales?: " + (persona3.equals(persona1)));

        // automovil.setMarca("Ford");
        // automovil.setColor("Azul");
        // automovil.setAnio(2024);
        // automovil.setNumeroPuertas(5);

        // System.out.println("===============================");
        // System.out.println("Marca "+ automovil.getMarca());
        // System.out.println("Color " + automovil.getColor());
        // System.out.println("Año "+ automovil.getAnio());
        // System.out.println("Numero de puertas "+automovil.getNumeroPuertas());

        // automovil.arrancar();
        System.out.println();
        Calculadora calculadora= new Calculadora();
        int suma= calculadora.suma(2, 5);
        System.out.println("Suma de 2 ints: "+ calculadora.suma(suma, 5));
        System.out.println("Suma con double a y double b: " + calculadora.suma(3.4, 2.5));
        System.out.println("Suma con double a: " + calculadora.suma(3.4, 2));

        System.out.println("Suma con 3 ints " + calculadora.suma(suma, 2, 4));
        calculadora.saludar("Kubo");
    }
}
