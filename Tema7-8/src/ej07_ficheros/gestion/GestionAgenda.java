package ej07_ficheros.gestion;

import java.util.Map;
import java.util.TreeMap;

public class GestionAgenda {

	public static Map<String, String> agenda = new TreeMap<String, String>();
	/**
	 * Metodo que inserta el contacto en la agenda si no está llena o si el nombre
	 * del conctacto existe
	 * 
	 * @param nombre   El nombre del contacto
	 * @param telefono El telefono del contacto
	 * @return En caso de que no tenga 20 contactos y no exista un contacto con ese
	 *         nombre se devuelve 1, en caso de que exista el nombre se devuelve -1
	 *         y en cualquier otro caso 0
	 */
	public int newContact(String nombre, String telefono) {
		int resp = 0;
		if (agenda.size() < 21 && !agenda.containsKey(nombre)) {
			agenda.put(nombre, telefono);
			resp = 1;
		} else if (agenda.containsKey(nombre)) {
			resp = -1;
		}
		return resp;
	}
	
	public void searchContact(String nombre) {
		for(Map.Entry<String, String> entry : agenda.entrySet()) {
			if(entry.getKey().equals(nombre)) {
				System.out.println(entry.getValue());
			}else {
				System.out.println("No hay ningun contacto con ese nombre");
			}
		}//for-each
		
	}
	
	public void contactList() {
		for(Map.Entry<String, String> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
	}

}
