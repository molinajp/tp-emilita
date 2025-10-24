package parte1;

public class PagoTarjetaCredito implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        // 5% de descuento con tarjeta
        return monto * 0.95;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado por $" + monto);
    }
}
