package arreglos;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        // int[] numeros = { 2, 3, 4, 5, 5, 5, 3, 6, 6, 6 };
        int[] numeros= new int[10];
        for(int i=0; i<numeros.length;i++){
            numeros[i]= (int)(Math.random()*9)+1;
        }
        System.out.println(Arrays.toString(numeros));

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;

        for (int num : numeros) {
            switch (num) {
                case 1 -> {
                    c1++;
                }
                case 2 -> {
                    c2++;
                }
                case 3 -> {
                    c3++;
                }
                case 4 -> {
                    c4++;
                }
                case 5 -> {
                    c5++;
                }
                case 6 -> {
                    c6++;
                }
                case 7 -> {
                    c7++;
                }
                case 8 -> {
                    c8++;
                }
                case 9 -> {
                    c9++;
                }
            }
        }

        int[] contadores = { c1, c2, c3, c4, c5, c6, c7, c8, c9 };
        int valorMaximo = contadores[0];
        int posicion = 0;

        for (int i = 1; i < contadores.length; i++) {
            if (contadores[i] > valorMaximo) {
                valorMaximo = contadores[i];
                posicion = i;
            }
        }

        System.out.println("El número que más se repite es " + (posicion+1) +
        ", con " + valorMaximo + " repeticiones.");

    }
}
