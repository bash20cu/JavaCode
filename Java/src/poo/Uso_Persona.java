package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		Persona [] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Luis Conde", 150000,2009,2,25);
		lasPersonas[1]=new Alumno("Miguel Fernandez", "Informática");
		
		for (Persona e: lasPersonas) {
			System.out.println(e.dameNombre() + " , " + e.dameDescripcion());
		}

	}

}

abstract class Persona{
	private String nombre;
	
	public Persona(String nom) {
		nombre=nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo=sue;
		Id=0;
		Id=IdSiguiente;
		IdSiguiente++;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		
	}
	
	public String dameDescripcion() {
		return "este empleado tiene un ID: " + Id + " Con un sueldo: " + sueldo;
	}
	
	
	public double dameSueldo() { //Getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { // Getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //Setter
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	public String devuelveDato(){
		return "ID: "+ Id;
	}
	
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente = 0;	
	
}

class Alumno extends Persona{
	private String carrera;
	public Alumno (String nom, String carrera) {
		super(nom);
		this.carrera=carrera;
		
	}
	
	public String dameDescripcion() {
		return "este Alumno esta estudiando la carrera: "+carrera;
	}
	
}


