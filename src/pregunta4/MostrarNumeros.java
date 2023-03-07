package pregunta4;

import java.util.Scanner;

public class MostrarNumeros {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce un numero entero -> ");
		int n = keyboard.nextInt();
		if(n>0) {
			for(int i = 1; i<= n; i++) {
				System.out.print(" "+i);
			}
		}
		else if(n<0) {
			for(int i=-1; i>=n; i--) {
				System.out.print(" ("+i+")");
			}
		}
		else {
			System.out.println(" CERO ");
		}
		keyboard.close();
	}
}
