package observer;

public class Main {
    public static void main(String[] args) {
        // Crear el canal de YouTube
        CanalDeYouTube canal = new CanalDeYouTube();

        // Crear suscriptores
        Suscriptor suscriptor1 = new Suscriptor("Carlos");
        Suscriptor suscriptor2 = new Suscriptor("María");
        Suscriptor suscriptor3 = new Suscriptor("Lucía");

        // Agregar suscriptores al canal
        canal.agregarObservador(suscriptor1);
        canal.agregarObservador(suscriptor2);
        canal.agregarObservador(suscriptor3);

        // Subir un nuevo video
        canal.subirNuevoVideo("Aprendiendo Java con Observer Pattern");

        // Un suscriptor se da de baja
        canal.removerObservador(suscriptor2);

        // Subir otro video
        canal.subirNuevoVideo("Patrón Observer explicado con ejemplos");
    }
}
