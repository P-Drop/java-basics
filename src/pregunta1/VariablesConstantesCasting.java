package pregunta1;

import java.util.Scanner;

public class VariablesConstantesCasting {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		final double valorEuroADolar = 1.068;
		System.out.print("Introduce el importe en Euros para convertir a Dolares -> ");
		double euros = keyboard.nextDouble();
		String dolares = Double.toString(Math.round((valorEuroADolar*euros)*100)/100.0);
		System.out.println("\n"+euros+" euros equivalen a "+dolares+" dolares");
		
		keyboard.close();
	}
}
