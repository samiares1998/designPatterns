package dependencyInjection.withDependency;

public class Main {
    public static void main(String[] args) {
        // Creamos el objeto Engine afuera y lo pasamos a Car
        Engine engine = new Engine();
        Car car = new Car(engine);  // Inyectamos Engine desde afuera
        car.drive();
    }
}
