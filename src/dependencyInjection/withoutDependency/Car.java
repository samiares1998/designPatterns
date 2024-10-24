package dependencyInjection.withoutDependency;

public class Car {
    private Engine engine;

    public Car() {
        // Aquí creamos directamente la instancia de Engine
        this.engine = new Engine();
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
