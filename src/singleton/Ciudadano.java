package singleton;

public class Ciudadano {
    public static void main(String[] args) {
        Presidente presidente1 = Presidente.obtenerInstancia();
        presidente1.darDiscurso();

        // Intento de obtener otra instancia
        Presidente presidente2 = Presidente.obtenerInstancia();
        presidente2.darDiscurso();

        // Comprobando si ambas referencias apuntan al mismo objeto
        System.out.println(presidente1 == presidente2); // Debería imprimir true
    }
}
