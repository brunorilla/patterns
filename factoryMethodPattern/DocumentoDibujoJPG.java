package factoryMethodPattern;

public class DocumentoDibujoJPG extends Documento {

	@Override
	public void abrir() {
		System.out.println("Implementaci�n de abrir un JPG");

	}

	@Override
	public void guardar() {
		System.out.println("Implementaci�n de guardar un JPG");

	}

	@Override
	public void cerrar() {
		System.out.println("Implementaci�n de cerrar un JPG");

	}

}
