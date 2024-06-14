package constantesEnJava;

import javax.swing.JOptionPane;

public class ejemploDos {
	public static void main(String[]args) {
	
		//CONSTANTE 
		final int EDAD = 18;
		//VARIABLE TIPO STRING 
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		//SE IMPRIMER EL NOMBRE DEL USUARIO CON LA CONSTANTE DECLARADA 
		System.out.println("Hola Señor " + nombre + " Su edad es :" + EDAD);
		 
	}
}
