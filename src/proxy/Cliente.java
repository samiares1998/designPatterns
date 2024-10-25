package proxy;

public class Cliente {
    public static void main(String[] args) {
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(1000); // Saldo inicial
        tarjeta.realizarPago(200); // Pago autorizado
        tarjeta.realizarPago(900); // Pago rechazado
    }
}
