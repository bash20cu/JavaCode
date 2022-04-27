package practica;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.*;

class mBlocNotas extends JFrame {
	public mBlocNotas () {
		setBounds(500,350,550,350);
		setTitle("Bloc de Notas");
		
		
		
		lBlocNotas lamina = new lBlocNotas();
		add(lamina);
		setVisible(true);
	}
}

class lBlocNotas extends JPanel {
	public lBlocNotas () {
		setLayout(new BorderLayout());
		
		JPanel lMenu = new JPanel();
		miarea=new JTextArea();
		
		
		JMenuBar barraM = new JMenuBar();	
		
		fuente = new JMenu("Fuentes");
		barraM.add(fuente);			
		estilo = new JMenu("Estilo");
		barraM.add(estilo);			
		tamagno = new JMenu("Tamaño");
		barraM.add(tamagno);	
		
		//--------Fuente Menu -----
		ConfiguraMenu("Arial", "fuente","Arial",9,10);
		ConfiguraMenu("Ubuntu", "fuente","Ubuntu",9,10);
		ConfiguraMenu("Mono", "fuente","Mono",9,10);
		
		//------Estilo Menu -----
		ConfiguraMenu("Negrita", "estilo"," ",Font.BOLD,10);
		ConfiguraMenu("Cursiva", "estilo"," ",Font.ITALIC,10);
		
		// ------- Tamaño Menu -----		
		ConfiguraMenu("12", "tamaño"," ",9,12);
		ConfiguraMenu("16", "tamaño"," ",9,16);
		ConfiguraMenu("24", "tamaño"," ",9,24);
		ConfiguraMenu("26", "tamaño"," ",9,26);
		
		lMenu.add(barraM);
		
		add(lMenu,BorderLayout.NORTH);
		add(miarea, BorderLayout.CENTER);
		
	}
	public void ConfiguraMenu (String rotulo, String menu, String tipoLetra, int estilos, int tam) {
		JMenuItem elemMenu = new JMenuItem(rotulo);
		if (menu == "fuente") {
			fuente.add(elemMenu);
			if(tipoLetra=="Arial") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("letra", "Arial"));
			} else if(tipoLetra=="Ubuntu") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("letra","Ubuntu"));
			} else if(tipoLetra=="Mono") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("letra", "Mono"));
			}
		}else if (menu == "estilo") {
			estilo.add(elemMenu);
			if(estilos==Font.BOLD) {
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			} else if (estilos==Font.ITALIC) {
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}else if (menu == "tamaño") {
			tamagno.add(elemMenu);			
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("Ctamaño", tam));
		}		
		//elemMenu.addActionListener(new GestionaEventos(rotulo,tipoLetra,estilos,tam));
		
	}	
	JTextArea miarea;
	JMenu fuente, estilo, tamagno;
	Font letras;
	
}

public class BlocNotas {

	public static void main(String[] args) {
		mBlocNotas marco = new mBlocNotas();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

/*
 * 
 *  Ejemplo de clase interna 
 * 
 private class GestionaEventos implements ActionListener {
		String tipo_texto, menu;
		int estilo_letra, tamagno_letra; 
		GestionaEventos(String elemento, String texto2, int estilo2, int tam_letra){
			tipo_texto = texto2;
			estilo_letra = estilo2;
			tamagno_letra = tam_letra;
			menu = elemento;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			letras = miarea.getFont();
			
			if (menu =="Arial" || menu == "Ubuntu" || menu == "Mono") {
				estilo_letra = letras.getStyle();
				tamagno_letra = letras.getSize();
			} 
			else if (menu == "Cursiva" || menu == "Negrita") {
					if (letras.getStyle() == "1" || letras.getStyle() == "2") {
						estilo_letras = 3;
					}
				tipo_texto = letras.getFontName();
				tamagno_letra = letras.getSize();
			} 
			else if (menu == "12" || menu == "16" || menu == "24" || menu == "26") {
				estilo_letra = letras.getStyle();
				tipo_texto = letras.getFontName();
			}
			
			miarea.setFont(new Font(tipo_texto,estilo_letra,tamagno_letra));
			System.out.println("Tipo:  " + tipo_texto + " estilo: " + estilo_letra + " tamaño: " + tamagno_letra);
			
		}
		
	}
 * 
 * 
 */
