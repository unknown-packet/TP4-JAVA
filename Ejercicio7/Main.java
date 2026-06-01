package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        System.out.println("PLANIFICACIÓN ACADÉMICA UNIVERSITARIA");

        Materia m1 = new Materia("MAT01", "Formación Humanística II", 80);
        Materia m2 = new Materia("MAT02", "Programación II", 80);
        Materia m3 = new Materia("MAT03", "Álgebra Discreta", 64);
        Materia m4 = new Materia("MAT04", "Análisis Matemático III", 64);
        Materia m5 = new Materia("MAT05", "Física III", 48);

        PlandeEstudios planInfo = new PlandeEstudios("2023");
        planInfo.agregarMateria(m1);
        planInfo.agregarMateria(m2);
        planInfo.agregarMateria(m3);
        planInfo.agregarMateria(m4);

        PlandeEstudios planIndustrial = new PlandeEstudios("2022");
        planIndustrial.agregarMateria(m3);
        planIndustrial.agregarMateria(m5);

        Carrera ingInfo = new Carrera("C001", "Ingeniería Informática", planInfo);
        Carrera ingIndustrial = new Carrera("C002", "Ingeniería Industrial", planIndustrial);

        Facultad fing = new Facultad("F001", "Facultad de Ingeniería");
        fing.agregarCarrera(ingInfo);
        fing.agregarCarrera(ingIndustrial);

        System.out.println();
        fing.mostrarEstructura();

        System.out.println("\nAsignación de Docentes:");
        Docente docente1 = new Docente("D01", "Prof. Castillo", 160);
        Docente docente2 = new Docente("D02", "Prof. Fernández", 80);

        docente1.asignarMateria(m1);
        docente1.asignarMateria(m2);
        docente1.asignarMateria(m3);

        docente2.asignarMateria(m4);
        docente2.asignarMateria(m5);
        docente2.asignarMateria(m1);

        System.out.println("\nValidación de carga horaria:");
        System.out.println(docente1);
        System.out.println(docente2);

        System.out.println("\nCierre de Facultad:");
        fing.cerrar();
        System.out.println();
        fing.mostrarEstructura();

        System.out.println("\nDocentes siguen activos tras el cierre:");
        System.out.println(docente1);
        System.out.println(docente2);
    }
}