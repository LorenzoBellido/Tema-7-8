package ej07_ficheros.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import ej07_ficheros.gestion.GestionAgenda;

public class Principal {

	public static void main(String[] args) {
		
		GestionAgenda a = new GestionAgenda();
		Scanner scan = null;
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;
		File f = new File("src\\ejercicio07\\main\\agenda.txt");
		
		String nom ="";
		String telefono="";
		int resp = 0;
		int opc = 0;
		
		try {
			
			if(f.exists()) {
				scan = new Scanner(new FileReader(f));
				while(scan.hasNextLine()) {
					GestionAgenda.agenda.put(scan.next(), scan.next());
				}
				
			}
			
				bw = new BufferedWriter(new FileWriter("src\\ejercicio07\\main\\agenda.txt"));
				do {
					menu();
					opc = sc.nextInt();
					sc.nextLine();
					switch(opc) {
					case 1:
						System.out.println("Introduce el nombre del contacto");
						nom = sc.next();
						System.out.println("Introduce el telefono del contacto");
						telefono = sc.next();
						resp = a.newContact(nom, telefono);
						if(resp == 0) {
							System.out.println("No se ha podido añadir");
						}else if(resp == 1) {
							System.out.println("Se ha añadido correctamente");
						}else if(resp ==2) {
							System.out.println("Ya hay un contacto con ese nombre");
						}
						break;
					case 2:
						System.out.println("Introduce el nombre del contacto");
						nom = sc.next();
						a.searchContact(nom);
						break;
					case 3:
						a.contactList();
						break;
					case 4:
						break;
					default:
						System.out.println("Esa opcion no existe");
						break;
					}
				}while(opc !=4);
				
			for(Map.Entry<String, String> entry : GestionAgenda.agenda.entrySet()) {
				bw.write(entry.getKey() + " " + entry.getValue());
				bw.newLine();
			}
		} catch (IOException e) {
			e.getStackTrace();
		}finally {
			sc.close();
			scan.close();
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
	
	static private void menu() {
		System.out.println("1. Nuevo contacto");
		System.out.println("2. Buscar por nombre");
		System.out.println("3. Mostrar todos");
		System.out.println("4. Salir");
	}

}
