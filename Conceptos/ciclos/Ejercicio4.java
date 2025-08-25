package ciclos;

import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalVentas = 0.00;
        double precio;
        int opcion;
        boolean salida= false; 

        while (!salida) {
            System.out.println("\n=== MENÚ DEL CAJERO ===");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar el total de ventas");
            System.out.println("3. Salir del sistema");
            System.out.print("Seleccione una opción: ");
            opcion= sc.nextInt();
            switch (opcion) {
                case 1->{
                    System.out.println("Ingrese el precio del pedido");
                    precio=sc.nextDouble(); 
                    if (precio < 0){
                        System.out.println("Precio no valido");
                    }else{
                        totalVentas += precio;
                    } 
                }
                case 2->{
                    System.out.println(String.format("La venta lleva en total: %.2f", totalVentas )+ " $");
                }
                case 3-> {
                    System.out.println(String.format("Total de venta: %.2f", totalVentas )+ " $");
                    salida=true;
                }
                default ->System.out.println("Opcion no valida");
            }
            
        }
        System.out.println("Vuelva pronto :)");
        sc.close();
    }
}