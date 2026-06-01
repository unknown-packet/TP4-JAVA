package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println("MOTOR DE RESERVAS COWORKING");

        Edificio edificio = new Edificio("E01", "Torre Norte", "Tucumán");

        Oficina of1 = new Oficina("OF-01", 1, 10);
        Oficina of2 = new Oficina("OF-02", 2, 5);
        Oficina of3 = new Oficina("OF-03", 2, 8);

        edificio.agregarOficina(of1);
        edificio.agregarOficina(of2);
        edificio.agregarOficina(of3);

        of1.agregarMobiliario(new Mobiliario("M01", Mobiliario.Tipo.ESCRITORIO));
        of1.agregarMobiliario(new Mobiliario("M02", Mobiliario.Tipo.ESCRITORIO));
        of1.agregarMobiliario(new Mobiliario("M03", Mobiliario.Tipo.SILLA_ERGONOMICA));
        of2.agregarMobiliario(new Mobiliario("M04", Mobiliario.Tipo.ESCRITORIO));
        of2.agregarMobiliario(new Mobiliario("M05", Mobiliario.Tipo.LOCKER));
        of3.agregarMobiliario(new Mobiliario("M06", Mobiliario.Tipo.PIZARRON));

        System.out.println();
        edificio.listarOficinasDisponibles();

        System.out.println("\nRemodelación de OF-01:");
        edificio.remodelarOficina("OF-01");

        System.out.println();
        edificio.listarOficinasDisponibles();

        System.out.println();
        edificio.mostrarDeposito();
    }
}