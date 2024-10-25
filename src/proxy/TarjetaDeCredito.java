package proxy;

class TarjetaDeCredito implements Banco {
    private BancoReal bancoReal;
    private double saldoDisponible;

    public TarjetaDeCredito(double saldoInicial) {
        this.bancoReal = new BancoReal();
        this.saldoDisponible = saldoInicial;
    }

    @Override
    public void realizarPago(double monto) {
        if (monto <= saldoDisponible) {
            bancoReal.realizarPago(monto);
            saldoDisponible -= monto;
            System.out.println("Pago autorizado. Nuevo saldo: $" + saldoDisponible);
        } else {
            System.out.println("Pago rechazado. Saldo insuficiente.");
        }
    }
}
