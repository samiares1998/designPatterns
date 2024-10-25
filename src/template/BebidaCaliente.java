package template;

abstract class BebidaCaliente {

    // Método template que define los pasos de preparación
    public final void preparar() {
        calentarAgua();
        agregarIngrediente();
        agregarComplementos();
        servir();
    }

    // Paso común para calentar el agua
    private void calentarAgua() {
        System.out.println("Calentando agua...");
    }

    // Paso que varía dependiendo de la bebida
    protected abstract void agregarIngrediente();

    // Paso opcional, puede ser sobrescrito
    protected void agregarComplementos() {
        // Opcional: no hace nada por defecto
    }

    // Paso común para servir la bebida
    private void servir() {
        System.out.println("Sirviendo la bebida.");
    }
}
