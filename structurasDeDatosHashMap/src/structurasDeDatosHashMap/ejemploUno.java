package structurasDeDatosHashMap;

import java.util.HashMap;

public class ejemploUno {
    public static void main(String[] args) {
        // Creamos un HashMap
    	HashMap<Integer, String> map = new HashMap<>();

        // Añadimos elementos con .put
        map.put(1, "Uno");
        map.put(2, "Dos");
        map.put(3, "Tres");

        // Accedemos a elemento requerido
         String valor = map.get(2);
        System.out.println("El valor para la clave 2 es: " + valor);
    }
}
