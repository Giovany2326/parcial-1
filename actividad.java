import java.util.Scanner;
public class actividad {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();
            
            int suma = 0;
            int numeroTemporal = Math.abs(numero);  
            
            while (numeroTemporal > 0) {
                suma += numeroTemporal % 10; 
                numeroTemporal /= 10; 
            }
            
            System.out.println("La suma de los dígitos es: " + suma);
        }
    }
}