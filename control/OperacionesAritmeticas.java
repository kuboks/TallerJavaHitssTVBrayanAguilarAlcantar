package control;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        char operador;
        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();
        System.out.print("Ingrese el operador (+, -, *, /, %): ");
        operador = sc.next().charAt(0);

        int resultado = switch (operador) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Error: División por cero no permitida.");
                    yield 0; // Valor por defecto en caso de división por cero
                }else {
                    yield a / b;
                }
            }
            case '%' -> a % b;
            default -> 0;
        };
        sc.close();

        System.out.println("El resultado de " + a + " " + operador + " " + b + " es: " + resultado);
    }
}
