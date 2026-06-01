package Ejercicio1;

public class TarjetaCredito {
    private String numero;
    private String titular;
    private double limiteCredito;
    private double saldoUsado;

    public TarjetaCredito(String numero, String titular, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldoUsado = 0;
    }

    public void gastar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("El monto debe ser positivo.");
        if (saldoUsado + monto > limiteCredito)
            throw new IllegalStateException("Límite de crédito excedido.");
        saldoUsado += monto;
        System.out.println("  Gasto de " + monto + " en tarjeta " + numero + ". Usado: " + saldoUsado + "/" + limiteCredito);
    }

    public double getDisponible() { return limiteCredito - saldoUsado; }
    public String getNumero() { return numero; }
    public String getTitular() { return titular; }

    @Override
    public String toString() {
        return "Tarjeta[" + numero + "] Titular: " + titular +
                " | Límite: " + limiteCredito + " | Disponible: " + getDisponible();
    }
}