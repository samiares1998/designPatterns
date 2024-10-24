package dependencyInjection.withoutDependency;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();  // La clase Car crea su propia dependencia
        car.drive();
    }
}
