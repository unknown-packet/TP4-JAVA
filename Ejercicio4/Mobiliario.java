package Ejercicio4;

public class Mobiliario {
    public enum Tipo { ESCRITORIO, SILLA_ERGONOMICA, LOCKER, PIZARRON }

    private String id;
    private Tipo tipo;
    private String estado;

    public Mobiliario(String id, Tipo tipo) {
        this.id = id;
        this.tipo = tipo;
        this.estado = "ASIGNADO";
    }

    public void marcarEnDeposito() {
        this.estado = "EN_DEPOSITO";
        System.out.println("  Mueble " + id + " enviado al depósito.");
    }

    public void asignar() {
        this.estado = "ASIGNADO";
        System.out.println("  Mueble " + id + " asignado.");
    }

    public String getId() { return id; }
    public Tipo getTipo() { return tipo; }
    public String getEstado() { return estado; }

    @Override
    public String toString() {
        return "Mueble[" + id + "] " + tipo + " - " + estado;
    }
}