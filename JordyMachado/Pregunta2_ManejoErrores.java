package PracticaPOO;

import java.util.Scanner;

public class Pregunta2_ManejoErrores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Solicitar el primer número
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = scanner.nextInt();
            
            // Solicitar el segundo número
            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = scanner.nextInt();
            
            // Realizar la división
            int resultado = numero1 / numero2;
            
            // Mostrar el resultado
            System.out.println("Resultado de la división: " + resultado);
            System.out.println("Resultado exacto: " + ((double)numero1 / numero2));
            
        } catch (ArithmeticException e) {
            // Capturar error de división entre cero
            System.out.println("Error: división entre cero no permitida");
            
        } catch (Exception e) {
            // Capturar cualquier otro error (por ejemplo, entrada no numérica)
            System.out.println("Error: Debe ingresar números enteros válidos");
            
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}