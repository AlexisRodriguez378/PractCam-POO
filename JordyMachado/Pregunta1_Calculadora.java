package PracticaPOO;

public class Pregunta1_Calculadora {
    
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
    	
        Pregunta1_Calculadora calc = new Pregunta1_Calculadora();
        
        System.out.println("=== Demostración de Sobrecarga de Métodos ===");

        int resultado1 = calc.sumar(5, 3);
        System.out.println("Suma de dos enteros (5 + 3): " + resultado1);

        int resultado2 = calc.sumar(10, 20, 30);
        System.out.println("Suma de tres enteros (10 + 20 + 30): " + resultado2);

        double resultado3 = calc.sumar(15.5, 10.3);
        System.out.println("Suma de dos decimales (15.5 + 10.3): " + resultado3);
    }
}