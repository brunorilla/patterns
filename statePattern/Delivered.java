package statePattern;

public class Delivered implements OrderState {

	private static final double fee = 40;

	@Override
	public double handleCancellation() {
		// TODO Auto-generated method stub
		System.out.println("Gestionando pedido de recogida de art�culos..." + "\n"
				+ "Plazo de devoluci�n: 10 d�as h�biles" + "\n" + "Costo de cancelaci�n: $" + fee);

		return 40;
	}
}
