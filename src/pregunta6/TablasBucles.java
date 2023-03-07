package pregunta6;

import java.util.Arrays;
import java.util.Scanner;

public class TablasBucles {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int [] tabla = new int[0];
		System.out.println("Introduce 10 numeros enteros:");
		for(int i=1; i<=10; i++) {
			System.out.print("Numero "+i+" -> ");
			int n = keyboard.nextInt();
			tabla = Arrays.copyOf(tabla, tabla.length+1);
			tabla[tabla.length-1]=n;
		}
		for (int i : tabla) {
			System.out.print(i+" ");
		}
		
		keyboard.close();
	}
}
