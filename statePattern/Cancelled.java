package statePattern;

public class Cancelled implements OrderState {
	@Override
	public double handleCancellation() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("La orden ya se encuentra cancelada.");  
		
	}
}
