package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Episodio {
    private String id;
    private int numero;
    private String titulo;
    private int duracionMinutos;
    private List<Actor> actores;

    public Episodio(String id, int numero, String titulo, int duracionMinutos) {
        this.id = id;
        this.numero = numero;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
        actor.participarEn(id);
    }

    public int getDuracionMinutos() { return duracionMinutos; }
    public String getId() { return id; }
    public int getNumero() { return numero; }

    @Override
    public String toString() {
        return "Ep." + numero + " \"" + titulo + "\" [" + duracionMinutos + " min]" +
                " | Actores: " + actores.size();
    }
}