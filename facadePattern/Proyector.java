package facadePattern;

public class Proyector extends DispositivoElectronico {

	private PantallaProyector pantalla;
	
	public Proyector(String descripcion, PantallaProyector pantalla) {
		super(descripcion);
		this.pantalla = pantalla;
	}

	public void modoWideScreen() {
		System.out.println(descripcion + " en modo widescreen | relacion de aspecto 16:9");
	}
	
	public void modoTV() {
		System.out.println(descripcion + " en modo TV | relación de aspecto 4:3");
	}
	
	@Override
	public void encender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub

	}
	
	public String toString() {
		return descripcion;
	}

}
