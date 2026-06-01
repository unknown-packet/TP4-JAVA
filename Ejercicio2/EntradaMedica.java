package Ejercicio2;

import java.time.LocalDate;

public class EntradaMedica {
    public enum Tipo { DIAGNOSTICO, RECETA, OBSERVACION }

    private String id;
    private Tipo tipo;
    private String descripcion;
    private LocalDate fecha;
    private String medicoResponsable;

    public EntradaMedica(String id, Tipo tipo, String descripcion, String medicoResponsable) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = LocalDate.now();
        this.medicoResponsable = medicoResponsable;
    }

    public Tipo getTipo() { return tipo; }
    public String getDescripcion() { return descripcion; }
    public LocalDate getFecha() { return fecha; }
    public String getMedicoResponsable() { return medicoResponsable; }

    @Override
    public String toString() {
        return "[" + fecha + "] " + tipo + " - " + descripcion +
                " (Dr/a. " + medicoResponsable + ")";
    }
}