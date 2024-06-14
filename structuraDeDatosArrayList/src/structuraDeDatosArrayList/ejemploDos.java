package structuraDeDatosArrayList;

import java.util.ArrayList;

public class ejemploDos {
	public static void main(String[]args) {
		
		//Creacion de array con numeros enteros
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		//Añadimos elementos al ArrayList
		
		numeros.add(11);
		numeros.add(12);
		numeros.add(13);
		
		//Para acceder a un elemnto en el arrray
		
		int numero = numeros.get(1); // se accede al segundo elemnto teniendo en cuenta que se empieza desde 0,1
		System.out.println("EL numeor en la posicion dos es " + numero);	
	}
}
