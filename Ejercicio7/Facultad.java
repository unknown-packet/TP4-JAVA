package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String id;
    private String nombre;
    private List<Carrera> carreras;
    private boolean abierta;

    public Facultad(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
        this.abierta = true;
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
        System.out.println("Carrera agregada a " + nombre + ": " + carrera.getNombre());
    }

    public void cerrar() {
        System.out.println("Cerrando facultad: " + nombre);
        carreras.forEach(Carrera::cerrar);
        abierta = false;
    }

    public void mostrarEstructura() {
        System.out.println("=== FACULTAD: " + nombre + " | Abierta: " + abierta + " ===");
        if (carreras.isEmpty()) {
            System.out.println("  Sin carreras.");
        } else {
            carreras.forEach(Carrera::mostrarInfo);
        }
    }

    public boolean isAbierta() { return abierta; }
    public String getNombre() { return nombre; }
    public List<Carrera> getCarreras() { return carreras; }
}
