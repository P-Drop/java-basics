package pregunta8;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static Scanner keyboard = new Scanner(System.in);
	static boolean salir = false;
	static ArrayList<Articulo> stock = new ArrayList<>();
	public static void main(String[] args) {
		do {
		menuPrincipal();
		}while (!salir);
		System.out.println("Hasta luego");
		keyboard.close();
	}
	
	public static void menuPrincipal() {
		System.out.print("\n1. Crear articulo\n2. Mostrar articulo\n3. Editar articulo\n4. Borrar articulo\n5. Salir\n\n\tOpcion -> ");
		int opcion = keyboard.nextInt();
		switch(opcion) {
		case 1 -> {
			crear();
		}
		case 2 -> {
			mostrar();
		}
		case 3 -> {
			editar();
		}
		case 4 -> {
			borrar();
		}
		case 5 -> {
			salir = true;
		}
		default -> {
			System.err.println("ERROR: Opción no válida");
		}
		}
	}
	
	public static void crear() {
		System.out.print("\nIntroduce nombre del articulo (o 'desconocido' si no se tiene) -> ");
		String nombre = keyboard.next();
		System.out.print("Introduce precio del articulo (o 0 si no se tiene) -> ");
		double precio = keyboard.nextDouble();
		System.out.print("Introduce referencia del articulo (o 0 si no se tiene) -> ");
		int ref = keyboard.nextInt();
		if((!nombre.equals("desconocido"))&&(precio!=0)&&(ref!=0)) {
			Articulo arti = new Articulo(ref, nombre, precio);
			stock.add(arti);
		}
		else if((!nombre.equals("desconocido"))&&(precio!=0)&&(ref==0)) {
			Articulo arti = new Articulo(nombre, precio);
			stock.add(arti);
		}
		else if((nombre.equals("desconocido"))&&(precio!=0)&&(ref!=0)) {
			Articulo arti = new Articulo(ref, precio);
			stock.add(arti);
		}
		else if(!(nombre.equals("desconocido"))&&(precio==0)&&(ref!=0)) {
			Articulo arti = new Articulo(ref, nombre);
			stock.add(arti);
		}
		else if(!(nombre.equals("desconocido"))&&(precio==0)&&(ref==0)) {
			Articulo arti = new Articulo(nombre);
			stock.add(arti);
		}
		else if((nombre.equals("desconocido"))&&(precio!=0)&&(ref==0)) {
			Articulo arti = new Articulo(precio);
			stock.add(arti);
		}
		else if((nombre.equals("desconocido"))&&(precio==0)&&(ref!=0)) {
			Articulo arti = new Articulo(ref);
			stock.add(arti);
		}
		else {
			Articulo arti = new Articulo();
			stock.add(arti);
		}
		System.out.println("Artículo creado");
	}
	public static void mostrar() {
		int contador=0;
		for (Articulo a : stock) {
			System.out.println("\nAritculo "+(++contador)+"\nNombre -> "+a.getNombre()+"\nPrecio: "+a.getPrecio()+"\nReferencia: "+a.getReferencia());
		}
		if(stock.size() == 0) {
			System.out.println("\nNo hay artículos que mostrar\n");
		}
	}
	public static void editar() {
		System.out.print("Numero de articulo que desea editar: ");
		int n = keyboard.nextInt()-1;
		if (n<stock.size()) {
			System.out.print("Nuevo nombre -> ");
			String nombre = keyboard.next();
			stock.get(n).setNombre(nombre);
			System.out.print("Nuevo precio -> ");
			double precio = keyboard.nextDouble();
			stock.get(n).setPrecio(precio);
			System.out.print("Nueva referencia -> ");
			int ref = keyboard.nextInt();
			stock.get(n).setReferencia(ref);
			System.out.println("Artículo actualizado");
		}
		else {
			System.err.println("ERROR: El articulo no existe");
		}
	}
	public static void borrar() {
		System.out.print("Numero de articulo que desea eliminar: ");
		int n = keyboard.nextInt()-1;
		if (n<stock.size()) {
			stock.remove(n);
			System.out.println("\nArtículo eliminado");
		}
		else {
			System.err.println("ERROR: El articulo no existe");
		}
	}
}
