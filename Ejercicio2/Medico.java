package Ejercicio2;

public class Medico {
    private String matricula;
    private String nombre;
    private String especialidad;

    public Medico(String matricula, String nombre, String especialidad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String realizarDiagnostico(String descripcion) {
        System.out.println("Dr/a. " + nombre + " emite diagnóstico: " + descripcion);
        return descripcion;
    }

    public String emitirReceta(String medicamento) {
        System.out.println("Dr/a. " + nombre + " receta: " + medicamento);
        return medicamento;
    }

    public String getNombre() { return nombre; }
    public String getMatricula() { return matricula; }
    public String getEspecialidad() { return especialidad; }

    @Override
    public String toString() {
        return "Médico[" + matricula + "] Dr/a. " + nombre + " - " + especialidad;
    }
}
