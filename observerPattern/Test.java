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
		
		// Es mediodía y la temperatura en Buenos Aires empieza a subir
		baires.setValor(293.15);
		
		// En Argentina sólo se usa la temperatura en Celsius, por lo tanto voy a desuscribir el resto de los termómetros.
		
		baires.delete(termo_kelvin);
		baires.delete(termo_fahren);
		
		// Son las 16hs y la temperatura sube a su máxima del día:
		baires.setValor(298.15);
	}

}
