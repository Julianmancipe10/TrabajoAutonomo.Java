package structurasDeDatosHashTable;

import java.util.Hashtable;

public class ejemploUno {
	public static void main(String[]args) {
		
		//creamos el Hashtable de con equipos de futbol su llave va a ser su lugar de ubicacion
		
		Hashtable<String, String> equipos = new Hashtable<>();

		//añadir elementos al Hashtable
		equipos.put("Madrid", "Real Madrid");
		equipos.put("Inglaterra", "Liverpool");
		equipos.put("Holanda", "Ajax");
		
		System.out.println(equipos);
	}
}