package sintaxis;
// Este es un comentario de una sola línea
/*
 * Este es un comentario
 * de varias líneas
 */

public class HolaMundo {
    static int altura;
    public static void main(String[] args) {
        int edad= 10;
        altura = 170;
        System.out.println("Edad: " + edad);
        saludar();

    }
    public static void saludar() {
        int edad = 25; // Declaración de una variable entera dentro del método
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }
}