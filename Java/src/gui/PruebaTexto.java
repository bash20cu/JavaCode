package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PruebaTexto {

	public static void main(String[] args) {
		
		MarcoTexto marco = new MarcoTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoTexto extends JFrame {
	public MarcoTexto() {
		setBounds(600,300,600,350);
		LaminaTexto milamina = new LaminaTexto();
		add(milamina);
		setVisible(true);
		setTitle("Prueba Texto");
	}
}

class LaminaTexto extends JPanel {
	public LaminaTexto () {
		setLayout(new BorderLayout());
		
		JPanel milamina2 = new JPanel();
		milamina2.setLayout(new FlowLayout());
		resultado = new JLabel("", JLabel.CENTER);
		
		JLabel texto1 = new JLabel("Email: ");
		milamina2.add(texto1);
		
		campo1 = new JTextField(20);
		milamina2.add(campo1);
		add(resultado, BorderLayout.CENTER);
		
		JButton boton = new JButton("Comprobar");
		DameTexto mievento = new DameTexto();
		boton.addActionListener(mievento);
		milamina2.add(boton);
		add(milamina2, BorderLayout.NORTH);
		
	}
	
	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
		
			int correcto=0;
			String email=campo1.getText().trim();
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@') {					
					correcto++;
				}
				if(email.charAt(i)=='.') {					
					correcto+=correcto;
				}
			}
			
			if(correcto!=2) {
				resultado.setText("Incorrecto");
			} else {
				resultado.setText("Correcto");
			}
			
			//System.out.println(campo1.getText().trim());			
		}			
	}
	
	private JTextField campo1;
	private JLabel resultado;
}