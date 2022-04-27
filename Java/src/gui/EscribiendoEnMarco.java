package gui;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTexto marco1 = new MarcoConTexto();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoConTexto extends JFrame{
	
	public MarcoConTexto () {
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("Mi marco con Texto");
		
		Lamina lamina1 = new Lamina();
		add(lamina1);
		
		
		Lamina2 lamina2 = new Lamina2();
		add(lamina2);
		
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Aprendiendo Swing", 20, 20);
	}
}

class Lamina2 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50,50,200,200);
		g.drawLine(50,50,250,250);
		g.drawArc(50, 50, 250, 250, 180, 150);
	}
}