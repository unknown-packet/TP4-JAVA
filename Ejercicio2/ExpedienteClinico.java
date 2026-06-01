package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpedienteClinico {
    private String id;
    private List<EntradaMedica> entradas;

    public ExpedienteClinico(String idPaciente) {
        this.id = "EXP-" + idPaciente;
        this.entradas = new ArrayList<>();
    }

    public void agregarEntrada(EntradaMedica entrada) {
        entradas.add(entrada);
        System.out.println("Entrada médica registrada: " + entrada);
    }

    public void generarReporte() {
        System.out.println("=== REPORTE HISTÓRICO - Expediente " + id + " ===");
        if (entradas.isEmpty()) {
            System.out.println("Sin entradas registradas.");
            return;
        }
        entradas.stream()
                .sorted((a, b) -> b.getFecha().compareTo(a.getFecha()))
                .forEach(e -> System.out.println("  " + e));
    }

    public List<EntradaMedica> getEntradasPorTipo(EntradaMedica.Tipo tipo) {
        return entradas.stream()
                .filter(e -> e.getTipo() == tipo)
                .collect(Collectors.toList());
    }

    public void eliminar() {
        System.out.println("  Eliminando expediente " + id + " con " + entradas.size() + " entrada(s) (privacidad).");
        entradas.clear();
    }

    public String getId() { return id; }
    public int getCantidadEntradas() { return entradas.size(); }
}