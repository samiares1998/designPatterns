package proxy;

class BancoReal implements Banco {
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado exitosamente desde la cuenta bancaria.");
    }
}
