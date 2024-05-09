package ej02_ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int suma = 0;
		int cont = 0;
		int media = 0;
		
		try {
			Scanner sc = new Scanner(new FileReader ("src/ej02_Ficheros/Enteros.txt"));
			while(sc.hasNext()) {
				suma += sc.nextInt();
				cont++;
			}
			media = suma/cont;
			System.out.println(suma);
			System.out.println(media);
		}catch(FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		}

	}

}
