package estructurasDeControlEnCondicionalesSimplesYDobles;

import javax.swing.JOptionPane;

public class ejemploDos {
	public static void main (String[]args) {
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
				
			//condicional simple
		if ( edad >= 18 ) {
			System.out.println("Usted es mayor de edad");
		
			//agregando el else seria una condicional doble
		
		}else {
			System.out.println("Usted es menor de edad");
		}
		
	}
}