package PracticaPOO;
import java.util.Scanner;

// Excepción personalizada para números negativos
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}
public class Pregunta5_MultiplesExcepciones {
    // Método que valida el número ingresado
    public static void validarNumero(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("No se permiten números negativos");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;      
        while (!inputValido) {
            try {
                // Solicitar al usuario ingresar un número
                System.out.print("Ingrese un número entero positivo: ");
                String entrada = scanner.nextLine();
 
                // Convertir la entrada a entero (puede lanzar NumberFormatException)
                int numero = Integer.parseInt(entrada);
                
                // Validar que no sea negativo (puede lanzar NumeroNegativoException)
                validarNumero(numero);
                
                // Si llegamos aquí, el número es válido
                System.out.println("✓ Número válido ingresado: " + numero);
                System.out.println("El doble del número es: " + (numero * 2));
                System.out.println("El cuadrado del número es: " + (numero * numero));
                
                inputValido = true;
                
            } catch (NumberFormatException e) {
                // Capturar error cuando el usuario ingresa un valor no numérico
                System.out.println("✗ Error: Debe ingresar un número entero válido.");
                System.out.println("   (No se permiten letras, símbolos o decimales)\n");
                
            } catch (NumeroNegativoException e) {
                // Capturar nuestra excepción personalizada
                System.out.println("✗ Error: " + e.getMessage());
                System.out.println("   Por favor, ingrese un número positivo o cero.\n");
                
            } catch (Exception e) {
                // Capturar cualquier otra excepción no prevista
                System.out.println("✗ Error inesperado: " + e.getMessage() + "\n");
            }
        }
        
        scanner.close();
        System.out.println("\n¡Programa finalizado con éxito!");
    }
}