package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("PLATAFORMA DE TELEMEDICINA");

        Medico drRamirez = new Medico("M01", "Laura Ramírez", "Cardiología");
        Medico drVillalobos = new Medico("M02", "Pedro Villalobos", "Clínica General");
        System.out.println("Médicos registrados: " + drRamirez);
        System.out.println("Médicos registrados: " + drVillalobos);

        Paciente paciente1 = new Paciente("P001", "Roberto Saavedra", 52);
        System.out.println("\nPaciente creado: " + paciente1);

        paciente1.realizarConsulta(drVillalobos, "Fiebre y dolor de garganta");
        paciente1.agregarReceta(drVillalobos, "Ibuprofeno 400mg cada 8hs por 5 días");
        paciente1.realizarConsulta(drRamirez, "Control de presión arterial elevada");
        paciente1.agregarReceta(drRamirez, "Enalapril 10mg una vez por día");

        System.out.println();
        paciente1.verReporteHistorico();
        paciente1.darDeBaja();

        System.out.println("\nLos médicos siguen activos tras la baja del paciente:");
        System.out.println(drRamirez);
        System.out.println(drVillalobos);
        System.out.println("\nIntento de consulta a paciente dado de baja:");
        paciente1.realizarConsulta(drVillalobos, "Consulta de seguimiento");
    }
}