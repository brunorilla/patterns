package decoratorPattern;

// COMPONENTE CONCRETO
public class VentanaSimple implements ComponenteVisual {

	@Override
	public void dibujar() {
		System.out.println("Dibujo una ventana");

	}

	@Override
	public String getDescripcion() {
		return "Ventana simple";
	}

}
