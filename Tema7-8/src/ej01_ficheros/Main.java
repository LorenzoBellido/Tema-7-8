package ej01_ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int suma = 0;
		try {
			Scanner sc = new Scanner(new FileReader("src/ej01_Ficheros/NumerosReales.txt"));
			while(sc.hasNext()) {
				suma += sc.nextInt();
				
			}
			System.out.println(suma);
		}catch(FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		}
		
		

	}

}
