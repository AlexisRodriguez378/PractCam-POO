package PracticaPOO;

import java.util.ArrayList;

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
    private ArrayList<Producto> productos;
    
    public Pregunta4_Inventario() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(String nombre) {
        Producto producto = new Producto(nombre, 0.0, 0);
        productos.add(producto);
        System.out.println("✓ Producto agregado: " + nombre);
    }
    
    public void agregarProducto(String nombre, double precio) {
        try {

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
    
    public void agregarProducto(String nombre, double precio, int cantidad) {
        try {
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
            
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
        Pregunta4_Inventario inventario = new Pregunta4_Inventario();
        
        System.out.println("=== DEMOSTRACIÓN DE INVENTARIO ===\n");
        
        inventario.agregarProducto("Laptop");
        inventario.agregarProducto("Mouse", 25.50);
        inventario.agregarProducto("Teclado", 45.99, 10);
        
        System.out.println("\n--- Probando validaciones ---");
        inventario.agregarProducto("Monitor", -150.00);
        inventario.agregarProducto("Auriculares", 30.00, -5);
        
        System.out.println("\n--- Agregando más productos ---");
        inventario.agregarProducto("Webcam", 80.00, 15);
        inventario.agregarProducto("Cable HDMI", 12.50, 20);
        
        inventario.mostrarInventario();
    }
}