package ej01_exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double decimal;
		int entero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un double");
		decimal = Funciones.readDouble(sc);
		System.out.println("Introduzca un int");
		entero = Funciones.readInt(sc);
		
		System.out.println(decimal + "," + entero);
		
		sc.close();

	}

}
