package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("LOGÍSTICA TREN AZUCARERO");

        Locomotora loco1 = new Locomotora("L01", "GE U20C", 4000);

        HojadeRuta hoja1 = new HojadeRuta("HR-001", "Monteros", "Tucumán Central");
        TrenAzucarero tren1 = new TrenAzucarero("T001", loco1, hoja1);

        VagonCanero v1 = new VagonCanero("V01", 60);
        VagonCanero v2 = new VagonCanero("V02", 60);
        VagonCanero v3 = new VagonCanero("V03", 70);

        tren1.engancharVagon(v1);
        tren1.engancharVagon(v2);
        tren1.engancharVagon(v3);

        System.out.println("\nCargando vagones:");
        v1.cargar(50);
        v2.cargar(40);
        v3.cargar(65);

        System.out.println();
        tren1.mostrarEstado();

        System.out.println("\nDesenganche y reasignación de vagón V03:");
        VagonCanero vagonReasignado = tren1.desengancharVagon("V03");

        Locomotora loco2 = new Locomotora("L02", "Alco RSD-16", 3000);
        HojadeRuta hoja2 = new HojadeRuta("HR-002", "Ledesma", "Rosario");
        TrenAzucarero tren2 = new TrenAzucarero("T002", loco2, hoja2);
        tren2.engancharVagon(vagonReasignado);

        System.out.println("\nEstado actualizado del Tren 1:");
        tren1.mostrarEstado();
        System.out.println("\nEstado del Tren 2:");
        tren2.mostrarEstado();
        System.out.println("\nCancelación del Tren 1:");
        tren1.cancelarViaje();
        tren1.mostrarEstado();
    }
}