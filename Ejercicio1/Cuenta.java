package Ejercicio1;

public class Cuenta {
    public enum Moneda { PESOS, DOLARES, CRIPTO }

    private String id;
    private Moneda moneda;
    private double saldo;

    public Cuenta(String id, Moneda moneda, double saldoInicial) {
        this.id = id;
        this.moneda = moneda;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("El monto debe ser positivo.");
        saldo += monto;
        System.out.println("  Depósito de " + monto + " " + moneda + ". Nuevo saldo: " + saldo);
    }

    public void extraer(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("El monto debe ser positivo.");
        if (monto > saldo) throw new IllegalStateException("Saldo insuficiente en cuenta " + id);
        saldo -= monto;
        System.out.println("  Extracción de " + monto + " " + moneda + ". Nuevo saldo: " + saldo);
    }

    public double getSaldo() { return saldo; }
    public Moneda getMoneda() { return moneda; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return "Cuenta[" + id + "] " + moneda + " | Saldo: " + saldo;
    }
}