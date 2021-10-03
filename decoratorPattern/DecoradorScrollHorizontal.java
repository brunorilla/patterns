package decoratorPattern;

// DECORADOR CONCRETO
public class DecoradorScrollHorizontal extends DecoradorVentana {

	public DecoradorScrollHorizontal(ComponenteVisual ventanaDecorada) {
		super(ventanaDecorada);
	
	}
	
	public void dibujar() {
		super.dibujar();
		dibujarScrollHorizontal();
	}
	
	private void dibujarScrollHorizontal() {
		System.out.println("Decoro con un scroll horizontal");
		
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + ", incluyendo un scroll horizontal";
	}
	
}
