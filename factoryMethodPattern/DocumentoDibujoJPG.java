package factoryMethodPattern;

public class DocumentoDibujoJPG extends Documento {

	@Override
	public void abrir() {
		System.out.println("Implementación de abrir un JPG");

	}

	@Override
	public void guardar() {
		System.out.println("Implementación de guardar un JPG");

	}

	@Override
	public void cerrar() {
		System.out.println("Implementación de cerrar un JPG");

	}

}
