package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Edificio {
    private String id;
    private String nombre;
    private String ciudad;
    private List<Oficina> oficinas;
    private List<Mobiliario> deposito;

    public Edificio(String id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.oficinas = new ArrayList<>();
        this.deposito = new ArrayList<>();
    }

    public void agregarOficina(Oficina oficina) {
        oficinas.add(oficina);
        System.out.println("Oficina agregada al edificio " + nombre + ": " + oficina.getId());
    }

    public void listarOficinasDisponibles() {
        System.out.println("=== Oficinas disponibles en " + nombre + " (" + ciudad + ") ===");
        List<Oficina> disponibles = oficinas.stream()
                .filter(Oficina::isDisponible)
                .collect(Collectors.toList());
        if (disponibles.isEmpty()) {
            System.out.println("  No hay oficinas disponibles.");
        } else {
            disponibles.forEach(Oficina::mostrarInfo);
        }
    }

    public void remodelarOficina(String idOficina) {
        Oficina o = oficinas.stream().filter(x -> x.getId().equals(idOficina)).findFirst().orElse(null);
        if (o != null) {
            List<Mobiliario> retirados = o.remodelar();
            deposito.addAll(retirados);
            o.setDisponible(false);
            System.out.println("  " + retirados.size() + " mueble(s) guardados en depósito del edificio.");
        }
    }

    public void mostrarDeposito() {
        System.out.println("Depósito de " + nombre);
        if (deposito.isEmpty()) System.out.println("  Depósito vacío.");
        deposito.forEach(m -> System.out.println("  " + m));
    }

    public String getNombre() { return nombre; }
}