package Ejercicio2;

public class Paciente {
    private String id;
    private String nombre;
    private int edad;
    private ExpedienteClinico expediente;
    private boolean activo;

    public Paciente(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.expediente = new ExpedienteClinico(id);
        this.activo = true;
    }

    public void realizarConsulta(Medico medico, String motivoConsulta) {
        if (!activo) {
            System.out.println("Paciente dado de baja. No se pueden agregar consultas.");
            return;
        }
        System.out.println("\n--- Consulta: " + nombre + " con " + medico.getNombre() + " ---");
        System.out.println("Motivo: " + motivoConsulta);

        String diagnostico = medico.realizarDiagnostico("Diagnóstico basado en: " + motivoConsulta);
        expediente.agregarEntrada(new EntradaMedica(
                "E" + System.currentTimeMillis(),
                EntradaMedica.Tipo.DIAGNOSTICO,
                diagnostico,
                medico.getNombre()
        ));
    }

    public void agregarReceta(Medico medico, String medicamento) {
        if (!activo) return;
        String receta = medico.emitirReceta(medicamento);
        expediente.agregarEntrada(new EntradaMedica(
                "R" + System.currentTimeMillis(),
                EntradaMedica.Tipo.RECETA,
                receta,
                medico.getNombre()
        ));
    }

    public void darDeBaja() {
        System.out.println("\nDando de baja al paciente: " + nombre);
        expediente.eliminar();
        activo = false;
        System.out.println("Paciente " + nombre + " eliminado del sistema.");
    }

    public void verReporteHistorico() {
        expediente.generarReporte();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public boolean isActivo() { return activo; }

    @Override
    public String toString() {
        return "Paciente[" + id + "] " + nombre + " (" + edad + " años) - Activo: " + activo;
    }
}
