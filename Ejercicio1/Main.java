package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("       SISTEMA DE GESTIÓN NEOBANCO");
        System.out.println("=======================================\n");

        Usuario usuario1 = new Usuario(
                "U01",
                "Juan Lera",
                "JUAN.lERA@email.com"
        );

        System.out.println("USUARIO CREADO");
        System.out.println(usuario1);

        Billetera billetera = usuario1.getBilletera();

        billetera.agregarCuenta(new Cuenta("C01", Cuenta.Moneda.PESOS, 100000));
        billetera.agregarCuenta(new Cuenta("C02", Cuenta.Moneda.PESOS, 50000));
        billetera.agregarCuenta(new Cuenta("C03", Cuenta.Moneda.DOLARES, 2000));
        billetera.agregarCuenta(new Cuenta("C04", Cuenta.Moneda.CRIPTO, 500));

        TarjetaCredito visa = new TarjetaCredito(
                "4532-1234-5678-9012",
                "Juan Lera",
                80000
        );

        TarjetaCredito master = new TarjetaCredito(
                "5412-7534-1234-5678",
                "Juan Lera",
                120000
        );

        billetera.agregarTarjeta(visa);
        billetera.agregarTarjeta(master);

        System.out.println("\n=======================================");
        System.out.println("           RESUMEN INICIAL");
        System.out.println("=======================================");

        billetera.mostrarResumen();

        System.out.println("\n=======================================");
        System.out.println("     TRANSFERENCIA ENTRE CUENTAS");
        System.out.println("=======================================");

        billetera.transferirEntreCuentas("C01", "C02", 20000);

        System.out.println("\n=======================================");
        System.out.println("         GASTO CON TARJETA");
        System.out.println("=======================================");

        visa.gastar(15000);

        System.out.println("\n=======================================");
        System.out.println("            ESTADO FINAL");
        System.out.println("=======================================");

        billetera.mostrarResumen();

        System.out.println("\n=======================================");
        System.out.println("        CIERRE DE BILLETERA");
        System.out.println("=======================================");

        Usuario usuario2 = new Usuario(
                "U02",
                "Juan Lera (Nueva Cuenta)",
                "Juan.nueva@email.com"
        );

        usuario1.cerrarBilletera(usuario2.getBilletera());

        System.out.println("\n=======================================");
        System.out.println("      TARJETAS MIGRADAS");
        System.out.println("=======================================");

        usuario2.getBilletera().mostrarResumen();

        System.out.println("\n=======================================");
        System.out.println("      FIN DE LA DEMOSTRACIÓN");
        System.out.println("=======================================");
    }
}