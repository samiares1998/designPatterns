package template;

class Cafe extends BebidaCaliente {
    @Override
    protected void agregarIngrediente() {
        System.out.println("Agregando café molido.");
    }

    @Override
    protected void agregarComplementos() {
        System.out.println("Agregando azúcar y leche.");
    }
}
