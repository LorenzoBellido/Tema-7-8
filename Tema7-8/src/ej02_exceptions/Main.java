package ej02_exceptions;

import java.awt.Menu;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			HoraExacta h = new HoraExacta(2, 22, -2);
		}catch(NegativeHourException h) {
			System.out.println(h);
		}catch(NegativeMinuteException m) {
			System.out.println(m);
		}catch(NegativeSecondException s) {
			System.out.println(s);
		}
		}

	public static void menu() {
	
		System.out.println("1. Mostrar hora");
		System.out.println("2. Mostrar hora exacta");
		System.out.println("3. Introducir hora");
		System.out.println("4. Introducir hora exacta");
		System.out.println("5. Incrementar un segundo");
		System.out.println("6. Incrementar un minutos");
		System.out.println("7. Cambiar los minutos");
		System.out.println("8. Cambiar las horas");
		System.out.println("9. Salir");
		System.out.println("Introduzca una opción.");
		
	}
}
