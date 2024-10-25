package template;

// Clase concreta para el Té
class Te extends BebidaCaliente {
    @Override
    protected void agregarIngrediente() {
        System.out.println("Agregando bolsa de té.");
    }

    @Override
    protected void agregarComplementos() {
        System.out.println("Agregando limón.");
    }
}
