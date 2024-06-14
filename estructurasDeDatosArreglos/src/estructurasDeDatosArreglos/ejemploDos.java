package estructurasDeDatosArreglos;

public class ejemploDos {
	 public static void main(String[] args) {
	        // Declarar e inicializar un arreglo unidimensional de enteros
	        int[] numeros = {1, 2, 3, 4, 5};

	        // Acceder a elementos del arreglo
	        System.out.println("Primer elemento: " + numeros[0]);
	        System.out.println("Último elemento: " + numeros[numeros.length - 1]);

	        // Recorrer el arreglo
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
	        }
	    }
}
