package prueba;

public class Libreta {

	private Nota nota;
	
	public void addnota(Nota nota) {
		// TODO Auto-generated method stub
		this.nota = nota;
		
	}

	@Override
	public String toString() {
		return "Libreta [nota=" + nota + "]";
	}
	
	

}
