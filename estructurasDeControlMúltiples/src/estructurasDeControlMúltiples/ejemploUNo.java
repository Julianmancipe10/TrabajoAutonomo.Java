package estructurasDeControlMúltiples;

public class ejemploUNo {
	public static void main(String[]args) {
		//calificaciones 
		
		
		int calificacion = 3;
		
		String nota;
		
		//estructura de control utilizando if, else if. 
		
		if( calificacion >= 5) {
			nota= "A";
		} else if (calificacion >=4) {
			nota= "B";
		} else if (calificacion >=3) {
			nota= "C";
		} else if (calificacion >=2) {
			nota= "D";
		}else {
			nota= "Malo malo";
		}
		
		System.out.println("La calificacion es " + nota);
		
	}
}
