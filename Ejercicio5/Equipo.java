package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    private HistorialTrofeos historial;
    private boolean activo;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.historial = new HistorialTrofeos();
        this.activo = true;
    }

    public void ficharJugador(Jugador jugador) {
        jugador.fichar();
        jugadores.add(jugador);
        System.out.println(jugador.getNickname() + " fichado en " + nombre);
    }

    public void registrarTrofeo(Trofeo trofeo) {
        historial.agregarTrofeo(trofeo);
    }

    public void simularPartidaVictoria() {
        jugadores.forEach(Jugador::registrarVictoria);
        System.out.println("Victoria para " + nombre + "! Estadísticas actualizadas.");
    }

    public void simularPartidaDerrota() {
        jugadores.forEach(Jugador::registrarDerrota);
        System.out.println("Derrota para " + nombre + ".");
    }

    public void disolver() {
        System.out.println("\nDisolviendo equipo: " + nombre);
        jugadores.forEach(Jugador::marcarAgenteLibre);
        historial.disolver();
        activo = false;
    }

    public void mostrarEstado() {
        System.out.println("=== Equipo: " + nombre + " | Activo: " + activo + " ===");
        System.out.println("-- Jugadores --");
        jugadores.forEach(j -> System.out.println("  " + j));
        System.out.println("-- Trofeos --");
        historial.mostrar();
    }
}