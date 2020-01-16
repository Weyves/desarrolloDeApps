package hacer1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la cadena de tv que desea registrar.");
		String nombre = scn.nextLine();
		CadenaTv cadena = new CadenaTv(nombre);
		String serie = "";
		while(true) {
			System.out.println("test");
		}
	}

}
