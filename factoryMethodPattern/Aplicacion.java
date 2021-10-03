package factoryMethodPattern;

public abstract class Aplicacion {
	public abstract Documento FabricarDocumento(String tipo);
	
	public Documento nuevoDocumento(String tipo) {
		Documento doc = FabricarDocumento(tipo);
		doc.setNombre("Documento sin guardar");
		return doc;
	}
}
