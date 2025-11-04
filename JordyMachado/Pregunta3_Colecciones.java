package PracticaPOO;
import java.util.ArrayList;
public class Pregunta3_Colecciones {
    
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres de estudiantes
        ArrayList<String> estudiantes = new ArrayList<>();   
        // Agregar 5 nombres de estudiantes
        System.out.println("=== Agregando Estudiantes ===");
        estudiantes.add("Carlos Pérez");
        estudiantes.add("María García");
        estudiantes.add("Juan López");
        estudiantes.add("Ana Martínez");
        estudiantes.add("Luis Rodríguez");
        System.out.println("Se agregaron 5 estudiantes a la lista\n");     
        // Mostrar la lista completa
        System.out.println("=== Lista Completa de Estudiantes ===");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
        // Eliminar el tercer nombre ingresado (índice 2)
        System.out.println("\n=== Eliminando el tercer estudiante ===");
        String eliminado = estudiantes.remove(2);
        System.out.println("Se eliminó a: " + eliminado);
        // Recorrer la lista nuevamente e imprimir los nombres restantes
        System.out.println("\n=== Lista Actualizada de Estudiantes ===");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
        // Mostrar el total de estudiantes restantes
        System.out.println("\nTotal de estudiantes: " + estudiantes.size());
    }
}