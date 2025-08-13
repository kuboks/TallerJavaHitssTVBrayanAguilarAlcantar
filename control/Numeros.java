package control;

public class Numeros {
    public static void main(String[] args) {
        int numero= 6;
        String resultado;
        resultado = (numero%2==0)? "par":"impar";
        System.out.println("El numero "+ numero + " es " + resultado);
    }
}
