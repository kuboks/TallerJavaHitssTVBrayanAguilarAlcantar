package ciclos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        // Hacer la suma de numeros enteros mientras el numero ingresado no es 0
        // e imprimir
        Scanner sc= new Scanner(System.in);
        int numero;
        int suma=0; // acumuladores, banderas
        int total=0; // contador

        System.out.print("Ingresa el numero: ");
        numero= sc.nextInt();


        while (numero != 0) {
            suma += numero;
            total++;
            System.out.print("Numero: ");
            numero= sc.nextInt();
        }
        // utilizando el metodo printf("Formato", objeto)
        // String.format("Formato", objeto)
        // DecimalFormat ---> numeros
        System.out.println("Suma: " + suma);
        if(total>0){

            DecimalFormat df = new DecimalFormat("#,###.00");


            System.out.println("Promedio: " + (suma / (double) total));

            System.out.printf("Promedio: %,.2f ",(suma / (double) total));

            System.out.println(String.format("Promedio: %,.2f ",(suma / (double) total)));

            System.out.println("Promedio: " + df.format(suma / (double) total));
        }else{
            System.out.println("No hubo numeros");
        }
        sc.close();
    }
}
