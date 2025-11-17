import java.util.Scanner;

public class DivisionSimple {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el dividendo (numero a dividir):");
        double dividendo = scanner.nextDouble();
        
        System.out.println("Introduce el divisor:");
        double divisor = scanner.nextDouble();
        
        // La validación es clave: comprobamos que el divisor no sea 0
        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("La division es: " + resultado);
        } else {
            System.out.println("ERROR: No se puede dividir por cero.");
        }
        
        scanner.close();
    }
}
