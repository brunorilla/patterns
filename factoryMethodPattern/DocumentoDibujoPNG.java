package factoryMethodPattern;

public class DocumentoDibujoPNG extends Documento {

	@Override
	public void abrir() {
		System.out.println("Implementaci�n de abrir un PNG");

	}

	@Override
	public void guardar() {
		System.out.println("Implementaci�n de guardar un PNG");

	}

	@Override
	public void cerrar() {
		System.out.println("Implementaci�n de cerrar un PNG");

	}


}
