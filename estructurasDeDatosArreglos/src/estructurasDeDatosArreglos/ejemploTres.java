package estructurasDeDatosArreglos;

public class ejemploTres {
	
    public static void main(String[] args) {
        // Declarar e inicializar una matriz (arreglo bidimensional) de enteros
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir elementos de la matriz
        System.out.println("Elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
