package poo;

public class Pruebas {

	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Miguel");
		Empleados trabajador3 = new Empleados("Alejandro");
		Empleados trabajador4 = new Empleados("Cansado");
		trabajador1.cambiaSeccion("RRHH");		
		System.out.println(trabajador1.devuelveDato());
		System.out.println(trabajador2.devuelveDato());
		System.out.println(trabajador3.devuelveDato());
		System.out.println(trabajador4.devuelveDato());
	}
	

}

