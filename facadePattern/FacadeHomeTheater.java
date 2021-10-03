package facadePattern;

public class FacadeHomeTheater {
	private Amplificador amplificador;
	private Sintonizador sintonizador;
	private ReproductorCd reproductorCd;
	private ReproductorDVD reproductorDVD;
	private Proyector proyector;
	private LucesHomeTheater luces;
	private PantallaProyector pantallaProyector;
	public FacadeHomeTheater(Amplificador amplificador, Sintonizador sintonizador, ReproductorCd reproductorCd,
			ReproductorDVD reproductorDVD, Proyector proyector, LucesHomeTheater lucesHomeTheater,
			PantallaProyector pantallaProyector) {
		this.amplificador = amplificador;
		this.sintonizador = sintonizador;
		this.reproductorCd = reproductorCd;
		this.reproductorDVD = reproductorDVD;
		this.proyector = proyector;
		this.luces = lucesHomeTheater;
		this.pantallaProyector = pantallaProyector;
	}
	
	public void verPelicula(String pelicula) {
		System.out.println("Inicia el proceso para ver una película");
		luces.atenuar(10);
		pantallaProyector.bajar();
		proyector.encender();
		proyector.modoWideScreen();
		amplificador.encender();
		amplificador.setReproductorDVD(reproductorDVD);
		amplificador.activarSonidoSorround();
		amplificador.setVolumen(5);
		reproductorDVD.reproducir(pelicula);
	}
	
	public void terminarPelicula() {
		System.out.println("Inicia el proceso para terminar una película");
		luces.encender();
		pantallaProyector.subir();
		proyector.apagar();
		amplificador.apagar();
		reproductorDVD.parar();
		reproductorDVD.expulsar();
		reproductorDVD.apagar();
		
	}
}
