package PracticaPOO;
import java.util.ArrayList;

// Clase interna para representar un Producto
class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    } 
    @Override
    public String toString() {
        return "Producto: " + nombre + 
               " | Precio: $" + precio + 
               " | Cantidad: " + cantidad;
    }
}

public class Pregunta4_Inventario {
    // ArrayList para guardar los productos
    private ArrayList<Producto> productos; 
    // Constructor
    public Pregunta4_Inventario() {
        productos = new ArrayList<>();
    }
    // Método sobrecargado 1: Solo recibe el nombre
    public void agregarProducto(String nombre) {
        // Valores por defecto: precio 0.0 y cantidad 0
        Producto producto = new Producto(nombre, 0.0, 0);
        productos.add(producto);
        System.out.println("✓ Producto agregado: " + nombre);
    }
    // Método sobrecargado 2: Recibe nombre y precio
    public void agregarProducto(String nombre, double precio) {
        try {
            // Validar que el precio no sea negativo
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            } 
            Producto producto = new Producto(nombre, precio, 0);
            productos.add(producto);
            System.out.println("✓ Producto agregado: " + nombre + " con precio $" + precio);
            
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }
    // Método sobrecargado 3: Recibe nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        try {
            // Validar que el precio no sea negativo
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
            // Validar que la cantidad no sea negativa
            if (cantidad < 0) {
                throw new IllegalArgumentException("La cantidad no puede ser negativa");
            }
            Producto producto = new Producto(nombre, precio, cantidad);
            productos.add(producto);
            System.out.println("✓ Producto agregado: " + nombre + 
                             " | Precio: $" + precio + 
                             " | Cantidad: " + cantidad);
            
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }
    // Método para mostrar todos los productos
    public void mostrarInventario() {
        System.out.println("\n=== INVENTARIO ACTUAL ===");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío");
        } else {
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i));
            }
        }
        System.out.println("Total de productos: " + productos.size() + "\n");
    }
    
    public static void main(String[] args) {
        // Crear instancia del inventario
        Pregunta4_Inventario inventario = new Pregunta4_Inventario();
        
        System.out.println("=== DEMOSTRACIÓN DE INVENTARIO ===\n");
        
        // Agregar productos usando los métodos sobrecargados
        inventario.agregarProducto("Laptop");
        inventario.agregarProducto("Mouse", 25.50);
        inventario.agregarProducto("Teclado", 45.99, 10);
        
        // Intentar agregar productos con valores negativos (generará errores)
        System.out.println("\n--- Probando validaciones ---");
        inventario.agregarProducto("Monitor", -150.00);
        inventario.agregarProducto("Auriculares", 30.00, -5);
        
        // Agregar más productos válidos
        System.out.println("\n--- Agregando más productos ---");
        inventario.agregarProducto("Webcam", 80.00, 15);
        inventario.agregarProducto("Cable HDMI", 12.50, 20);
        
        // Mostrar el inventario completo
        inventario.mostrarInventario();
    }
}