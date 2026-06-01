package Ejercicio5;

public class Jugador {
    private String id;
    private String nickname;
    private String rolPrincipal;
    private int victorias;
    private int derrotas;
    private boolean agenteLibre;

    public Jugador(String id, String nickname, String rolPrincipal) {
        this.id = id;
        this.nickname = nickname;
        this.rolPrincipal = rolPrincipal;
        this.victorias = 0;
        this.derrotas = 0;
        this.agenteLibre = true;
    }

    public void registrarVictoria() { victorias++; }
    public void registrarDerrota() { derrotas++; }

    public void marcarAgenteLibre() {
        this.agenteLibre = true;
        System.out.println("  " + nickname + " es ahora agente libre.");
    }

    public void fichar() { this.agenteLibre = false; }

    public double getWinRate() {
        int total = victorias + derrotas;
        return total == 0 ? 0 : (double) victorias / total * 100;
    }

    public String getNickname() { return nickname; }
    public boolean isAgenteLibre() { return agenteLibre; }

    @Override
    public String toString() {
        return "Jugador[" + id + "] " + nickname + " (" + rolPrincipal + ")" +
                " | V:" + victorias + " D:" + derrotas +
                " | WR: " + String.format("%.1f", getWinRate()) + "%" +
                " | Libre: " + agenteLibre;
    }
}
