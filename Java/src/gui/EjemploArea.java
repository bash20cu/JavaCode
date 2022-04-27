package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjemploArea {

	public static void main(String[] args) {
		MarcoArea marco1 = new MarcoArea();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoArea extends JFrame {
	
	public MarcoArea () {
		setBounds(500,300,500,350);
		LaminaArea lamina1 = new LaminaArea();
		add(lamina1);
		setVisible(true);
	}
}

class LaminaArea extends JPanel {
	public LaminaArea () {
		
		miarea = new JTextArea(8,20);
		JScrollPane laminaBarras = new JScrollPane(miarea);
		miarea.setLineWrap(true);
		add(laminaBarras);
		
		JButton miboton = new JButton("Aceptar");
		miboton.addActionListener(new GestionaArea());
		add(miboton);
	}
	private class GestionaArea implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(miarea.getText());
			
		}
		
	}
	private JTextArea miarea;
}
