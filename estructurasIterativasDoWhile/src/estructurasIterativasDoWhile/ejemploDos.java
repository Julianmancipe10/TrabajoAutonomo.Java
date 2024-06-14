package estructurasIterativasDoWhile;

import javax.swing.JOptionPane;

public class ejemploDos {
    public static void main(String[] args) {
        String fruta;
        
        // estructura iterativa do while.
        
        do {
            fruta = JOptionPane.showInputDialog("Ingrese una fruta");
        } while (fruta != null && !fruta.equals("manzana"));
        
        // .equalsa() se utiliza proporcionar una definición específica de igualdad. es decir frutad debe ser igual a la cadena de texto ingresada
        
        if (fruta != null && fruta.equals("manzana")) {
            System.out.println("Su fruta es manzana");
        }
    }
}
