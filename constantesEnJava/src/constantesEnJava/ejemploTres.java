package constantesEnJava;

import javax.swing.JOptionPane;

public class ejemploTres {
	public static void main (String[]args) {
		
//si el ususario es mayor de 15 puede ingresar a ver la palicula 
		
		//constante 
		
		final int EDAD_LIMITE = 18;
		
		
		 int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad actualmente "));
		 
		 if ( edad > EDAD_LIMITE ) {
			
			 System.out.println("Usted es apto para ingresar a la sala de cine ");
			 
		 }else {
			 System.out.println("Usted no es apto para ingresar a la sala de ciene ");
		 }
		
	}
}
