package statePattern;

public class Paid implements OrderState {
	private static final double fee = 10;
	@Override
	public double handleCancellation() {
		// TODO Auto-generated method stub
		System.out.println("Contactando a la pasarela de pago para dar marcha atr�s al pago. \n La cancelaci�n tiene un costo de $" + fee);

		return 0;
	}

}
