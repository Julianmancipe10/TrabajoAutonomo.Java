package estructurasDeControlMúltiples;

public class ejemploDos {
	public static void main(String[]args) {
		//ejrcicio hasta mayo 
	 int numeroMes = 5;
	
	 String mes;
	 
	 //controladores multiples utilizando switch
	
	 switch (numeroMes) {
	 	
	 case 1:mes = "enero"; break;
	 case 2:mes = "febrero"; break;
	 case 3:mes = "Marzo"; break;
	 case 4:mes = "Abril"; break;
	 case 5:mes = "Mayo"; break;
	 
	 default:mes = "No hay mes asignado ni numero";
	 	break;
	 }
	 
	 System.out.println(" el mes es " + mes);
	
	}
}
