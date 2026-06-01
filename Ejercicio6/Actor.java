package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String id;
    private String nombre;
    private List<String> episodiosParticipados;

    public Actor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.episodiosParticipados = new ArrayList<>();
    }

    public void participarEn(String idEpisodio) {
        episodiosParticipados.add(idEpisodio);
        System.out.println("Actor " + nombre + " participa en episodio " + idEpisodio);
    }

    public String getNombre() { return nombre; }
    public String getId() { return id; }
    public List<String> getEpisodiosParticipados() { return episodiosParticipados; }

    @Override
    public String toString() {
        return "Actor[" + id + "] " + nombre + " | Episodios: " + episodiosParticipados.size();
    }
}