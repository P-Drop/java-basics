package pregunta7;

import java.util.Arrays;

public class Cadenas {

	public static void main(String[] args) {
		int contadorLetras = 0;
		int vecesLetraA = 0;
		String s = "Siempre se puede aprender java";
		String [] palabras = s.split(" ");
		int numPalabras = palabras.length;
		for (String cadena : palabras) {
			contadorLetras += cadena.length();
		}
		for(int i=0; i< s.length(); i++) {
			int indice = s.toLowerCase().indexOf('a',i);
			if(indice == -1 ) {
				break;
			}
			else {
			vecesLetraA++;
			i=indice;
			}
		}
		System.out.println("La cadena: \""+s+"\"\nTiene "+contadorLetras+" letras\nTiene "+numPalabras+" palabras\nContiene "+vecesLetraA+" veces la letra 'a'");
	}
}
