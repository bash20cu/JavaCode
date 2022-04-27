package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PruebaCombo {

	public static void main(String[] args) {
		mCombo marco = new mCombo();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class mCombo extends JFrame {
	public mCombo () {
		setBounds(550,300,550,400);
		setVisible(true);
		setTitle("Prueba de comboBox");
		lCombo laminaP = new lCombo();
		add(laminaP);
		
	}
}

class lCombo extends JPanel{
	public lCombo() {
		setLayout(new BorderLayout());
		
		texto = new JLabel(" ............. Migue Jugando con JAVA ..........");
		texto.setFont(new Font("Ubuntu", Font.PLAIN,18));
		add(texto, BorderLayout.CENTER);
		
		JPanel lNorte = new JPanel();		
		
		cbox = new JComboBox();
		cbox.setEditable(true);
		cbox.addItem("Serif");
		cbox.addItem("Ubuntu");
		cbox.addItem("Monospaced");
		cbox.addItem("Dialog");
		
		eCombo event = new eCombo();
		cbox.addActionListener(event);
		
		lNorte.add(cbox);
		
		add(lNorte, BorderLayout.NORTH);
	}
	private class eCombo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setFont(new Font((String)cbox.getSelectedItem(), Font.PLAIN, 18));			
		}
		
	}
	
	private JLabel texto;
	private JComboBox cbox;
}