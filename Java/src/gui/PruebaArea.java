package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea {

	public static void main(String[] args) {
		MarcoPruebaArea marco1 = new MarcoPruebaArea();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
	}

}

class MarcoPruebaArea extends JFrame {
	
	public MarcoPruebaArea () {
		setTitle("mi bloc de notas");
		setBounds(500,300,500,350);
		setLayout(new BorderLayout());
		
		laminaBotones = new JPanel();
		
		botonInsertar = new JButton("Insertar");
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				areaTexto.append("migue jugando con JAVA  ....  ");				
			}
			
		});
		
		laminaBotones.add(botonInsertar);
		
		botonSaltoLinea = new JButton("Salto de Linea");
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean saltar=!areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				if(saltar) {
					botonSaltoLinea.setText("Quitar Salto");
				} else {
					botonSaltoLinea.setText("Salto Linea");
				}
			}
			
		});
		
		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones, BorderLayout.NORTH);
		areaTexto = new JTextArea(8,20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
	}
	JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}