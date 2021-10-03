package adapterPattern;

public class Capitan {
	private BarcoAVela barcoAVela;
	
	public Capitan() {
		
	}
	
	public Capitan(BarcoAVela barcoAVela) {
		this.barcoAVela = barcoAVela;
	}

	public void setBarcoAVela(BarcoAVela barcoAVela) {
		this.barcoAVela = barcoAVela;
	}
	
	public void navegarAVela() {
		barcoAVela.navegarAVela();
	}
	
	
}
