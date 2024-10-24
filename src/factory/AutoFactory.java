package factory;

class AutoFactory {
    public static Auto crearAuto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            case "deportivo":
                return new Deportivo();
            default:
                throw new IllegalArgumentException("Tipo de auto no reconocido: " + tipo);
        }
    }
}
