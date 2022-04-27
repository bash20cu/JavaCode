package poo;

public class coche {
	private int ruedas_plataforma;
	private int largo_plataforma;
	private int ancho_plataforma;
	private int motor_plataforma;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero,climatizador;
	
	public coche () {
		ruedas_plataforma = 4;
		largo_plataforma = 2000;
		ancho_plataforma = 300;
		motor_plataforma = 1600;
		peso_plataforma = 500;
	}
	
	public String datos_generales() { // metodo GETTERS
		return "La plataforma del vehículo tiene " + ruedas_plataforma + " ruedas,\n mide " +
				largo_plataforma/1000 + " metros, con un ancho de " + ancho_plataforma +
				" cm \n y un peso de la plataforma de " + peso_plataforma + " Kg \n";
	}	
	
	
	public void configura_asientos (String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String asientos() {
		if (asientos_cuero==true) {
			return "El coche tiene asientos de cuero \n ";
		}else {
			return "El coche tiene asientos de serie \n";
		}
	}
	
	public void establece_color(String color_coche) { // metodo SETTERS
		color = color_coche;
	}
	
	public String coche_color() {
		return "El color del coche es: " + color + "\n";
	}
	
	public void configuro_climatizador(String climatizador) { //SETTERS
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;						
		}
	}
		
	public String dime_climatizador(){ //GETTERS
		
		if (climatizador=true) {
			return "Este coche tiene aire acondicionado \n";
		}else {
			return "Este coche no tiene aire acondicionado \n";
		}
	}
	public String dime_peso_coche() { //SETTER & GRETTER
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		if (asientos_cuero==true) {
			peso_total = peso_total + 50;			
		}
		if (climatizador = true) {
			peso_total = peso_total + 20;
		}
		return "El peso total del coche es:  " + peso_total + " Kg \n";
	}
	
	public int precio_coche() { //GRETTER
		int precio_final = 10000;
		if (asientos_cuero == true) {
			precio_final+=2000;
		}
		if (climatizador == true) {
			precio_final+=1500;
		}
		return precio_final;
	}
	
}