package test;

import java.util.ArrayList;
import java.util.List;

import clases.Cuenta;

public class TestMain {
    public static void main(String[] args) {
        List<Cuenta> cuentas = new ArrayList<>();

        Cuenta cuenta1= new Cuenta("Brayan", 10000);
        Cuenta cuenta2= new Cuenta("Kubo", 5000);
        Cuenta cuenta3= new Cuenta("Sneiker", 8000);
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);

        cuenta1.depositar(3000);
        cuenta2.retirar(2000);
        cuenta1.retirar(2000);
        cuenta2.depositar(5000);

        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }
}
