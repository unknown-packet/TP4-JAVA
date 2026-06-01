package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA GESTIÓN STREAMING");

        Actor actorA = new Actor("AC01", "Ana Gutiérrez");
        Actor actorB = new Actor("AC02", "Marcos Peralta");
        Actor actorC = new Actor("AC03", "Sofía Herrera");

        Serie serie = new Serie("S01", "El Silencio del Norte", "Thriller");

        Temporada t1 = new Temporada(1, 2024);
        Episodio e1 = new Episodio("E101", 1, "El comienzo", 45);
        Episodio e2 = new Episodio("E102", 2, "La traición", 50);
        Episodio e3 = new Episodio("E103", 3, "El giro inesperado", 48);
        e1.agregarActor(actorA);
        e1.agregarActor(actorB);
        e2.agregarActor(actorA);
        e2.agregarActor(actorC);
        e3.agregarActor(actorA);
        t1.agregarEpisodio(e1);
        t1.agregarEpisodio(e2);
        t1.agregarEpisodio(e3);

        Temporada t2 = new Temporada(2, 2025);
        Episodio e4 = new Episodio("E201", 1, "Nuevo comienzo", 52);
        Episodio e5 = new Episodio("E202", 2, "La revelación final", 58);
        e4.agregarActor(actorB);
        e4.agregarActor(actorC);
        e5.agregarActor(actorA);
        e5.agregarActor(actorB);
        e5.agregarActor(actorC);
        t2.agregarEpisodio(e4);
        t2.agregarEpisodio(e5);

        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);

        System.out.println();
        serie.mostrarCatalogo();

        System.out.println("\n--- Participaciones de actores ---");
        System.out.println(actorA);
        System.out.println(actorB);
        System.out.println(actorC);
    }
}