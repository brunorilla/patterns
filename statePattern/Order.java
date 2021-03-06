package statePattern;


// Context Class
public class Order {
	private OrderState state;
	
	public Order() {
		state = new New();
	}
	
	public double cancel() {
		double charges = state.handleCancellation();
		state = new Cancelled();
		return charges;
	}

	public void paymentSuccessful() {
		state = new Paid();
	}

	public void dispatched() {
		state = new InTransit();
	}

	public void delivered() {
		state = new Delivered();
	}
}
