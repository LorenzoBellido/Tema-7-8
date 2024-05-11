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
		int edad;
		float altura;

		try {
			br = new BufferedReader(new FileReader("src/ej03_Ficheros/Alumnos.txt"));
			linea = br.readLine();
			while(linea != null) {
				cadena = linea.split(" ");
				nombre = cadena[0];
				edad =  Integer.parseInt(cadena[1]);
				altura = Float.parseFloat(cadena[2]);
				System.out.println("Nombre: " + nombre);
				System.out.println("Edad: " + edad);
				System.out.println("Altura: " + altura);
				System.out.println("------------------");
				
				linea = br.readLine();
			}
			
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
