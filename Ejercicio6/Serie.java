package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String id;
    private String titulo;
    private String genero;
    private List<Temporada> temporadas;

    public Serie(String id, String titulo, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public int getDuracionTotalMinutos() {
        return temporadas.stream().mapToInt(Temporada::getDuracionTotalMinutos).sum();
    }

    public void mostrarCatalogo() {
        System.out.println("=== SERIE: " + titulo + " | Género: " + genero + " ===");
        System.out.println("Temporadas: " + temporadas.size());
        temporadas.forEach(Temporada::mostrarInfo);
        int totalMin = getDuracionTotalMinutos();
        System.out.println("Duración total: " + totalMin + " min (" +
                String.format("%.1f", totalMin / 60.0) + " horas)");
    }
}