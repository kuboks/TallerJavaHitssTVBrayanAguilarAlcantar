package poo;

public class Calculadora {
    // Atributos

    // Metodo
    // Acceso tipoRetorno nombreMteodo (tipoParam param1, tipoParam param,.....)

    public int suma(int a, int b){
        // int suma= a+b;
        return a+b;
    }
    public int suma(int a, int b, int c){
        // int suma= a+b;
        return a+b+c;
    }

    public double suma(double a, double b){
        // int suma= a+b;
        return a+b;
    }

    public void saludar(String nombre){
        System.out.println("Hola "+ nombre + ", un gusto");
    }
}
