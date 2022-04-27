package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaSliders {

	public static void main(String[] args) {
		mSliders marco = new mSliders();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class mSliders extends JFrame {
	public mSliders () {
		setBounds(550,400,550,350);
		setVisible(true);
		setTitle("Prueba Sliders");
		lSliders lamina = new lSliders();
		add(lamina);
	}
}
class lSliders extends JPanel {
	public lSliders () {
		setLayout(new BorderLayout());
		
		texto = new JLabel("..............     Migue Jugando con JAVA .........");
		add(texto, BorderLayout.CENTER);
		
		control = new JSlider(SwingConstants.HORIZONTAL,8,50,12);
		control.setMajorTickSpacing(25);
		control.setMajorTickSpacing(10);
		control.setFont(new Font("Ubuntu", Font.ITALIC, 8));
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		control.addChangeListener(new eSlider());		
		
		JPanel lSlider2 = new JPanel();
		lSlider2.add(control);
		add(lSlider2, BorderLayout.NORTH);
				
	}		
	private class eSlider implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			//contador ++;
			texto.setFont(new Font("Ubuntu", Font.PLAIN,control.getValue()));
		}		
	}   
	private JLabel texto;
	private JSlider control;
	private int contador;
}