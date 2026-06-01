package Ejercicio3;

public class VagonCanero {
    private String id;
    private double capacidadToneladasMax;
    private double cargaActual;

    public VagonCanero(String id, double capacidadToneladasMax) {
        this.id = id;
        this.capacidadToneladasMax = capacidadToneladasMax;
        this.cargaActual = 0;
    }

    public void cargar(double toneladas) {
        if (cargaActual + toneladas > capacidadToneladasMax)
            throw new IllegalStateException("Capacidad excedida en vagón " + id);
        cargaActual += toneladas;
        System.out.println("  Vagón " + id + ": cargadas " + toneladas + "t. Total: " + cargaActual + "/" + capacidadToneladasMax + "t");
    }

    public void descargar() {
        System.out.println("  Vagón " + id + " descargado (" + cargaActual + "t removidas).");
        cargaActual = 0;
    }

    public double getCapacidadMax() { return capacidadToneladasMax; }
    public double getCargaActual() { return cargaActual; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return "Vagón[" + id + "] Carga: " + cargaActual + "/" + capacidadToneladasMax + "t";
    }
}
