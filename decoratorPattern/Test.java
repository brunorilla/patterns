package decoratorPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ComponenteVisual ventanaDecorada = new DecoradorScrollHorizontal(new DecoradorScrollVertical(new VentanaSimple()));*/
		
	ComponenteVisual ventanaDecorada = new DecoradorScrollHorizontal(new DecoradorBordeNegro(new VentanaSimple()));
	ventanaDecorada.dibujar();
		
	}

}
