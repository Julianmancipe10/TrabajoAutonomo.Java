//ejemplo ejercicio en clase
package structurasDeDatosHashMap;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class ejemploTrs {
    // HashMap para almacenar estudiantes (nombre -> edad)
    private HashMap<String, Integer> estudiantes;

    // Constructor para inicializar el HashMap
    public ejemploTrs() {
        estudiantes = new HashMap<>();
    }

    // iniciar el programa
    public void iniciar() {
        String menu = "MENU INVESTIGACION\n\n";
        menu += "1. Registrar estudiantes\n";
        menu += "2. Mostrar nombres de todos los estudiantes\n";
        menu += "3. Mostrar lista de estudiantes con sus edades\n";
        menu += "4. Mostrar suma de todas las edades\n";
        menu += "5. Mostrar promedio de edades de estudiantes\n";
        menu += "6. Mostrar estudiantes mayores de 18 años\n";
        menu += "7. Consultar estudiante por nombre\n";
        menu += "8. Salir\n";

        int opc = 0;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));

            presentacionMenu(opc);

        }while (opc != 8);
		
		
	}


		//menu presentacion
		
		void presentacionMenu(int opc) {
			
			switch (opc) {
            case 1:
                registrarEstudiantes();
                break;
            case 2:
                mostrarNombresEstudiantes();
                break;
            case 3:
                mostrarListaEstudiantes();
                break;
            case 4:
                mostrarSumaEdades();
                break;
            case 5:
                mostrarPromedioEdades();
                break;
            case 6:
                mostrarEstudiantesMayoresDe18();
                break;
            case 7:
                consultarEstudiantePorNombre();
                break;
            case 8:
                System.out.println("Saliendo...");
                break;
            default:
                break;
		
			}
	}
		
		private void registrarEstudiantes() {
			String nombreEstudiante =JOptionPane.showInputDialog("Ingrese el estudiantes");
			int edadEstudiante =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiantes"));
			estudiantes.put(nombreEstudiante, edadEstudiante);
			
		}
		
		private void mostrarNombresEstudiantes() {
			System.out.print("NOmbre de los estudiantes Registrados");
			for(String nombre: estudiantes.keySet()) {
				System.out.print(nombre);
			}
			
		}
		
		private void mostrarListaEstudiantes() {
			System.out.print("NOmbre de los estudiantes Registrados");
			for(String nombre: estudiantes.keySet()) {
				System.out.print(nombre);
			}
		}
		
		private void mostrarSumaEdades() {
			
			int sumaEdades =0;
			for(int edades: estudiantes.values()) {
				
				sumaEdades += edades;
			} 
			
			System.out.print("las suma de las edades es" + sumaEdades);
			
		}	
		
		private void mostrarPromedioEdades() {
	        //Con ayuda 
			int totalEstudiantes = estudiantes.size();
	        if (totalEstudiantes > 0) {
	            int sumaEdades = 0;
	            for (int edad : estudiantes.values()) {
	                sumaEdades += edad;
	            }
	            double promedio = (double) sumaEdades / totalEstudiantes;
	            System.out.println("Promedio de edades de estudiantes: " + promedio);
	        } else {
	            System.out.println("No hay estudiantes registrados.");
	        }
			
		}



		private void mostrarEstudiantesMayoresDe18() {
			//con ayuda 
			System.out.println("Estudiantes mayores de 18 años:");
		        for (HashMap.Entry<String, Integer> entry : estudiantes.entrySet()) {
		            if (entry.getValue() > 18) {
		                System.out.println(entry.getKey() + ": " + entry.getValue() + " años");
		            }
		        }
			
		}
	
		private void consultarEstudiantePorNombre() {
			String nombre =JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
			Integer edad =estudiantes.get(nombre) ;
		if(edad !=null) {
		System.out.println("Estudiantes" + nombre + "Tienes" + edad + "Años de edad");	
		}else {
			System.out.println("No existe");
		}
	}
}
		



	
		

