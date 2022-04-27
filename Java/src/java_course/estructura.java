package java_course;

public class estructura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// metodos Math raiz cuadrada
		System.out.print("Raiz Cuadrada  : ");
		double raiz = Math.sqrt(9);
		System.out.print(raiz);
		double num1 = 5.85;
		double num2 = 5;
		double num3_exponente = 3;
		
		// refundicion conversion de tipo de numeros Math. redondeo
		System.out.println("\n");
		System.out.print("Redondeo de numero usando Math: ");
		int resultado = (int) Math.round(num1);
		System.out.println(resultado);
		
		// refundicion conversion de tipo de numeros Math. Exponente
		System.out.println("\n");
		System.out.print("Exponente de numero usando Math: ");
		int resultado_potenciacion = (int) Math.pow(num2, num3_exponente);
		System.out.println(resultado_potenciacion	);
		
	}

}
