package facadePattern;

public class ReproductorDVD extends DispositivoElectronico {
	private int temaActual;
	private String pelicula;
	@Override
	public void encender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub

	}

	public ReproductorDVD(String descripcion) {
		super(descripcion);
		this.temaActual = 0;
		// TODO Auto-generated constructor stub
	}

	public void expulsar() {
		pelicula = null;
		System.out.println(descripcion + " expulsando");
	}
	
	public void reproducir(String pelicula) {
		this.pelicula = pelicula;
		temaActual = 0;
		System.out.println(descripcion +  ": reproduciendo " + this.pelicula);
	}
	
	public void play(int tema) {
		if(pelicula == null) {
			System.out.println(descripcion +  ": no se puede reproducir porque no hay un DVD");
		} else {
			temaActual = tema;
			System.out.println(descripcion +  ": reproduciendo tema " + tema + " de " + pelicula);
		}
	}
	
	public void parar() {
		temaActual = 0;
		System.out.println(descripcion +  ": parado");
	}
	
	public void pausar() {
		System.out.println(descripcion +  ": en pausa");
	}
	
	public String toString() {
		return descripcion;
	}
	
}


