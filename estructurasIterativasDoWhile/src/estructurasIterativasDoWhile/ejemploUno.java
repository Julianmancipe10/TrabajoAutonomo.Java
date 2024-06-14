package estructurasIterativasDoWhile;

import javax.swing.JOptionPane;

public class ejemploUno {
	public static void  main(String[]args) {
		
		String opcion;
		
		//estructura iteractiva do whilw utilizando un if 
		do {
			opcion= JOptionPane.showInputDialog("Seleciones una opcion: \n1. opcion 1\n2 Opcion 2\n3 opocion 3");
			
			if(opcion != null) {
				
				switch(opcion) {
				 case "1":
					 System.out.println("Opcion uno");
					 break;
					 
				 case "2":
					 System.out.println("Opcion dos");
					 break;
				 case "3":
					 System.out.println("Opcion tres");
					 break;
				default:
					System.out.println("Ingrese una opcion valida");
					break;
				
				}
				
			}
			
			//.equals() garantiza que estás comparando correctamente los valores de los objetos, no solo sus ubicaciones en la memoria.
		
		}while(opcion != null && !opcion.equals("3"));
		
	}
}
