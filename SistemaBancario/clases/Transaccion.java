package clases;

public class Transaccion {
    private static int contadorTransacciones = 1;
    private int idTransaccion;
    private int idCuenta;
    private String tipo;
    private double monto;

    public Transaccion(int idCuenta, String tipo, double monto) {
        this.idTransaccion = contadorTransacciones++;
        this.idCuenta = idCuenta;
        this.tipo = tipo;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "{idTransaccion: " + idTransaccion + ", Cuenta: " + idCuenta + ", Tipo: " + tipo + ", Monto:" + monto + "}";
    }


    
}
