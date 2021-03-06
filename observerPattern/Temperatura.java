package observerPattern;

public class Temperatura extends Observable {
	private double valor;
	
	public Temperatura() {
		valor = 0;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		// el if evita que haya notificaciones innecesarias
		if(valor != this.valor) {
			this.valor = valor;
			_notify();
		}
	}
}
