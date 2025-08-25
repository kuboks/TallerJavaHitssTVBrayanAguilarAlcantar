package arreglos;

public class DeclaracionArreglos {
    public static void main(String[] args) {
        final int N=10;

        // Declaracion de arreglos
        int[] numeros;
        
        // Inicializacion
        numeros= new int[N];

        // numeros[0]= 10;
        // numeros[1]= 20;
        // numeros[4]= 50;
        // numeros[numeros.length-1]= 100;
        int valor=10;

        String[] nombres= new String[N];
        for(int i=0; i<nombres.length; i++){
            System.out.println("Elemento "+ (i+1)+" : "+ nombres[i]);
        }

        for(int i =0; i<numeros.length; i++){
            // System.out.println("Elemento "+ (i+1)+": "+numeros[i]);
            numeros[i]=valor;
            valor +=10;
        }
        // Recorre del primero al ultimo
        for (int numero : numeros) {
            // if(numero==50){
            //     System.exit(-1);
            // }
            System.out.println("Numero:" +numero);
        }
        // Recorrer un arreglo del ultimo al primero
        for(int i =numeros.length-1 ; i>=0; i--){
            System.out.println("Elemento "+ (i+1)+": "+numeros[i]);
        }


        String descripcion= "Hola mundo";


        // Inicializacion directa

        char[] letras= {'i', 'w'}; 

        for(int i =0; i<letras.length; i++){
            System.out.println("Elemento: "+ (i+1)+":"+ letras[i]);
        }

        // En arreglos se usa length sin parentesis
        System.out.println("Tamaño del arreglo letras: " + letras.length);

        // En otros objetos se usa length con parentesis
        System.out.println("Tamaño de descripcion: " + descripcion.length());

        System.out.println("Imprime la direccion de memoria para numeros: " + numeros);

        int edades[] = new int[N];



        
    }
}
