package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class PlandeEstudios {
    private String version;
    private List<Materia> materias;

    public PlandeEstudios(String version) {
        this.version = version;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public int getCargaHorariaTotal() {
        return materias.stream().mapToInt(Materia::getCargaHorariaHs).sum();
    }

    public List<Materia> getMaterias() { return materias; }

    public void mostrar() {
        System.out.println("  Plan de Estudios v" + version + " | Carga total: " + getCargaHorariaTotal() + "hs");
        materias.forEach(m -> System.out.println("    " + m));
    }
}