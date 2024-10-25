package singleton;

public class Presidente {
    // Instancia única de la clase, inicializada una sola vez.
    private static Presidente instancia;

    // Constructor privado para evitar la creación de múltiples instancias.
    private Presidente() {
        System.out.println("Nuevo presidente en ejercicio.");
    }

    // Método estático que devuelve la instancia única del presidente.
    public static Presidente obtenerInstancia() {
        if (instancia == null) {
            instancia = new Presidente();
        }
        return instancia;
    }

    public void darDiscurso() {
        System.out.println("Dando discurso a la nación.");
    }
}
