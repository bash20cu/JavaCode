package poo;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {
	
	public static void main(String[] args) {		
		Reloj mireloj=new Reloj();
		mireloj.enMarcha(3000,true);
		JOptionPane.showMessageDialog(null, "pulsa aceptar");
		System.exit(0);

	}
}
	
	class Reloj{
		/*
		private int intervalo;
		private boolean sonido;
		
		public Reloj(int intervalo, boolean sonido) {
		this.intervalo=intervalo;
		this.sonido=sonido;
		}
		
		*/
		
		public void enMarcha(int intervalo, final boolean sonido){  // clase interna local
			
			class DameLaHora2 implements ActionListener{
				public void actionPerformed(ActionEvent evento) {
					Date ahora = new Date();
					System.out.println("te pongo la hora cada 3 seg. " + ahora);
					if (sonido) {
						Toolkit.getDefaultToolkit().beep();
				}
			}
		}
			
			ActionListener oyente = new DameLaHora2();
			Timer mitemporizador = new Timer(intervalo,oyente);
			mitemporizador.start();
		}		
		
}
