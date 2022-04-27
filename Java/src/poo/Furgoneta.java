package poo;

public class Furgoneta extends coche {
	
	private int capacidad_carga;
	private int plazas_extras;
	
	public Furgoneta(int plazas_extras, int capacidad_carga) {
		super(); // Llama al constructor de la clase padre
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extras=plazas_extras;
		
	}
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidad_carga + 
				" Las plazas extras son:  " + plazas_extras;
	}

}
