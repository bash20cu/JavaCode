package ManageFile;

import java.io.*;


class writing {
	public void writing() {
		String frase = "Algo que hacer";
		try {
			FileWriter escritura = new FileWriter("/home/bash_cu/Documentos/cursos/Java/src/ManageFile/text2.txt");
			 for(int i=0;i<frase.length();i++) {
				 escritura.write(frase.charAt(i));
			 }
			 escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class writeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writing accede = new writing();
		accede.writing();
	}

}
