package ej06_ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		BufferedWriter bw = null;
		try {
			Scanner sc = new Scanner(new FileReader("src/ej06_ficheros/desordenados.txt"));
			while(sc.hasNext()) {
				numeros.add(sc.nextInt());
			}
			
			bw = new BufferedWriter(new FileWriter("src/ej06_ficheros/ordenados.txt"));
			for(Integer valor : numeros) {
				bw.write(valor);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException i) {
			System.out.println("Error con el archivo");
		}
		
	}

}
