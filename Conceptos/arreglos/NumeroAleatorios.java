package arreglos;

import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) {
        // Numero aleatorios
        // Clase Math
        // double numero = Math.random()*100;

        for(int i=0; i<10; i++){
            int numero = (int)(Math.random()*10)+1;
            System.out.println(numero);
        }
        
        
        // Clase Random

        System.out.println("Numeros aleatorios usando Random");
        Random aleatorio= new Random();
        for (int i = 0; i < 10; i++) {
            // Aleatorio del 1 al 10 usando Random
            int num= aleatorio.nextInt(10)+1;
            System.out.println(num);
        }
        double numDecimal= aleatorio.nextDouble();
        System.out.println(numDecimal);
        boolean boleano= aleatorio.nextBoolean();
        System.out.println(boleano);
    }
}
