package ej08_ficheros.gestion;

import java.util.HashMap;
import java.util.Map;

public class RegistroTemp {

	public static Map<String, String> registro = new HashMap<String, String>();
	
	public static void historial() {
		for(Map.Entry<String, String> entry : registro.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}//for-each
	}
	
	public int newReg(String fecha, int tempMax, int tempMin) {
		int resp = 0;
		if (registro.size() < 21 && !registro.containsKey(fecha)) {
			registro.put(fecha, tempMax + ", " + tempMin);
			resp = 1;
		} else if (registro.containsKey(fecha)) {
			resp = -1;
		}
		return resp;
	}
	
}
