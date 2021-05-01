package observerPattern;

public class TermometroFahrenheit extends Termometro {

	public TermometroFahrenheit(Observable sujeto) {
		// TODO Auto-generated constructor stub
		super(sujeto);
	}
	
	@Override
	protected double temperaturaConvertida(double kelvins) {
		// TODO Auto-generated method stub
		return (kelvins - 273) * 1.8 + 32;
	}
	

	public String toString() {
		return String.format("[%s]: %s", "TermometroFahrenheit", tempActual);
	}


}
