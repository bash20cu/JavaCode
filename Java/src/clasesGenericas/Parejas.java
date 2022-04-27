package clasesGenericas;

public class Parejas <T> {
	public Parejas() {
		primero=null;
	}
	
	public void setPrimero(T nuevoValor) {
		primero=nuevoValor;
	}
	
	public static void imprimirTrabajador(Parejas <? extends Empleado> p) {
		Empleado primero = p.getPrimero();
		
		System.out.println(primero);
	}
	
	public T getPrimero() {
		return primero;
	}
	
	private T primero;
}
