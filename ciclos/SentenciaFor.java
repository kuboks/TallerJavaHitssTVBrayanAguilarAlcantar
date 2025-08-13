package ciclos;

public class SentenciaFor {
    public static void main(String[] args) {
        for(int i=0; i<20; i++){

            //break tambien sirve para interrumpir el flujo del ciclo
            //continue sirve para omitir valores
            if(i%2==0){
                continue;
            }
            if(i==9){
                System.out.println("El valor de i se quedo en: "+ i);
                break;
            }

            System.out.println(i);
        }
    }
}
