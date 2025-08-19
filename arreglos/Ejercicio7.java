package arreglos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingresa un numero mayor a 0: ");
        int tamañoMatriz = sc.nextInt();
        if(tamañoMatriz<0){
            System.out.println("Error D:");
            System.exit(-1);
        }

        String[][] matriz = new String[tamañoMatriz][tamañoMatriz];
        System.out.println(matriz.length);
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if (i == j || j == (matriz[i].length - 1 - i)) {
                    matriz[i][j] = "x";
                } else {
                    matriz[i][j] = "_";
                }
            }
        }

        for (String[] fila : matriz) { //Saca la fila
            for (String elemento : fila) { //Se trabaja la columna
                System.out.print(elemento);
            }
            System.out.println();
        }
        sc.close();
    }
}
