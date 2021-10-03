package statePattern;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Client {
	public static void main(String[] args) {
		Order order = new Order();
		Order order2 = new Order();

		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				
				order.paymentSuccessful();
				order2.paymentSuccessful();
				order2.delivered();
				order.cancel();
			}
		}, 3000);

		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {


				order2.cancel();
				try {
					order2.cancel();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}, 5000);

	}
}
