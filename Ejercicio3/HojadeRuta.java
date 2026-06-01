package Ejercicio3;

import java.time.LocalDate;

public class HojadeRuta {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private boolean valida;

    public HojadeRuta(String codigo, String origen, String destino) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = LocalDate.now();
        this.valida = true;
    }

    public void invalidar() {
        this.valida = false;
        System.out.println("  Hoja de ruta " + codigo + " invalidada (viaje cancelado).");
    }

    public boolean isValida() { return valida; }
    public String getCodigo() { return codigo; }

    @Override
    public String toString() {
        return "HojaDeRuta[" + codigo + "] " + origen + " -> " + destino +
                " Fecha: " + fecha + " // Válida: " + valida;
    }
}
