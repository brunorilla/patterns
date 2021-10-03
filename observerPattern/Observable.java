package observerPattern;

import java.util.ArrayList;

// Cada sujeto observable va a tener una lista de observadores
public abstract class Observable {
	private ArrayList<Observer> observers;
	
	public Observable() {
		observers = new ArrayList<Observer>();
	}
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void delete(Observer observer) {
		observers.remove(observer);
	}
	
	// Cada sujeto observable va a poder notificar a sus observadores
	public void _notify() {
		if(observers.size() > 0) {
			for (int i = 0; i < observers.size(); i++) {
				observers.get(i).update();
			}
		}
	}

}
