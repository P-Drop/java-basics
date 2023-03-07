package pregunta3;

import java.util.Scanner;

public class Menu {

	static Scanner keyboard =  new Scanner(System.in);
	public static void main(String[] args) {
		boolean salir = false;
		String mensaje = "";
		do {
			System.out.println("\n\t1. Alta");
			System.out.println("\t2. Baja");
			System.out.println("\t3. Modificación");
			System.out.println("\t4. Eliminación");
			System.out.println("\t5. Mostrar");
			System.out.println("\t6. Salir");
			System.out.println("\n\t Opcion -> ");
			int opcion = keyboard.nextInt();
			switch (opcion) {
			case 1 -> {
				mensaje = alta(opcion);
			}
			case 2 -> {
				mensaje = baja(opcion);
			}
			case 3 -> {
				mensaje = modificar(opcion);
			}
			case 4 -> {
				mensaje = eliminar(opcion);
			}
			case 5 -> {
				mensaje = mostrar(opcion);
			}
			case 6 -> {
				mensaje = finProg(opcion);
				salir = true;
			}
			default -> {
				System.err.println("ERROR: Opción no valida");
			}
			}
			
			System.out.println("\n\t"+mensaje+"\n");
			
		}while (!salir);
		
		
		keyboard.close();
	}
	
	public static String alta(int o) {
		String cadena = "Hecho " + Integer.toString(o);
		return cadena;
	}
	public static String baja(int o) {
		String cadena = "Hecho " + Integer.toString(o);
		return cadena;
	}
	public static String modificar(int o) {
		String cadena = "Hecho " + Integer.toString(o);
		return cadena;
	}
	public static String eliminar(int o) {
		String cadena = "Hecho " + Integer.toString(o);
		return cadena;
	}
	public static String mostrar(int o) {
		String cadena = "Hecho " + Integer.toString(o);
		return cadena;
	}
	public static String finProg(int o) {
		String cadena = "Seleccionado opción " + Integer.toString(o)+"\n\tFinalizando...";
		return cadena;
	}
}
