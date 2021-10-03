package decoratorPattern;
// CLASE DECORADOR
public abstract class DecoradorVentana implements ComponenteVisual {
	
	private ComponenteVisual ventanaDecorada;
	
	public DecoradorVentana (ComponenteVisual ventanaDecorada) {
		this.ventanaDecorada = ventanaDecorada;
	}
	
	@Override
	public void dibujar() {
		ventanaDecorada.dibujar();

	}

	@Override
	public String getDescripcion() {
		return ventanaDecorada.getDescripcion();
	}

}
