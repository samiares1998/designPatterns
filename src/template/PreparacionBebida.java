package template;

public class PreparacionBebida {
    public static void main(String[] args) {
        BebidaCaliente te = new Te();
        BebidaCaliente cafe = new Cafe();

        System.out.println("Preparando té:");
        te.preparar();

        System.out.println("\nPreparando café:");
        cafe.preparar();
    }
}
