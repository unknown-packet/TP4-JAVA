package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class TrenAzucarero {
    private String id;
    private Locomotora locomotora;
    private HojadeRuta hojaDeRuta;
    private List<VagonCanero> vagones;
    private boolean enServicio;

    public TrenAzucarero(String id, Locomotora locomotora, HojadeRuta hojaDeRuta) {
        this.id = id;
        this.locomotora = locomotora;
        this.hojaDeRuta = hojaDeRuta;
        this.vagones = new ArrayList<>();
        this.enServicio = true;
    }

    public void engancharVagon(VagonCanero vagon) {
        vagones.add(vagon);
        System.out.println("Vagón enganchado al tren " + id + ": " + vagon);
    }

    public VagonCanero desengancharVagon(String idVagon) {
        VagonCanero v = vagones.stream().filter(x -> x.getId().equals(idVagon)).findFirst().orElse(null);
        if (v != null) {
            vagones.remove(v);
            System.out.println("Vagón " + idVagon + " desenganchado del tren " + id + " (Agregación: sigue existiendo).");
        }
        return v; // El vagón puede ser reasignado
    }

    public double getCapacidadTotalMax() {
        return vagones.stream().mapToDouble(VagonCanero::getCapacidadMax).sum();
    }

    public double getCargaTotalActual() {
        return vagones.stream().mapToDouble(VagonCanero::getCargaActual).sum();
    }

    public void cancelarViaje() {
        System.out.println("Cancelando viaje del tren " + id + "...");
        hojaDeRuta.invalidar(); // Composición: hoja pierde validez
        enServicio = false;
    }

    public void mostrarEstado() {
        System.out.println("=== Tren: " + id + " ===");
        System.out.println("  " + locomotora);
        System.out.println("  " + hojaDeRuta);
        System.out.println("  Vagones: " + vagones.size());
        vagones.forEach(v -> System.out.println("    " + v));
        System.out.println("  Capacidad total: " + getCargaTotalActual() + "/" + getCapacidadTotalMax() + " toneladas");
        System.out.println("  En servicio: " + enServicio);
    }

    public String getId() { return id; }
}
