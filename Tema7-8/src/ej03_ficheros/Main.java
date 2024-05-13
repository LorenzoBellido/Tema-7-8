package ej03_ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = null;
		String linea = "";
		String cadena[];
		String nombre = "";
		double sumaEdad = 0;
		double sumaAltura = 0;
		int cont = 0;

		try {
			br = new BufferedReader(new FileReader("src/ej03_Ficheros/Alumnos.txt"));
			linea = br.readLine();
			while(linea != null) {
				cont++;
				cadena = linea.split(" ");
				nombre = cadena[0];
				sumaEdad +=  Double.parseDouble(cadena[1]);
				sumaAltura += Double.parseDouble(cadena[2]);
				System.out.println("Nombre: " + nombre);
				linea = br.readLine();
			}
			
			System.out.println("Media Edad: " + sumaEdad/cont);
			System.out.println("Media Edad: " + sumaAltura/cont);
			
		} catch (FileNotFoundException f) {
			System.out.println("Archivo de texto no encontrado");
		} catch (IOException e) {
			System.out.println("Error con el archivo de texto");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error con el archivo de texto");
			}
		}
	}

}
