package gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;

import java.awt.*;;

public class EventoDocument {

	public static void main(String[] args) {
		MarcoDocumento marco = new MarcoDocumento();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoDocumento extends JFrame {
	
	public MarcoDocumento () {
		
		setBounds(500,300,500,350);
		LaminaDocumento milamina = new LaminaDocumento();
		add(milamina);
		setVisible(true);
	}
}


class LaminaDocumento extends JPanel {
	
	public LaminaDocumento () {
		
		JTextField micampo = new JTextField(20);
		EscucharTexto el_evento = new EscucharTexto();
		Document midoc = micampo.getDocument();
		midoc.addDocumentListener(el_evento);
		
		add(micampo);
	}
	private class EscucharTexto implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Insertado el texto");
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Borrado el texto insertado");
		}
		
	}
}


