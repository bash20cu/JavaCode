package java_course;

public class Cadenas {

	public static void main(String[] args) {
		String nombre="Miguel Alejandro";
		
		System.out.println(nombre);
		System.out.println("Mi nombre tiene "+ nombre.length() + " caracteres.");
		System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));
		
		String frase = "Hoy es un estupendo dia para aprender a programar en Java";
		String frase_fragmento = frase.substring(27, 57);
		
		System.out.println(frase_fragmento);

	}

}
