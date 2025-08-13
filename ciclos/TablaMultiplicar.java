package ciclos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Ingresa el numero: ");
        // int a= sc.nextInt();

        // for(int i=0; i <= 10; i++ ){
        //     System.out.println(a + " * " + i + " = " + (a*i));
        // }

        for(int i=1; i <=10; i++){
            System.out.println("La tabla del " + i + " es:");
            for(int j=1; j<=10; ++j){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
        sc.close();
    }
}
