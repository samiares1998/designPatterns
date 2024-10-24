package dependencyInjection.withDependency;

public class Car {
    private Engine engine;

    // Inyectamos el Engine mediante el constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
