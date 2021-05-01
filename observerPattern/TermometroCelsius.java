package observerPattern;

public class TermometroCelsius extends Termometro {

	public TermometroCelsius(Observable sujeto) {
		super(sujeto);
	}
	
	@Override
	protected double temperaturaConvertida(double kelvins) {
		// TODO Auto-generated method stub
		return kelvins - 273;
	}

	public String toString() {
		return String.format("[%s]: %s", "TermometroCelsius", tempActual);
	}
}
