package factory;

public class Main {
    public static void main(String[] args) {
        // El cliente quiere un sedán
        Auto auto1 = AutoFactory.crearAuto("sedan");
        auto1.drive();

        // El cliente quiere un SUV
        Auto auto2 = AutoFactory.crearAuto("SUV");
        auto2.drive();

        // El cliente quiere un deportivo
        Auto auto3 = AutoFactory.crearAuto("deportivo");
        auto3.drive();
    }
}
