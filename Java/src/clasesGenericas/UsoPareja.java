package clasesGenericas;

public class UsoPareja {

	public static void main(String[] args) {
		
		Parejas <String> una = new Parejas <String> ();
		una.setPrimero("Miguel");
		System.out.println(una.getPrimero());
		
		Persona pers1 = new Persona ("Ana");
		Parejas <Persona> otra = new Parejas <Persona> ();
		otra.setPrimero(pers1);
		
		System.out.println(otra.getPrimero());
	}

}

class Persona {
	public Persona (String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return nombre;
	}
	
	private String nombre;
}
