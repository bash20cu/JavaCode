package poo;

public class Empleados {
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administracion";
		Id=0;
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
	}
	
	public String devuelveDato(){
		return "ID: "+ Id +" El nombre es: " + nombre + " y la seccion es: " + seccion;
	}
	
	private int Id;
	private static int IdSiguiente = 0;	
	private String nombre;
	private String seccion;
	
	

}
