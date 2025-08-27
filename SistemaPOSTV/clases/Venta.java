package clases;

public class Venta {
    private final int id;
    Producto producto;
    private int cantidad;

    private static int contador;

    public Venta(Producto producto, int cantidad) {
        this();
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Venta() {
        this.id= ++contador;
    }

    public int getId() {
        return id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static int getContador() {
        return contador;
    }

    public double subtotal(){
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "{id: " + id + ", producto: " + producto + ", cantidad: " + cantidad + ", subtotal: " + subtotal() + "}";
    }

    
}
