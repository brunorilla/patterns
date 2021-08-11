package delegacion;

public class Persona implements Rastreable {
	private String nombre;
	private char genero;
	
	public Persona(String n, char g) {
		this.setNombre(n);
		this.setGenero(g);
	}
	// Dependencia simple
	public void leerLibro(Libro libro) {
		System.out.println("Leyendo: " 
				+ libro.getNombre());
	}
	// Dependencia de tipo delegación
	public Libro obtenerLibro(String nombre) {
		return new Libro(nombre);
	}
	@Override
	public void rastrear(String r) {
		// TODO Auto-generated method stub
		
	}
	public void rastrear(int r) {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
}
