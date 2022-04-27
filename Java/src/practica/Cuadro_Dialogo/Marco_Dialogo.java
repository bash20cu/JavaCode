package practica.Cuadro_Dialogo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.*;
public class Marco_Dialogo extends JFrame{
	public Marco_Dialogo () {
		setTitle("Cuadros de dialogo");
		setBounds(500,300,600,450);
		
		JPanel lamina_cuadricula = new JPanel();
		lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		
		
		lamina_tipo = new lamina_botones("Tipo", new String [] {
				"Mensajes", "Confirmar", "Opciones", "Entrada" });
		
		lamina_tipo_mensajes = new lamina_botones("Tipo de Mensajes", new String [] {
				"ERROR_MESSAGE", "INFORMATION_MESSAGE","WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"});

		lamina_mensajes = new lamina_botones("Mensajes", new String [] {
				"Cadena", "Icono", "Componente", "Otros", "Object"	});
		
		lamina_tipo_opcion = new lamina_botones("Confirmar", new String [] {
				"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"});
		
		lamina_opciones = new lamina_botones("Opciones", new String [] {
				"String[]", "Icon[] ", "Object[]" });
		
		lamina_entrada = new lamina_botones("Entrada", new String [] {
				"Campo_de_texto", "Combo" });
		
		setLayout(new BorderLayout());
		
		lamina_cuadricula.add(lamina_tipo);
		lamina_cuadricula.add(lamina_tipo_mensajes);
		lamina_cuadricula.add(lamina_mensajes);
		lamina_cuadricula.add(lamina_tipo_opcion);
		lamina_cuadricula.add(lamina_opciones);
		lamina_cuadricula.add(lamina_entrada);
		 
		JPanel lamina_mostrar = new JPanel();
		JButton boton_mostrar = new JButton("Mostrar");
		boton_mostrar.addActionListener(new AccionMostrar());
		lamina_mostrar.add(boton_mostrar);
		
		
		add(lamina_cuadricula, BorderLayout.CENTER);
		add(lamina_mostrar, BorderLayout.SOUTH);
	}
	
	// ---- PROPORCIONA EL MENSAJE -----
	
	public Object dameMensaje() {
		String s = lamina_mensajes.dameSeleccion();
		
		if(s.equals("Cadena")) {
			return cadenaMensaje;
		} else if(s.equals("Icono")) {
			return iconoMensaje;
		} else if(s.equals("Componente")) {
			return componenteMensaje;
		} else if(s.equals("Otros")) {
			return objetoMensaje;
		} else if(s.equals("Object")) {
			return new Object[]{cadenaMensaje,componenteMensaje,objetoMensaje,iconoMensaje};
		} else {
			return null;
		}
	}
	
	//------DEVUELVE TIPO DE ICONO Y NUMERO DE BOTONES AL CONFIRMAR VENTANA DE DIALOGO ------
	
	public int dameTipo(lamina_botones lamina) {
		String s = lamina.dameSeleccion();
		if (s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {
			return 0;
			
		} else if (s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
			return 1;
			
		} else if (s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
			return 2;
			
		} else if (s.equals("QUESTION_MESSAGE")) {
			return 3;
			
		} else if (s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
			return -1;
			
		} else {
			return 0;
		}		
	}
	
	 // ----- DA LA OPCION A LA LAMINA OPCIONES
	
	public Object[] dameOpciones(lamina_botones lamina) {
		String s = lamina.dameSeleccion();
		
		if (s.equals("String[]")) {
			return new String[] {"Amarillo", "Azul", "Rojo"};
		} else if (s.equals("Icon[]")) {
			return new Object[] {new ImageIcon("src/practica/Cuadro_Dialogo/icon.png"),new ImageIcon("src/practica/Cuadro_Dialogo/icon.png"),new ImageIcon("src/practica/Cuadro_Dialogo/icon.png")};
		} else if (s.equals("Object[]")) {
			return new Object[]{cadenaMensaje,componenteMensaje,objetoMensaje,iconoMensaje};
		}
		else {
			return null;
		}
	}
	
	// ------CLASE INTERNA QUE GESTIONA LOS EVENTOS ----
	
	
	private class AccionMostrar implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// System.out.println(lamina_tipo.dameSeleccion());
			
			if(lamina_tipo.dameSeleccion().equals("Mensajes")) {
				JOptionPane.showMessageDialog(Marco_Dialogo.this, dameMensaje(), "Titulo",dameTipo(lamina_tipo_mensajes));
				
			} else if(lamina_tipo.dameSeleccion().equals("Confirmar")) {
				JOptionPane.showConfirmDialog(Marco_Dialogo.this,dameMensaje(), "Titulo", dameTipo(lamina_tipo_opcion), dameTipo(lamina_tipo_mensajes));
				
			} else if(lamina_tipo.dameSeleccion().equals("Entrada")) {
				
				if(lamina_entrada.dameSeleccion().equals("Campo_de_texto")) {					
				JOptionPane.showInputDialog(Marco_Dialogo.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes));
				} else {
				JOptionPane.showInputDialog(Marco_Dialogo.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes), null, new String[] {"Amarillo", "Azul","Rojo"}, "Azul");
				}
				
			} else if(lamina_tipo.dameSeleccion().equals("Opciones")) {
				JOptionPane.showOptionDialog(Marco_Dialogo.this, dameMensaje(), "Titulo",1,dameTipo(lamina_tipo_mensajes),null,dameOpciones(lamina_opciones),null);
			}
		}		
	}
	
	private lamina_botones lamina_tipo, lamina_tipo_mensajes, lamina_mensajes, lamina_tipo_opcion,lamina_opciones,lamina_entrada;
	private String cadenaMensaje = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("src/practica/Cuadro_Dialogo/icon.png");
	private Object objetoMensaje = new Date();
	private Component componenteMensaje = new lamina_ejemplo();
}

class lamina_ejemplo extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
		g2.setPaint(Color.yellow);
		g2.fill(rectangulo);
		
	}
}
