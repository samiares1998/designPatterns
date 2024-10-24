package observer;

interface Sujeto {
    void agregarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores();
}
