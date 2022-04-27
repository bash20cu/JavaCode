package gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class CampoPassword {

	public static void main(String[] args) {
		
		MarcoPassword marco1 = new MarcoPassword();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoPassword extends JFrame {
	
	public MarcoPassword () {
		setBounds(400,300,450,300);
		LaminaPassword lamina1 = new LaminaPassword();
		add(lamina1);
		setVisible(true);
	}
}

class LaminaPassword extends JPanel {
	
	public LaminaPassword () {
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel();
		laminaSuperior.setLayout(new GridLayout(2,2));
		add(laminaSuperior, BorderLayout.NORTH);
		
		JLabel label_usuario = new JLabel("Usuario");
		JLabel label_passwrd = new JLabel("Contraseña");
		
		JTextField cUsuario = new JTextField(15);
		
		CompruebaPassword mievento = new CompruebaPassword();
		cContra = new JPasswordField(15);
		cContra.getDocument().addDocumentListener(mievento);
		
		laminaSuperior.add(label_usuario);
		laminaSuperior.add(cUsuario);
		laminaSuperior.add(label_passwrd);
		laminaSuperior.add(cContra);
		
		JButton enviar = new JButton("Enviar");
		add(enviar, BorderLayout.SOUTH);		
		
	}	
	private class CompruebaPassword implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub 
			
		}
		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			char [] contrasena;
			contrasena = cContra.getPassword();
			if (contrasena.length<8 || contrasena.length>8) {
				cContra.setBackground(Color.RED);
			} else {
				cContra.setBackground(Color.WHITE);
			}
		}
		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub			
		}		
	}	
	JPasswordField cContra;	
}