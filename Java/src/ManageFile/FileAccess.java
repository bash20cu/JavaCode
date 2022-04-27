package ManageFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileAccess {

	public static void main(String[] args) {
		readFile access = new readFile();
		
		access.read();

	}

}

class readFile {
	public void read() {
		try {
			FileReader entrada  = new FileReader("/home/bash_cu/Documentos/cursos/Java/src/ManageFile/text.txt");
			int c = entrada.read();
			
			while(c!=-1) {
				c=entrada.read();
				char letra = (char)c;
				System.out.println(letra);
			}
		} catch (IOException e) {
			System.out.println("No se encuentra el fichero");
		}
	}
}
