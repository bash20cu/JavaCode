package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PruebaCheck {

	public static void main(String[] args) {
		MarcoCheck marco1 = new MarcoCheck();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCheck extends JFrame{
	public MarcoCheck () {
		setBounds(550,300,550,350);
		setVisible(true);
		setTitle("Ejemplo CheckBox");		
		
		LaminaCheck lamina1 = new LaminaCheck();
		add(lamina1);
	}
}

class LaminaCheck extends JPanel {
	public LaminaCheck () {
		
		setLayout(new BorderLayout());
		Font miletra = new Font("Serif", Font.PLAIN, 24);
		
		texto = new JLabel("En algun lugar de la mancha ...");
		texto.setFont(miletra);
				
		JPanel laminaTexto = new JPanel();
		
		laminaTexto.add(texto);
		add(texto, BorderLayout.CENTER);
		
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(new controlCheck());
		check2.addActionListener(new controlCheck());
		
		JPanel LaminaCheck = new JPanel();		
		LaminaCheck.add(check1);
		LaminaCheck.add(check2);
		add(LaminaCheck, BorderLayout.SOUTH);
	}
	private class controlCheck implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int tipo=0;
			
			if(check1.isSelected()) tipo+=Font.BOLD;
			if(check2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Liberation Serif", tipo,24));
			
		}
		
	}
	
	
	
	private JLabel texto;
	private JCheckBox check1, check2;
}

