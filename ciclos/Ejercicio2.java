package ciclos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        int menorNumero=0;
        System.out.println("Ingresa cuantos valores deseas compara: ");
        numero= sc.nextInt();
        

        if(numero<10){
            System.out.println("Se requieren al menos 10 numeros");
            System.exit(0);
        }
        
        for(int i = 1; i <= numero; i++){
            System.out.println("Ingresa valor " + i);
            int temporal= sc.nextInt();

            if(i==1){
                menorNumero=temporal;
            }

            if(temporal<menorNumero){
                menorNumero=temporal;
            }
        }

        System.out.println("El menor numero es :" + menorNumero);
        if (menorNumero<10) {
            System.out.println("El menor numero es menor que 10!");
            
        }else{
            System.out.println("El menor numero es igual o mayor que 10!");

        }
        sc.close();
    }
}
