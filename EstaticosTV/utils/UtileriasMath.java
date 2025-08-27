package utils;

public class UtileriasMath{
    //Atributo estattico
    public static final double PI= 3.1416;
    
    //Los metodos estaticos no pueden usar variables no estaticas
    public int valor;

    //Metodo estatico
    public static long square(int numero){
        return numero* numero;
    }

    public static double getPi() {
        return PI;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
}