package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura Jefe_RRHH = new Jefatura("BB BB ", 55000,2006,9,5);
		Jefe_RRHH.estableceIncentivo(2570);		
		
		Empleado[] misEmpleados = new Empleado [6];
		
		misEmpleados[0] = new Empleado("Miguel Fernandez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("AA Fernandez");
		misEmpleados[4] = Jefe_RRHH; 			// Polimorfismo , principio de susticion;		
		misEmpleados[5] = new Jefatura("Maria Finanzas", 95000, 1999,5,26);
		Jefatura Jefa_Finanzas=(Jefatura) misEmpleados[5];
		Jefa_Finanzas.estableceIncentivo(55000);	
		
		
		System.out.println(Jefa_Finanzas.tomar_desiciones("Dar dia de vacaciones a los empleados" + "\n"));
		
		System.out.println("El Jefe: " + Jefa_Finanzas.dameNombre() 
					+ " tiene un bonus de:  " + Jefa_Finanzas.establece_bonus(500) + "\n");
		
		System.out.println("Empledo: " + misEmpleados[0].dameNombre() + " Tiene un bonus de: "+
					misEmpleados[0].establece_bonus(200) + "\n");
		
		
		
		for(Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}
		 Arrays.sort(misEmpleados);
		for (Empleado e:misEmpleados) {
			System.out.println(e.dameNombre()+"\n"+ " Sueldo: "
					+ e.dameSueldo()+"\n" + " Fecha de Alta: " + e.dameFechaContrato()
					+ "\n");
		}
		
		

	}

}

class Empleado implements Comparable, Trabajadores{
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente = 0;	
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		Id=0;
		Id=IdSiguiente;
		IdSiguiente++;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado(String nom) { // contructor para @Overload
		this(nom, 30000,2000,01,01);
	}
	
	public String dameNombre() { // Getter
		return " ID: " + Id + " Nombre: "+ nombre ;
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
	


	@Override
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
				
		if (this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if (this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
	}	
	
	
	
}

class Jefatura extends Empleado implements Jefes{
	private double incentivo;

	public Jefatura(String nom,double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	
	}
	
	public String tomar_desiciones(String desicion) {
		return "Un miembro de la direccion a tomado la desicion de: " + desicion;
	}
	
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonus_base+prima+gratificacion;
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	public double dameSueldo() {
		double SueldoJefe=super.dameSueldo();
		return SueldoJefe + incentivo;
	}
	
}

class Director extends Jefatura{
	
	public Director(String nom,double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
}

