package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Docente {
    private String legajo;
    private String nombre;
    private int maxHorasCatedra;
    private List<Materia> materiasAsignadas;
    public Docente(String legajo, String nombre, int maxHorasCatedra) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.maxHorasCatedra = maxHorasCatedra;
        this.materiasAsignadas = new ArrayList<>();
    }

    public boolean asignarMateria(Materia materia) {
        int cargaActual = getCargaActual();
        if (cargaActual + materia.getCargaHorariaHs() > maxHorasCatedra) {
            System.out.println("  ADVERTENCIA: " + nombre + " excedería su carga horaria (" +
                    (cargaActual + materia.getCargaHorariaHs()) + "/" + maxHorasCatedra + "hs). Rechazado.");
            return false;
        }
        materiasAsignadas.add(materia);
        System.out.println("  " + nombre + " asignado a: " + materia.getNombre() +
                " [Carga total: " + getCargaActual() + "/" + maxHorasCatedra + "hs]");
        return true;
    }

    public int getCargaActual() {
        return materiasAsignadas.stream().mapToInt(Materia::getCargaHorariaHs).sum();
    }

    public boolean validarCarga() {
        return getCargaActual() <= maxHorasCatedra;
    }

    public String getLegajo() { return legajo; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Docente[" + legajo + "] " + nombre +
                " | Carga: " + getCargaActual() + "/" + maxHorasCatedra + "hs" +
                " | Válido: " + validarCarga();
    }
}