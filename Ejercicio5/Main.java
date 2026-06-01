package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE GESTIÓN E-SPORTS");

        Jugador j1 = new Jugador("JG01", "ShadowX", "Support");
        Jugador j2 = new Jugador("JG02", "IronFist", "Asalto");
        Jugador j3 = new Jugador("JG03", "StormTank", "Tanque");

        Equipo equipo = new Equipo("Team Cóndor");
        equipo.ficharJugador(j1);
        equipo.ficharJugador(j2);
        equipo.ficharJugador(j3);

        System.out.println();
        equipo.simularPartidaVictoria();
        equipo.simularPartidaVictoria();
        equipo.simularPartidaDerrota();
        equipo.simularPartidaVictoria();

        equipo.registrarTrofeo(new Trofeo("1° Lugar", "Copa NOA 2025", 5000));
        equipo.registrarTrofeo(new Trofeo("Campeón Nacional", "Liga Argentina 2026", 15000));

        System.out.println();
        equipo.mostrarEstado();

        equipo.disolver();

        System.out.println("\nJugadores tras la disolución del equipo:");
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);

        System.out.println("\nEstado final del equipo:");
        equipo.mostrarEstado();
    }
}