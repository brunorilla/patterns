package statePattern;

public class InTransit implements OrderState {
	private static final double fee = 20;

	@Override
	public double handleCancellation() {
		// TODO Auto-generated method stub
		System.out.println("Contactando courier para cancelar el env�o..." + "\n"
				+ "Gestionando cancelaci�n con pasarela de pago..." + "\n"
				+ "Costo de cancelaci�n: $" + fee);

		return 20;
	}
}
