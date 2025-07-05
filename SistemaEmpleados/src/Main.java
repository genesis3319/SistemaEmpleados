/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos (instancias)
        Empleado emp1 = new Gerente("Genesis Andy", 120, 6000, "Ventas");
        Empleado emp2 = new Desarrollador("Alejandro Perez", 121, 4000, "Java");
        
        // Demostración del polimorfismo
        System.out.println("=== DETALLES DE EMPLEADOS ===");
        mostrarInfoEmpleado(emp1);
        mostrarInfoEmpleado(emp2);
    }
    
    // Método que demuestra polimorfismo
    public static void mostrarInfoEmpleado(Empleado emp) {
        emp.mostrarDetalles();
        System.out.println("----------------------");
    }
}
