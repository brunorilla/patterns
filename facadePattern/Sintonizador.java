package facadePattern;

public class Sintonizador extends DispositivoElectronico {

	@SuppressWarnings("unused")
	private double frecuencia;
	
	public Sintonizador(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println(descripcion + ": encendido");

	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println(descripcion + ": apagado");
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
		System.out.println(descripcion + ": estableciendo la frecuencia en ->" + frecuencia);
	}
	
	public void setAm() {
		System.out.println(descripcion +  " modo AM ON");
	}
	
	public void setFm() {
		System.out.println(descripcion +  " modo FM ON");
	}
	
	public String toString() {
		return descripcion;
	}
}
