package ej05_ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		String linea = "";
		
		try {
			bw = new BufferedWriter(new FileWriter("src/ej05_ficheros/datos.txt",true));
			while(!linea.equalsIgnoreCase("fin")) {
				System.out.println("Introduzca su nombre y edad: ");
				linea = sc.nextLine();
				bw.write(linea);
				bw.newLine();
			}
		}catch(FileNotFoundException f) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error con el archivo.");
		}finally {
			try {
				bw.flush();
			} catch (IOException e) {
				System.out.println("Error con el archivo.");
			}
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("Error con el archivo.");
			}
		}


	}

}
