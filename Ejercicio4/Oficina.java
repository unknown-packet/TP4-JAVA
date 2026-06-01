package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String id;
    private int piso;
    private int capacidadPersonas;
    private boolean disponible;
    private List<Mobiliario> inventario; // Agregación

    public Oficina(String id, int piso, int capacidadPersonas) {
        this.id = id;
        this.piso = piso;
        this.capacidadPersonas = capacidadPersonas;
        this.disponible = true;
        this.inventario = new ArrayList<>();
    }

    public void agregarMobiliario(Mobiliario m) {
        m.asignar();
        inventario.add(m);
    }

    public List<Mobiliario> remodelar() {
        System.out.println("Remodelando oficina " + id + "...");
        List<Mobiliario> retirados = new ArrayList<>(inventario);
        for (Mobiliario m : retirados) {
            m.marcarEnDeposito();
        }
        inventario.clear();
        return retirados;
    }

    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public void mostrarInfo() {
        System.out.println("  Oficina[" + id + "] Piso " + piso +
                " | Cap: " + capacidadPersonas + " personas" +
                " | Disponible: " + disponible);
        inventario.forEach(m -> System.out.println("    -> " + m));
    }

    public boolean isDisponible() { return disponible; }
    public String getId() { return id; }
    public int getPiso() { return piso; }
}
