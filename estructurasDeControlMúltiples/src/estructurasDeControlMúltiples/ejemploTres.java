package estructurasDeControlMúltiples;

public class ejemploTres {
 public static void main(String[]args){ 
	
	 	int numerosRandom = 3;
	
	 	String x;
	   
	 	//structura de control utilizado switch case 
			
	 	switch (numerosRandom) {
				case 1: x = "Su numero no es 3";break;
				case 2: x = "Su numero no es 3";break;
				case 3: x = "Su numero es 3";break;
			default: x= "Se acabaron los numeros"; break;
			
		}
			
			System.out.println(" El numero ramdon es " + x );
			
 	}
}
