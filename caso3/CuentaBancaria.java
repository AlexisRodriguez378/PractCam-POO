package caso3;
import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Metodos para depositar y retirar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto debe ser mayor que 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
        } else if (monto <= 0) {
            System.out.println("El monto debe ser mayor que 0.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(nombre, saldoInicial);

        System.out.println("\n--- Operaciones ---");
        System.out.print("Ingrese el monto a depositar: ");
        double deposito = sc.nextDouble();
        cuenta.depositar(deposito);

        System.out.print("Ingrese el monto a retirar: ");
        double retiro = sc.nextDouble();
        cuenta.retirar(retiro);

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}

