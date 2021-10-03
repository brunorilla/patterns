package facadePattern;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amplificador amplificador = new Amplificador("Amplificador Sony A350H");
		Sintonizador sintonizador = new Sintonizador("Sintonizador AM/FM Sony A499LD");
		ReproductorDVD reproductorDVD = new ReproductorDVD("DVD player Sony KSdvd compatible with A499LD");
		ReproductorCd reproductorCD = new ReproductorCd("CD player Sony KScd compatible with A499LD");
		PantallaProyector pantallaProyector = new PantallaProyector("Pantalla Proyector AEGIS 340");
		Proyector proyector = new Proyector("Epson EB-FH06", pantallaProyector);
		LucesHomeTheater luces = new LucesHomeTheater("Home Theater l230 Sony compatible dimmers");
		
		
		FacadeHomeTheater facadeHomeTheater = new FacadeHomeTheater(amplificador, sintonizador, reproductorCD, reproductorDVD, proyector, luces, pantallaProyector);
		
		// Se llama a la fachada para ver una película
		facadeHomeTheater.verPelicula("Good Fellas");
		facadeHomeTheater.terminarPelicula();
	}

}
