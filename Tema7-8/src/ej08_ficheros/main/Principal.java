package ej08_ficheros.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import ej08_ficheros.gestion.RegistroTemp;

public class Principal {

	public static void main(String[] args) {

		RegistroTemp t = new RegistroTemp();
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;
		File f = new File("src\\ejercicio08\\main\\temperaturas.txt");
		
		int opc = 0;
		int i =0;
		String linea ="";
		String[] valores= null;
		String fecha = "";
		int tempMin;
		int tempMax;
		int resp;
		
		try {
			if(f.exists()) {
				br = new BufferedReader(new FileReader(f));
				while((linea = br.readLine())!=null) {
					valores = linea.split(", ");
				}
				while(i<valores.length) {
					RegistroTemp.registro.put(valores[i], valores[i+1] + ", " + valores[i+2]);
					i+=3;
				}
			}
			
			bw = new BufferedWriter(new FileWriter("src\\ejercicio08\\main\\temperaturas.txt"));
			
			do {
				menu();
				opc = sc.nextInt();
				switch(opc) {
				case 1:
					System.out.println("Inserta la fecha(dd-mm-aaaa)");
					fecha = sc.next();
					System.out.println("Inserta la temperatura maxima alcanzada");
					tempMax = sc.nextInt();
					System.out.println("Inserta la temperatura mínima alcanzada");
					tempMin = sc.nextInt();
					resp = t.newReg(fecha, tempMax, tempMin);
					if(resp == 0) {
						System.out.println("No se ha podido añadir");
					}else if(resp == 1) {
						System.out.println("Se ha añadido correctamente");
					}else if(resp ==2) {
						System.out.println("Ya hay un contacto con ese nombre");
					}
					break;
				case 2:
					t.historial();
					break;
				case 3:
					break;
				default:
					System.out.println("No existe esa opcion");
					break;
				}
			
			}while(opc!=3);
			for(Map.Entry<String, String> entry : RegistroTemp.registro.entrySet()) {
				bw.write(entry.getKey() + ", " + entry.getValue());
				bw.newLine();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}finally {
			sc.close();
			try {
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	private static void menu() {
		System.out.println("1. Registra nueva temperatura");
		System.out.println("2. Nostrar historial de registros");
		System.out.println("3. Salir");
	}

}
