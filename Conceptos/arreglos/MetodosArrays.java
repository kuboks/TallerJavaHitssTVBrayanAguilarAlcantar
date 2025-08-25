package arreglos;

import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        final int N=10;
        int[] edades= {34, 55, 23, 66, 77, 89, 99, 100, 25, 24};
        int[] precios= new int[N];
        int valores;

        for (int edad : edades) {
            System.out.println("Edad: "+ edad);
        }

        // Convertir un array a string
        System.out.println(Arrays.toString(edades));
        //Busqueda binaria antes de ordenar
        System.out.println(Arrays.binarySearch(edades, 66));
        // Metodo de ordenamiento de un array
        Arrays.sort(edades);
        System.out.println(Arrays.toString(edades));
        // Busqueda binaria despues de ordenar el arreglo
        System.out.println("Indice: " + Arrays.binarySearch(edades, 66));

        //Metodo de relllenar con un mismo valor
        //Antes de usar fill
        for (int precio : precios) {
            System.out.println(precio);
        }

        Arrays.fill(precios, 10);
        System.out.println("Despues de usar fill");
        System.out.println(Arrays.toString(precios));

        //Metodo fill usando rangos
        Arrays.fill(precios, 0, 5, 5);
        System.out.println(Arrays.toString(precios));

    }
}
