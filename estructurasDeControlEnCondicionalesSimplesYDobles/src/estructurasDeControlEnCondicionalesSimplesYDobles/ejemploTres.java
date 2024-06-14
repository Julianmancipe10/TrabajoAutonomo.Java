package estructurasDeControlEnCondicionalesSimplesYDobles;

public class ejemploTres {
    public static void main(String[] args) {
        
        // Declaramos dos variables de tipo entero:
        int credito, edad;

        // Inicializamos las variables:
        credito = 1000;
        edad = 18;

        // Uso del operador condicional simple '&'
        if (credito > 1000 & edad >= 18) {
            System.out.println("Su crédito ha sido aprobado con el operador simple");
        } else {
            System.out.println("No cumple uno de los requisitos");
        }
    }
  }