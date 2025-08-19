package ciclos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota;
        int i=1;
        double sumaSuperior=0;
        double sumaInferior=0;
        int contadorNotas1=0 ;
        int contadorSuperior=0;
        int contadorInferior=0;

        System.out.println("Ingresa 20 notas en una escala del 1 a 10: ");
        while (i<=20) {
            System.out.print("Nota " + i + ": ");
            nota= sc.nextDouble();

            if(nota<1.0 || nota>10.0){
                System.out.println("Ingresaste una nota menor que 1 o mayor que 10. Fin :)");
                System.exit(-1);
            }
            if (nota >=6.0){
                sumaSuperior+= nota;
                contadorSuperior++;
            }
            if (nota <6.0){
                sumaInferior+= nota;
                contadorInferior++;
            }
            if(nota==1.0){
                contadorNotas1++;
            }
            i++;
        }
        System.out.println("Cantidad de notas iguales a 1: " + contadorNotas1);
        System.out.println(String.format("Promedio con notas superiores a 6: %.2f", sumaSuperior/ contadorSuperior));
        System.out.println(String.format("Promedio con notas inferiores a 6: %.2f", sumaInferior/ contadorInferior));
        System.out.println(String.format("Promedio global: %.2f", (sumaInferior + sumaSuperior )/ i));
        sc.close();
    }
}
