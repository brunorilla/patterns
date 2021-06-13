package factoryMethodPattern;

public class DocumentoDibujoPNG extends Documento {

	@Override
	public void abrir() {
		System.out.println("Implementación de abrir un PNG");

	}

	@Override
	public void guardar() {
		System.out.println("Implementación de guardar un PNG");

	}

	@Override
	public void cerrar() {
		System.out.println("Implementación de cerrar un PNG");

	}


}
