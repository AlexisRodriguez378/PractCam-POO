package PracticaPOO;

public class Pregunta1_Calculadora {
    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }
    // Método sobrecargado para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    // Método sobrecargado para sumar dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        // Crear instancia de la calculadora
        Pregunta1_Calculadora calc = new Pregunta1_Calculadora();
        // Demostrar el uso de los tres métodos sobrecargados
        System.out.println("=== Demostración de Sobrecarga de Métodos ===");
        // Usando el método con dos enteros
        int resultado1 = calc.sumar(5, 3);
        System.out.println("Suma de dos enteros (5 + 3): " + resultado1);  
        // Usando el método con tres enteros
        int resultado2 = calc.sumar(10, 20, 30);
        System.out.println("Suma de tres enteros (10 + 20 + 30): " + resultado2);
        // Usando el método con dos doubles
        double resultado3 = calc.sumar(15.5, 10.3);
        System.out.println("Suma de dos decimales (15.5 + 10.3): " + resultado3);
    }
}