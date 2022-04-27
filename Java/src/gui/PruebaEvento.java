package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaEvento {

	public static void main(String[] args) {
		MarcoBotones marco1 = new MarcoBotones();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {
	public MarcoBotones() {
		setTitle("Marco con botones");
		setBounds(700,300,500,300);
		LaminaBotones lamina1 = new LaminaBotones();
		add(lamina1);
	}
}


class LaminaBotones extends JPanel implements ActionListener{
	JButton BotonAzul = new JButton("Boton Azul");
	JButton BotonAmarillo = new JButton("Boton Amarillo");
	JButton BotonRojo = new JButton("Boton Rojo");
	
	public LaminaBotones() {
		add(BotonAzul);
		add(BotonAmarillo);
		add(BotonRojo);
		BotonAzul.addActionListener(this);
		BotonAmarillo.addActionListener(this);
		BotonRojo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		
		if (botonPulsado==BotonAzul) {
			setBackground(Color.blue);
		} else if (botonPulsado==BotonAmarillo) {
			setBackground(Color.yellow);
		} else {
			setBackground(Color.red);
		}
	}
}