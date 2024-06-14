package structurasDeDatosHashTable;

import java.util.Hashtable;

public class ejemploTres {
    public static void main(String[] args) {
        // Crear un Hashtable
        
    	Hashtable<String, String> productos = new Hashtable<>();

        // Añadir elementos al Hashtable
        productos.put("A1", "Manzanas");
        productos.put("A2", "Peras");
        productos.put("A3", "Cerezas");

        // metodo de  eliminar un elemento por su clave
        productos.remove("A1");
        
        // metodo de verificacion de existencia de elemento
        
        boolean producto = productos.containsKey("A1");
        
        System.out.println("Existe el producto A1 " + producto);
    }
}
