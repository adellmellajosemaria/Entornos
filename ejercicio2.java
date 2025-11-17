import java.util.Scanner;

public class SumaSimple {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        int numero2 = scanner.nextInt();
        
        int resultado = numero1 + numero2;
        
        System.out.println("La suma es: " + resultado);
        
        scanner.close();
    }
}
