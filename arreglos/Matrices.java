package arreglos;

public class Matrices {
    public static void main(String[] args) {
        final int FILAS=2;
        final int COLUMNAS=3;
        int[][] matriz= new int[FILAS][COLUMNAS];

        int[][] m= {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };
        System.out.println("Matriz recorrida usando for");
        for(int i=0; i<matriz.length;i++){ //Controla filas
            for(int j=0; j<matriz[i].length;j++){ //Debe controlar columnas
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Matriz recorrida usando foreach");
        for (int[] fila : matriz) { //Saca la fila
            for (int elemento : fila) { //Se trabaja la columna
                System.out.print(elemento+" ");
            }
            System.out.println();
        }

        System.out.println("m recorrida usando foreach");
        for (int[] fila : m) { //Saca la fila
            for (int elemento : fila) { //Se trabaja la columna
                System.out.print(elemento+" ");
            }
            System.out.println();
        }
    }
}
