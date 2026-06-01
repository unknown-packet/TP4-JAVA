package Ejercicio3;

public class Locomotora {
    private String id;
    private String modelo;
    private int potenciaHP;

    public Locomotora(String id, String modelo, int potenciaHP) {
        this.id = id;
        this.modelo = modelo;
        this.potenciaHP = potenciaHP;
    }

    public String getId() { return id; }

    @Override
    public String toString() {
        return "Locomotora[" + id + "] Modelo: " + modelo + " | Potencia: " + potenciaHP + "HP";
    }
}
