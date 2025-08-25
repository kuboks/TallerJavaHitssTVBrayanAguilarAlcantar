package entrada;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // Creacion de un objeto
        // NombreClase nombreObjeto = new NombreClase(); --> Constructor por defecto
        // nombreObjeto --> Instancia del objeto
        // new --> Palabra reservada para crear un objeto
        // Constructor por defecto: no recibe parámetros
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine(); // Leer una línea completa
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt(); // Leer un entero
        System.out.print("Introduce tu estatura: ");
        double estatura = sc.nextDouble(); // Leer un número decimal
        System.out.print("Introduce tu telefono: ");
        long telefono = sc.nextLong(); // Leer un número entero largo

        System.out.println("Hola, " + nombre + ", tienes " + edad + " años" +
            ", mides " + estatura + " y tu telefono es " + telefono);
        sc.close(); // Cerrar el scanner
    }
}
