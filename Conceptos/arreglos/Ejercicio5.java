package arreglos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Ingresa ");
        for(int i=1; i<=10;i++){
            System.out.print("Ingresa el valor " + i + " : ");
            numeros[i]= sc.nextInt();
        }

        for(int i=0; i<5; i++){
            System.out.println(numeros[numeros.length-i-1]);
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}
