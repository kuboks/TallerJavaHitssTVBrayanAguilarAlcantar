package ciclos;

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado=0;
        int a=0;
        int b=0;

        System.out.print("Ingresa el primer numero: ");
        a= sc.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        b= sc.nextInt();
        
        for(int i=0; i < Math.abs(a); i++){
            resultado += Math.abs(b);
        }

        if (a<0 && b<0){
            System.out.println(resultado);
        }else if(a<0 || b<0){
            resultado= -resultado; //Es como si se hiciera -1*resultado
            System.out.println(resultado);
        }else{
            System.out.println(resultado);
        }
        sc.close();
    }
}