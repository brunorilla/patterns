package statePattern;

public class New implements OrderState {

	@Override
	public double handleCancellation() {
		// TODO Auto-generated method stub
		System.out.println("Nueva orden. No hace falta procesar la cancelaci�n.");
		return 0;
	}

}
