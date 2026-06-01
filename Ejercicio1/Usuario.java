package Ejercicio1;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private Billetera billetera;

    public Usuario(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.billetera = new Billetera(this);
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void cerrarBilletera(Billetera nuevaBilletera) {
        System.out.println("Cerrando billetera de " + nombre + "...");
        billetera.cerrar(nuevaBilletera);
        billetera = null;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Usuario[" + id + "] " + nombre + " (" + email + ")";
    }
}
