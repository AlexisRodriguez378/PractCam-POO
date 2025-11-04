package PracticaPOO;

import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class Pregunta5_MultiplesExcepciones {
    
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
                System.out.print("Ingrese un número entero positivo: ");
                String entrada = scanner.nextLine();
                
                int numero = Integer.parseInt(entrada);
                
                validarNumero(numero);
                
                System.out.println("✓ Número válido ingresado: " + numero);
                System.out.println("El doble del número es: " + (numero * 2));
                System.out.println("El cuadrado del número es: " + (numero * numero));
                
                inputValido = true;
                
            } catch (NumberFormatException e) {
                System.out.println("✗ Error: Debe ingresar un número entero válido.");
                System.out.println("   (No se permiten letras, símbolos o decimales)\n");
                
            } catch (NumeroNegativoException e) {
                System.out.println("✗ Error: " + e.getMessage());
                System.out.println("   Por favor, ingrese un número positivo o cero.\n");
                
            } catch (Exception e) {
                System.out.println("✗ Error inesperado: " + e.getMessage() + "\n");
            }
        }
        
        scanner.close();
        System.out.println("\n¡Programa finalizado con éxito!");
    }
}