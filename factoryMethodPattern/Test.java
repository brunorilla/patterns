package factoryMethodPattern;

public class Test {
	public static void main(String[] args) {
		Aplicacion appDibujo = new AplicacionDibujo();
		Documento dibujoJPG = appDibujo.nuevoDocumento("jpg");
		dibujoJPG.guardar();
		dibujoJPG.cerrar();
	}
}
