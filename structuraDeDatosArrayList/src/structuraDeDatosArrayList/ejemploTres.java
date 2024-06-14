package structuraDeDatosArrayList;

import java.util.ArrayList;

public class ejemploTres {
	 public static void main(String[] args) {
		 //Creacion del arrya con cadenas de texto
		 ArrayList<String> nombres = new ArrayList<String>();
		 
		 //añadimos elementos al array 
		
		 nombres.add("Juan");
		 nombres.add("Julian");
		 nombres.add("Pacho");
		 
		//eliminamos un elementos con el metodo remove señalado su pocision en el array
		 
		 nombres.remove(1);
		 
		//elimanos el elemento nos por su posicion si no por su contenido
		 nombres.remove("Juan");
		 
		 System.out.println(nombres);
	 }
}