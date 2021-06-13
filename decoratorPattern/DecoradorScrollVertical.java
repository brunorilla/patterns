package decoratorPattern;

// DECORADOR CONCRETO
public class DecoradorScrollVertical extends DecoradorVentana {

	public DecoradorScrollVertical(ComponenteVisual ventanaDecorada) {
		super(ventanaDecorada);

	}
	
	public void dibujar() {
		super.dibujar();
		dibujarScrollVertical();
	}
	
	private void dibujarScrollVertical() {
		System.out.println("Decoro con un scroll vertical");
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + ", incluyendo scroll vertical";
	}

}
