package statePattern;

public class Delivered implements OrderState {

	private static final double fee = 40;

	@Override
	public double handleCancellation() {
		// TODO Auto-generated method stub
		System.out.println("Gestionando pedido de recogida de artículos..." + "\n"
				+ "Plazo de devolución: 10 días hábiles" + "\n" + "Costo de cancelación: $" + fee);

		return 40;
	}
}
