package pregunta2;

import java.util.Scanner;

public class Imc {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		String imcString = "";
		System.out.print("Este programa calcula tu IMC\n\nIntroduce tu peso (kg) -> ");
		double peso = keyboard.nextDouble();
		System.out.print("Introduce tu altura (m) -> ");
		double altura = keyboard.nextDouble();
		double imcNum = peso/Math.pow(altura, 2);
		if(imcNum < 18.5 ) {
			imcString = "Bajo peso";
		}
		else if (imcNum < 25 ) {
			imcString = "Normal";
		}
		else if (imcNum < 30) {
			imcString = "Sobrepeso";
		}
		else {
			imcString = "Obesidad";
		}
		
		System.out.println("\nSu IMC se encuentra en el rango de -> "+imcString);
		keyboard.close();
	}
}
