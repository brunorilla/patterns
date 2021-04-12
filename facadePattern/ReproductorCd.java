package facadePattern;

public class ReproductorCd extends DispositivoElectronico {
	private int temaActual;
	private String nombreCd;
	
	public ReproductorCd(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub

	}
	
	public void expulsar() {
		nombreCd = null;
		System.out.println(descripcion + " expulsando");
	}
	
	public void reproducir(String nombreCd) {
		this.nombreCd = nombreCd;
		temaActual = 0;
		System.out.println(descripcion +  " reproduciendo " + this.nombreCd);
	}
	
	public void reproducit (int tema) {
		if (nombreCd == null) {
			System.out.println(descripcion + ": no hay un CD ingresado. Inserte un disco para reproducir");
		} else {
			temaActual = tema;
			System.out.println(descripcion + ": reproduciendo tema " + temaActual);
		}
	}
	
	public void parar() {
		temaActual = 0;
		System.out.println(descripcion +  ": parado");
	}
	
	public void pausar() {
		System.out.println(descripcion +  ": en pausa");
	}

}
