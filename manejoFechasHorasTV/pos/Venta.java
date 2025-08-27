package pos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venta {
    private String producto;
    private double precio;
    private LocalDateTime fechaVenta;
    
    public Venta(String producto, double precio) {
        this();
        this.producto = producto;
        this.precio = precio;        
    }

    public Venta() {
        this.fechaVenta= LocalDateTime.now();
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    // Formatear fechas
    // objeto-> texto
    // yyyy-MM-dd -> dd/MM/yyyy
    public String fechaATexto(){
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("EEEE, dd MMMM yy HH:mm:ss a");
        String fechaTexto= fechaVenta.format(formato);
        return fechaTexto;
    }
    // texto-> objeto
    public void textoAFecha(){
        String textoFecha= "25/08/2025";
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha= LocalDate.parse(textoFecha, formato);
        System.out.println("Fecha: " + fecha);
    }

    @Override
    public String toString() {
        return "{Producto: "+producto+
        ", Precio:"+precio+
        ", FechaVenta: "+ fechaVenta+"}";
    }

    
}
