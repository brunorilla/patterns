package prueba;
	
public class Nota {
	private String nombre;
	
	
	Nota(String nombre, Libreta lib){
		this.nombre = nombre;
		lib.addnota(this);
	}

	@Override
	public String toString() {
		return "Nota [nombre=" + nombre;
	}
	
	
	
	
}
