package estructurasDeDatosArreglos;

public class ejemploUno {
	public static void main(String[] args) {
        // Declarar un arreglo de cadenas
        String[] frutas = new String[3];

        // Inicializar elementos del arreglo
        frutas[0] = "Manzana";
        frutas[1] = "Banana";
        frutas[2] = "Cereza";

        // Modificar elementos del arreglo
        frutas[1] = "Mango";

        // Recorrer el arreglo
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta" + i + ":" + frutas[i]);
        }
    }
}
