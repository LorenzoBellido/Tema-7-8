package ej01_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {

	static double readDouble(Scanner sc) throws InputMismatchException {
		double numero = 0;

		try {
			numero = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido ("+ numero +") no es de tipo double");
			numero = 0;
		} finally {
			sc.nextLine();
		}
		return numero;
	}

	static int readInt(Scanner sc) throws InputMismatchException {
		int numero = 0;
		try {
			numero = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido ("+ numero +") no es de tipo int");
			numero = 0;
		} finally {
			sc.nextLine();
		}
		return numero;
	}

}
