package Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trofeo {
    private String nombre;
    private String torneo;
    private LocalDate fecha;
    private double premioUSD;

    public Trofeo(String nombre, String torneo, double premioUSD) {
        this.nombre = nombre;
        this.torneo = torneo;
        this.fecha = LocalDate.now();
        this.premioUSD = premioUSD;
    }

    @Override
    public String toString() {
        return "🏆 " + nombre + " | Torneo: " + torneo +
                " | Premio: $" + premioUSD + " | Fecha: " + fecha;
    }
    public double getPremioUSD() { return premioUSD; }
}