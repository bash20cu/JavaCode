package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mMenu extends JFrame {
	public mMenu() {
		setBounds(550,350,550,350);
		setVisible(true);
		setTitle("Prueba Menu");
		
		lMenu lamina = new lMenu();
		add(lamina);
	}
}

class lMenu extends JPanel{
	public lMenu () {		
		JMenuBar mbar = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivos");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		JMenu edicion = new JMenu("Edicion");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem pegar = new JMenuItem("Pegar");
		edicion.add(copiar);
		edicion.add(cortar);
		edicion.add(pegar);
		JMenu opciones = new JMenu("Preferencias");
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		edicion.addSeparator();
		edicion.add(opciones);
		
		
		
		JMenu herramienta = new JMenu("Herramientas");
		JMenuItem generales = new JMenuItem("Generales");
		herramienta.add(generales);
		
		
		mbar.add(archivo);
		mbar.add(edicion);
		mbar.add(herramienta);
		
		add(mbar);
	}
}

public class PruebaMenu {

	public static void main(String[] args) {
		mMenu marco = new mMenu();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
