package clases;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private static int contadorCuentas = 1;
    private int idCuenta;
    private String nombreTitular;
    private double saldo;
    private List<Transaccion> historial;

    public Cuenta(String nombreTitular, double saldo) {
        this.idCuenta= contadorCuentas++;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.historial = new ArrayList<>();
    }

    public void depositar(double monto){
        saldo += monto;
        historial.add(new Transaccion(idCuenta, "Depósito", monto));
        
    }

    public boolean retirar(double monto){
        if (saldo >= monto) {
            saldo -= monto;
            historial.add(new Transaccion(idCuenta, "Retiro", monto));
            return true;
        } else {
            System.out.println("Fondos insuficientes para el retiro.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "{idCuenta: " + idCuenta + ", nombreTitular: " + nombreTitular + ", saldo: " + saldo + ", historial: " +
                historial + "}";
    }
}
