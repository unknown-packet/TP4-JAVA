package Ejercicio7;

public class Carrera {
    private String id;
    private String nombre;
    private PlandeEstudios planDeEstudios; // Composición
    private boolean activa;

    public Carrera(String id, String nombre, PlandeEstudios plan) {
        this.id = id;
        this.nombre = nombre;
        this.planDeEstudios = plan;
        this.activa = true;
    }

    public void cerrar() {
        activa = false;
        System.out.println("  Carrera " + nombre + " cerrada (facultad cerró).");
    }

    public void mostrarInfo() {
        System.out.println("  Carrera[" + id + "] " + nombre + " | Activa: " + activa);
        planDeEstudios.mostrar();
    }

    public boolean isActiva() { return activa; }
    public String getNombre() { return nombre; }
    public String getId() { return id; }
    public PlandeEstudios getPlanDeEstudios() { return planDeEstudios; }
}
