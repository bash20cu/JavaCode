package gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class CreandoMArcoCentral {

	public static void main(String[] args) {
		
		MarcoCentrado marco1 = new MarcoCentrado();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation( anchoPantalla/4, alturaPantalla/4);
		setTitle("mi primer ventana");
		Image miIcono = mipantalla.getImage("src/gui/icon.jpg");
		setIconImage(miIcono);
	}
	
}
