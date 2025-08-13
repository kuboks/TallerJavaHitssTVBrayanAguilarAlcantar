package control;

import java.util.Scanner;

public class Caracteres{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char caracter;
        System.out.print("Caracter: ");
        caracter = sc.next().charAt(0);
        if(Character.isLetter(caracter)){
            System.out.print("El caracter " + caracter + ": es una letra ");
            switch (caracter) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("y ademas una vocal");
                default -> System.out.println("y soy una consonante");
            }
        }else if(Character.isDigit(caracter)){
            System.out.print("El caracter " + caracter + ": un digito ");
        }else{
            System.out.print("El caracter " + caracter + ": es unun caracter especial");
        }
        sc.close();
    }
}