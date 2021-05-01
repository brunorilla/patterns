package observerPattern;

public abstract class Termometro implements Observer {
	
	private Temperatura sujeto;
	protected double tempActual;

	public Termometro(Observable sujeto) {
		this.sujeto = (Temperatura) sujeto;
		sujeto.add(this);
		update();
	}
	
	// Servirá para actualizar la temperatura en el sistema  que corresponda.
	protected abstract double temperaturaConvertida(double kelvins);
	
	
	@Override
	public void update() {
		tempActual = temperaturaConvertida(sujeto.getValor());
		show();

	}
	
	private void show() {
		System.out.println(this);
	}

	public void desuscribir() {
		sujeto.delete(this);
	}
}
