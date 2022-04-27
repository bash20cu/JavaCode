package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mSpinner extends JFrame {
	
	public mSpinner () {
		setBounds(550,350,550,350);
		setVisible(true);
		setTitle("Prueba Campo de Texto con Botones");
		add(new lSpinner());
		
	}
}

class lSpinner extends JPanel {
	public lSpinner () {
		//String lista [] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			public Object getPreviousValue() {
				return super.getNextValue();
			}			
		});
		Dimension d = new Dimension(100, 20);
		control.setPreferredSize(d);
		add(control);
		
	}
	/*
	 
	private class mModeloJspinner extends SpinnerNumberModel {
		public mModeloJspinner() {
			super(5,0,10,1);
		}
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
	*/
}



public class PruebaSpinner {

	public static void main(String[] args) {
		mSpinner marco = new mSpinner();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
