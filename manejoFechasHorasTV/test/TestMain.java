package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import pos.Venta;

public class TestMain {
    public static void main(String[] args) {
        // Venta v1= new Venta("Lecha Santa Clara", 30.45);
        // System.out.println(v1);
        // System.out.println("Fecha formateada " + v1.fechaATexto());
        // Venta v2= new Venta();
        // v2.setProducto("Sabritas");
        // v2.setPrecio(18.99);
        // System.out.println(v2);

        // v2.textoAFecha();

        LocalDate hoy= LocalDate.now();
        DateTimeFormatter formatoDefault= DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

        System.out.println("Hoy es " + hoy.format(formatoDefault));

        DateTimeFormatter formatoIngles= DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH);
        System.out.println("Hoy es (ingles) " + hoy.format(formatoIngles));

        // new locale ya esta deprecado
        DateTimeFormatter formatoEspanol= DateTimeFormatter
        .ofPattern("EEEE, dd MMMM yyyy", new Locale("es"));

        DateTimeFormatter formatoEspanol2= DateTimeFormatter
        .ofPattern("EEEE, dd MMMM yyyy", Locale.of("es"));
        System.out.println("Hoy es (español España) " + hoy.format(formatoEspanol));
        System.out.println("Hoy es (español2) " + hoy.format(formatoEspanol2));

        // Se puede investigar el codigo de cada pais, mexico es MX
        DateTimeFormatter formatoEspanolMX= DateTimeFormatter
        .ofPattern("EEEE, dd MMMM yyyy", Locale.of("es", "MX"));
        System.out.println("Hoy es (español mexicano) " + hoy.format(formatoEspanolMX));
    }
}
