package gui;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		MiMarco marco1 = new MiMarco();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MiMarco extends JFrame{
	
	public MiMarco() {
		//setSize(800,600);
		//setLocation(250,150);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setBounds(250,150,800,600);
		setResizable(false);
		setTitle("Mi Primer marco JAVA");
	}
}