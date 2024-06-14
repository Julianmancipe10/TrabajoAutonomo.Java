package estructurasDeControlEnCondicionalesSimplesYDobles;

import javax.swing.JOptionPane;

public class ejemploUno {
	public static void main (String[]args) {
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
				
		if ( edad > 18 ) {
			System.out.println("Usted es mayor de edad");
		}
		
	}
}