package prueba;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libreta lib = new Libreta();
		Nota not = new Nota("mi notita", lib);
		System.out.println(lib.toString());

		//not.toString();
	}

}
