package test;

import java.time.Period;

import utils.Persona;
import utils.UtileriasMath;

public class TestMain {
    public static void main(String[] args) {
        // System.out.println("Valor PI:" + UtileriasMath.PI);
        // System.out.println("Cuadrado de un numero "+ UtileriasMath.square(3));

        // // Se puede crear instancia pero es mejor usar los metodos/valores estaticos sin crearla
        // UtileriasMath utileriasMath= new UtileriasMath();
        // System.out.println("Instancia PI "+utileriasMath.getPi());
        // System.out.println("Intancia cuadrado "+utileriasMath.square(3));

        // System.out.println("Valor: " + utileriasMath.getValor());

        System.out.println("Total antes de crear "+Persona.getTotal());

        Persona persona1= new Persona("Brayan", 23);
        System.out.println(persona1);
        System.out.println("Total despues de crear "+Persona.getTotal());

        Persona persona2= new Persona("Kubo", 24);
        System.out.println(persona2);
        System.out.println("Total despues de crear "+Persona.getTotal());

        Persona persona3= new Persona();

        System.out.println(persona3);
        System.out.println("Total despues de crear "+Persona.getTotal());

        Persona persona4= new Persona();
        System.out.println(persona4);
        System.out.println("Total despues de crear " + persona1.getTotal());
    }
}
