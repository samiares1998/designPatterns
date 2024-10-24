package observer;

import java.util.ArrayList;
import java.util.List;

class CanalDeYouTube implements Sujeto {
    private List<Observador> suscriptores = new ArrayList<>();
    private String nombreVideo;

    @Override
    public void agregarObservador(Observador observador) {
        suscriptores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        suscriptores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : suscriptores) {
            observador.actualizar(nombreVideo);
        }
    }

    public void subirNuevoVideo(String nombreVideo) {
        this.nombreVideo = nombreVideo;
        System.out.println("Canal: Subiendo el nuevo video: " + nombreVideo);
        notificarObservadores();
    }
}