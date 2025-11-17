import java.util.Scanner;

public class MultiplicacionSimple {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer factor:");
        double factor1 = scanner.nextDouble(); // Usamos double para mayor flexibilidad
        
        System.out.println("Introduce el segundo factor:");
        double factor2 = scanner.nextDouble();
        
        double resultado = factor1 * factor2;
        
        System.out.println("La multiplicacion es: " + resultado);
        
        scanner.close();
    }
}
