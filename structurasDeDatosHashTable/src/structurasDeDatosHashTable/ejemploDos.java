package structurasDeDatosHashTable;

import java.util.Hashtable;

public class ejemploDos {
	public static void main(String[] args) {
		 // creacion de hash  table de nombres con id entero 
		Hashtable< Integer, String> nombres = new Hashtable<>();
		
		//añadimos elementos 
	
		nombres.put(1,"Juan");
		nombres.put(2,"Ana");
		nombres.put(3,"Francisco");
		
		//para acceder a un valor utilizamos el .get
		
		String nombreDos = nombres.get(2);
		
		System.out.println("El usuario en la posicion dos es " + nombreDos);
	}
}
