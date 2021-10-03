package observerPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creo mi objeto Observable (temperatura la Ciudad de Buenos Aires)
		Temperatura baires = new Temperatura();
		
		// Voy a generar tres tipos de mediciones (Celsius, Kelvin y Fahrenheit)
		Observer termo_celsius = new TermometroCelsius(baires);
		Observer termo_fahren = new TermometroFahrenheit(baires);
		Observer termo_kelvin = new TermometroKelvin(baires);
		
		// Es mediod�a y la temperatura en Buenos Aires empieza a subir
		baires.setValor(293.15);
		
		// En Argentina s�lo se usa la temperatura en Celsius, por lo tanto voy a desuscribir el resto de los term�metros.
		
		baires.delete(termo_kelvin);
		baires.delete(termo_fahren);
		
		// Son las 16hs y la temperatura sube a su m�xima del d�a:
		baires.setValor(298.15);
	}

}
