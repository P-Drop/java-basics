package pregunta5;

import java.util.Scanner;

public class NumerosWhile {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int i=0;
		System.out.print("Introduce un numero entero -> ");
		int n = keyboard.nextInt();
		if(n>0) {
			while (i<n) {
				i++;
				System.out.print(" "+i);
			}
		}
		else if(n<0) {
			while(i>n) {
				i--;
				System.out.print(" ("+i+")");
			}
		}
		else {
			System.out.println(" CERO ");
		}
		keyboard.close();
	}
}
