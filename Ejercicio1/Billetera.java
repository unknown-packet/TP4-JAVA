package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Billetera {
    private String id;
    private Usuario propietario;
    private List<Cuenta> cuentas;
    private List<TarjetaCredito> tarjetas;

    public Billetera(Usuario propietario) {
        this.id = "BIL-" + propietario.getId();
        this.propietario = propietario;
        this.cuentas = new ArrayList<>();
        this.tarjetas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        System.out.println("Cuenta agregada: " + cuenta);
    }

    public void agregarTarjeta(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
        System.out.println("Tarjeta agregada: " + tarjeta);
    }

    public void transferirEntreCuentas(String idOrigen, String idDestino, double monto) {
        Cuenta origen = buscarCuenta(idOrigen);
        Cuenta destino = buscarCuenta(idDestino);
        if (origen == null || destino == null)
            throw new IllegalArgumentException("Cuenta no encontrada.");
        if (!origen.getMoneda().equals(destino.getMoneda()))
            throw new IllegalStateException("No se puede transferir entre cuentas de distinta moneda.");

        System.out.println("Transfiriendo " + monto + " de [" + idOrigen + "] a [" + idDestino + "]...");
        origen.extraer(monto);
        destino.depositar(monto);
    }

    public double getSaldoConsolidado(Cuenta.Moneda moneda) {
        return cuentas.stream()
                .filter(c -> c.getMoneda() == moneda)
                .mapToDouble(Cuenta::getSaldo)
                .sum();
    }

    public void cerrar(Billetera nuevaBilletera) {
        System.out.println("  Eliminando " + cuentas.size() + " cuenta(s) (Composición)...");
        cuentas.clear();

        if (nuevaBilletera != null) {
            System.out.println("  Migrando " + tarjetas.size() + " tarjeta(s) a nueva billetera (Agregación)...");
            for (TarjetaCredito t : tarjetas) {
                nuevaBilletera.agregarTarjeta(t);
            }
        }
        tarjetas.clear();
    }

    private Cuenta buscarCuenta(String id) {
        return cuentas.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

    public void mostrarResumen() {
        System.out.println("Billetera: " + id + " // Propietario: " + propietario.getNombre());
        System.out.println("Cuentas:");
        cuentas.forEach(c -> System.out.println("  " + c));
        System.out.println("Tarjetas:");
        tarjetas.forEach(t -> System.out.println("  " + t));
        System.out.println("Saldo total en PESOS: " + getSaldoConsolidado(Cuenta.Moneda.PESOS));
        System.out.println("Saldo total en DOLARES: " + getSaldoConsolidado(Cuenta.Moneda.DOLARES));
    }

    public String getId() { return id; }
    public List<TarjetaCredito> getTarjetas() { return tarjetas; }
}