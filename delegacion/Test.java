package delegacion;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Ramón",'m');
		Policia poli = new Policia("Renaboja",'f');
		
		System.out.println(poli.getNombre()+ '\n' + poli.getGenero());
		
		
	}

}
