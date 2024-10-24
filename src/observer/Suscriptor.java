package observer;

class Suscriptor implements Observador {
    private String nombre;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String nombreVideo) {
        System.out.println(nombre + " ha sido notificado del nuevo video: " + nombreVideo);
    }
}
