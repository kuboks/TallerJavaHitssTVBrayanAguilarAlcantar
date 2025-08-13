package entrada;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nuevaCadenaNombre1="", nuevaCadenaNombre2="", nuevaCadenaNombre3="", cadenaResultante="";
        String nombre1="", nombre2="", nombre3="";

        System.out.print("Introduce el nombre1: ");
        nombre1 = sc.next();
        sc.nextLine();
        System.out.print("Introduce el nombre2: ");
        nombre2 = sc.next();
        sc.nextLine();
        System.out.print("Introduce el nombre3: ");
        nombre3 = sc.next();
        sc.nextLine();
        
        nuevaCadenaNombre1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        nuevaCadenaNombre2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        nuevaCadenaNombre3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);
        
        cadenaResultante = obtenerNuevoNombre(nombre1) + "_" + obtenerNuevoNombre(nombre2) + "_" + obtenerNuevoNombre(nombre3);
        String cadenaResultante2= nuevaCadenaNombre1 + "_" + nuevaCadenaNombre2 + "_" + nuevaCadenaNombre3;


        System.out.println("Con un metodo: " + cadenaResultante);
        System.out.println("Sin usar metodo: "+ cadenaResultante2);
        sc.close();
    }

    private static String obtenerNuevoNombre(String nombre) {
        String nuevaCadenaNombre=nombre.toUpperCase().charAt(1) + "." + nombre.substring(nombre.length() - 2);
        return nuevaCadenaNombre;
    }

}