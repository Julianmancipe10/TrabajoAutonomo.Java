
package structurasDeDatosHashMap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ejemploDos {
	 public static void main(String[] args) {
		 
		 HashMap<Integer, String> frutas =new HashMap<>();
		 
		 int numeroDefrutas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de furtas"));
		 
		 
		 for(int i =1; i<= numeroDefrutas; i++) {
			 String fruta = JOptionPane.showInputDialog("Ingrese la fruta " + i);
			 frutas.put(i,fruta);
		 }
		 
		 System.out.print("frutas" + frutas);
		 
	 }
}
