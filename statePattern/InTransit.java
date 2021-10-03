package statePattern;

public class InTransit implements OrderState {
	private static final double fee = 20;

	@Override
	public double handleCancellation() {
		// TODO Auto-generated method stub
		System.out.println("Contactando courier para cancelar el envío..." + "\n"
				+ "Gestionando cancelación con pasarela de pago..." + "\n"
				+ "Costo de cancelación: $" + fee);

		return 20;
	}
}
