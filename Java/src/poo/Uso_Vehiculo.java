package poo;
import javax.swing.*;
public class Uso_Vehiculo {

	public static void main(String[] args) {
		coche micoche_1 = new coche();
		Furgoneta mifurgoneta_1 = new Furgoneta(7,580);
		
		micoche_1.establece_color("amarillo");
		mifurgoneta_1.configura_asientos("si");
		mifurgoneta_1.configuro_climatizador("si");
		
		System.out.println(micoche_1.datos_generales() + 
				" \n" + micoche_1.coche_color());
		
		System.out.println(mifurgoneta_1.datos_generales() + 
				" \n" + mifurgoneta_1.dimeDatosFurgoneta());
		
	}

}
