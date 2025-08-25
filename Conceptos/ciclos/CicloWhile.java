package ciclos;

public class CicloWhile{
    public static void main(String[] args){
        int i= 1;
        System.out.println("Ciclo while");
        while (i<1000) {
            System.out.println("i: "+ i);
            i=i*2;
        }

        System.out.println("Ciclo for");

        for(int j=1;j<1000; j*=2){
            System.out.println("j: "+ j);
        }
    }
}