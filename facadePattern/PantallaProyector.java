package facadePattern;

public class PantallaProyector {
	public String descripcion;
	
	public PantallaProyector(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void subir() {
		System.out.println(descripcion + " subiendo");
		
	}
	
	public void bajar() {
		System.out.println(descripcion + " bajando");
	}
	
	public String toString() {
		return descripcion;
	}
}
