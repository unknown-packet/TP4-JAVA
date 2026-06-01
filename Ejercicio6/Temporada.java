package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numero;
    private int anio;
    private List<Episodio> episodios;

    public Temporada(int numero, int anio) {
        this.numero = numero;
        this.anio = anio;
        this.episodios = new ArrayList<>();
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public int getDuracionTotalMinutos() {
        return episodios.stream().mapToInt(Episodio::getDuracionMinutos).sum();
    }

    public int getNumero() { return numero; }
    public List<Episodio> getEpisodios() { return episodios; }

    public void mostrarInfo() {
        System.out.println("  Temporada " + numero + " (" + anio + ") - " +
                episodios.size() + " episodios | Duración total: " + getDuracionTotalMinutos() + " min");
        episodios.forEach(e -> System.out.println("    " + e));
    }
}
