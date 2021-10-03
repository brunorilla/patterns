package facadePattern;

public class LucesHomeTheater extends DispositivoElectronico {

	private int nivel;
	
	public LucesHomeTheater(String descripcion) {
		super(descripcion);
		this.nivel = 100;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println(descripcion + " encendido");

	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println(descripcion + " apagado");
	}
	
	public void atenuar(int nivel) {
		this.nivel = nivel;
		System.out.println(descripcion + " atenuando a " + this.nivel  + "%");
	}

	@Override
	public String toString() {
		return descripcion;
	}

	
	
}
