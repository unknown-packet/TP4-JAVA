package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class HistorialTrofeos {
    private List<Trofeo> trofeos;
    private boolean activo;

    public HistorialTrofeos() {
        this.trofeos = new ArrayList<>();
        this.activo = true;
    }

    public void agregarTrofeo(Trofeo trofeo) {
        if (!activo) {
            System.out.println("Historial inactivo. No se pueden agregar trofeos.");
            return;
        }
        trofeos.add(trofeo);
        System.out.println("Trofeo registrado: " + trofeo);
    }

    public double getPremioTotal() {
        return trofeos.stream().mapToDouble(Trofeo::getPremioUSD).sum();
    }

    public void disolver() {
        activo = false;
        System.out.println("  Historial de trofeos disuelto (el equipo desapareció). " +
                trofeos.size() + " trofeo(s) archivados.");
    }

    public void mostrar() {
        System.out.println("  Historial (activo=" + activo + "):");
        if (trofeos.isEmpty()) System.out.println("    Sin trofeos.");
        trofeos.forEach(t -> System.out.println("    " + t));
        System.out.println("    Premio total acumulado: $" + getPremioTotal());
    }

    public boolean isActivo() { return activo; }
}
