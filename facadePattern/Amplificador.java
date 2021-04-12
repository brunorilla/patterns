package facadePattern;

public class Amplificador extends DispositivoElectronico {
	
	private int nivelSonido;
	private boolean sonidoSorround;
	private Sintonizador sintonizador;
	private ReproductorCd reproductorCd;
	private ReproductorDVD reproductorDVD;

	public Amplificador(String descripcion) {
		super(descripcion);
		this.nivelSonido = 1;
		this.sonidoSorround = false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println(descripcion + ": encendiendo");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println(descripcion + ": apagando");
	}
	
	public void setStereoSound() {
		System.out.println(descripcion + " stereo mode on");
	}
	
	public void activarSonidoSorround() {
		this.sonidoSorround = true;
		System.out.println(descripcion + " sonido sorround activado");
	}

	public void setVolumen(int nivelSonido) {
		this.nivelSonido = nivelSonido;
		System.out.println(descripcion + " seteando volumen a " + this.nivelSonido);
	}
	
	public void setSintonizador(Sintonizador sintonizador) {
		this.sintonizador = sintonizador;
		System.out.println(descripcion + ": seteando sintonizador  a " + this.sintonizador);
	}

	public ReproductorCd getReproductorCd() {
		return reproductorCd;
	}

	public void setReproductorCd(ReproductorCd reproductorCd) {
		this.reproductorCd = reproductorCd;
		System.out.println(descripcion + ": seteando reproductorCD  a " + this.reproductorCd);
	}

	public ReproductorDVD getReproductorDVD() {
		return reproductorDVD;
	}

	public void setReproductorDVD(ReproductorDVD reproductorDVD) {
		this.reproductorDVD = reproductorDVD;
		System.out.println(descripcion + ": seteando reproductorDVD  a " + this.reproductorDVD);
	}
	
	public String toString() {
		return descripcion;
	}
}
