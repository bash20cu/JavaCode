package java_course;
//import java.util.Scanner;
import javax.swing.*;

public class entrada_datos {

	public static void main(String[] args) {
		
		/*
		 * 
		 * java scanner console objeto scanner 
		 * 
		 * 
		 * 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("introduce tu nombre: ");
		String nombre = entrada.nextLine();
		System.out.print("\n"+"Introduzca su edad:");
		int edad = entrada.nextInt();
		
		System.out.println(nombre + " su edad es: " + edad + " el proximo año cumple: " + (edad +1));
		
		*
		*
		*
		*/
		
		/*
		 *
		 *		 
		String nombre = JOptionPane.showInputDialog("Nombre: ");
		String edad_temp = JOptionPane.showInputDialog("Edad: ");
		int edad = Integer.parseInt(edad_temp);
		System.out.println(nombre + " el proximo año cumples: "+ (edad +1 ));
			*/
		String temp = JOptionPane.showInputDialog("numero a racionalizar: ");
		double num2 = Double.parseDouble(temp);
		System.out.print("La raiz cuadrada de " + num2 + " es: ");
		System.out.printf("%1.4f", Math.sqrt(num2));
	}

}
