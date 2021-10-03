package singletonPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();
		test.inicializarConexion("Persona", "persona.cleardb.com");
		test.abrirConexion();
		// SingletonConfiguracion config = new SingletonConfiguracion; // ERROR
		
		
	}
	
	public void inicializarConexion(String baseDatos, String url) {
		// Inicializo la configuracion
		SingletonConfiguracion config = SingletonConfiguracion.instancia();
		config.setBaseDatos(baseDatos);
		config.setUrl(url);
	}
	
	public void abrirConexion() {
		SingletonConfiguracion config = SingletonConfiguracion.instancia();
		Connection con = new Connection(config.getBaseDatos(), config.getUrl());
	}

}
