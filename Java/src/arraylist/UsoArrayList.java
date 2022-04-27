package arraylist;
import java.io.*;
public class UsoArrayList {

	public static void main(String[] args) {
		ArrayList archivo = new ArrayList(4);
		
		archivo.add("Miguel");
		archivo.add("Alejandro");
		archivo.add("Fernandez");
		
				
	//	System.out.println(nombrePersona);
		archivo.add(new File("text.txt"));
	//	File f=(File) archivo.get(0);
	//	String f = (String) archivo.get(3);
	//	System.out.println(f);
	}

}
