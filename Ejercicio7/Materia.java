package Ejercicio7;

public class Materia {
    private String codigo;
    private String nombre;
    private int cargaHorariaHs;

    public Materia(String codigo, String nombre, int cargaHorariaHs) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargaHorariaHs = cargaHorariaHs;
    }

    public int getCargaHorariaHs() { return cargaHorariaHs; }
    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }

    @Override
    public String toString() {
        return "Materia[" + codigo + "] " + nombre + " | " + cargaHorariaHs + "hs";
    }
}