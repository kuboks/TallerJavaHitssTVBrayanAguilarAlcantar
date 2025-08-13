package ciclos;

public class PalabrasTermino {
    public static void main(String[] args) {
        otroMetodo();
        System.out.println("Otra sentencia");
        System.out.println("Ejecuta otro for");
        for(int i=0; i<15; i++){
            System.out.println(i);
        }
    }

    public static void otroMetodo(){
        for(int i=0; i<10; i++){
            if(i==7){

                //System.exit() sirve para terminar la ejecucion de todo el programa, puede recibir -1, 0
                System.out.println("Termina la ejecucion de otroMetodo");
                System.exit(-1);
                return;
            }
            System.out.println(i);
        }
    }
}
