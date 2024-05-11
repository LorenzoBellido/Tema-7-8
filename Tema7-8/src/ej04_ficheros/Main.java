package ej04_ficheros;

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
			bw = new BufferedWriter(new FileWriter("src/ej04_ficheros/escritura.txt"));
			while(!linea.equalsIgnoreCase("fin")) {
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
