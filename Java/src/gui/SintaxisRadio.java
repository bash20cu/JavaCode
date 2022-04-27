package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SintaxisRadio {

	public static void main(String[] args) {
		MRadio marco1 = new MRadio();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MRadio extends JFrame {
	public MRadio () {
		setBounds(550,300,550,350);
		setVisible(true);
		setTitle("Ejemplo Radio Button");		
		
		LaminaRadio lamina1 = new LaminaRadio();
		add(lamina1);
	}
}

class LaminaRadio extends JPanel {
	public LaminaRadio () {
		
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la mancha ....");
		texto.setFont(new Font("Ubuntu", Font.PLAIN, 16));
		
		
		add(texto, BorderLayout.CENTER);
		laminaBotones = new JPanel();
		grupo1 = new ButtonGroup();
		
		colocarBotones("Pequeño", false, 14);
		colocarBotones("Mediano", true, 16);
		colocarBotones("Grande", false, 20);
		colocarBotones("Muy Grande", false, 24);
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	public void  colocarBotones(String nombre, boolean seleccionado, int tamagno) {
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		grupo1.add(boton);
		laminaBotones.add(boton);
		
		ActionListener eRadio = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				texto.setFont(new Font("Ubuntu", Font.PLAIN, tamagno));
			}
			
		};
		boton.addActionListener(eRadio);
		
	}

	
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	private ButtonGroup grupo1;  
	private JPanel laminaBotones;
}