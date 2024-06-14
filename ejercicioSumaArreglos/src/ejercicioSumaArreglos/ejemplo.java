package ejercicioSumaArreglos;

public class ejemplo {
	 public static void main(String[] args) {
	        // Arreglos de ejemplo
	        int[] arreglo1 = {1, 2, 3, 4, 5};
	        int[] arreglo2 = {6, 7, 8, 9, 10};
	        
	        // Arreglo para almacenar la suma
	        int[] suma = new int[arreglo1.length];
	        
	        // Suma de los elementos correspondientes
	        for (int i = 0; i < arreglo1.length; i++) {
	            suma[i] = arreglo1[i] + arreglo2[i];
	        }
	        
	        // Mostrar resultados
	        System.out.println("Arreglo 1: " + java.util.Arrays.toString(arreglo1));
	        System.out.println("Arreglo 2: " + java.util.Arrays.toString(arreglo2));
	        System.out.println("Resultado de la suma: " + java.util.Arrays.toString(suma));
	    }
	
}
