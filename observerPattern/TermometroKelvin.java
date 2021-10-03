package observerPattern;

public class TermometroKelvin extends Termometro {

	public TermometroKelvin(Observable sujeto) {
		super(sujeto);
	}
	
	@Override
	protected double temperaturaConvertida(double kelvins) {
		// TODO Auto-generated method stub
		return kelvins;
	}

	public String toString() {
		return String.format("[%s]: %s", "TermometroKelvin", tempActual);
	}
}
