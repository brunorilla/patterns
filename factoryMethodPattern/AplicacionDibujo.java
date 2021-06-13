package factoryMethodPattern;

public class AplicacionDibujo extends Aplicacion {

	@Override
	public Documento FabricarDocumento(String tipo) {
		// TODO Auto-generated method stub
		if(tipo.equalsIgnoreCase("jpg")) return new DocumentoDibujoJPG();
		if(tipo.equalsIgnoreCase("gif")) return new DocumentoDibujoGIF();
		return new DocumentoDibujoPNG();
		
	}

}
