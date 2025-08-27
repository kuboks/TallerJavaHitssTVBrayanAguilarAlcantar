package test;

import clases.Producto;
import clases.Venta;

public class TestMain {
    public static void main(String[] args) {
        Producto producto1= new Producto("Leche Santa Clara 1L", 20.50);
        Producto producto2= new Producto("Galletas Maria Gamesa 30g", 12.35);
        Producto producto3= new Producto("Pan Tostado Bimbo", 31.45);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println("-------------Ventas-------------");
        Venta venta1= new Venta(producto1, 2);
        Venta venta2= new Venta(producto3, 3);
        //Se crea con un objeto anonimo
        Venta venta3= new Venta(new Producto("Refresco Coca-Cola 3L", 47), 4);

        System.out.println(venta1);
        System.out.println(venta2);
        System.out.println(venta3);
    }
}
