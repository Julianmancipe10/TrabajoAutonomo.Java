package estructurasIterativasWhile;

import java.util.Scanner;

public class ejemploTres {
    public static void main(String[] args) {
        
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Declarar una variable para almacenar el número ingresado por el usuario
        int numero;
        
        // Declarar una variable para almacenar la suma de los números ingresados
        int suma = 0;

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número (0 para terminar): ");
        
        // Leer el número ingresado por el usuario
        numero = scanner.nextInt();

        // Mientras el número ingresado no sea 0
        while (numero != 0) {
            // Agregar el número ingresado a la suma
            suma += numero;
            
            // Solicitar al usuario que ingrese otro número
            System.out.println("Ingrese otro número (0 para terminar): ");
            
            // Leer el siguiente número ingresado 
            numero = scanner.nextInt();
        }

        // Cuando el bucle termina cuadno se ingresa cero y se  imprime  la suma de los números ingresados
        System.out.println("La suma de los números ingresados es: " + suma);
       
    }
}

