/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Empleado {
    // Atributos encapsulados (privados)
    private String nombre;
    private int id;
    private double salario;

    // Constructor
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Métodos públicos para acceder a los atributos (getters)
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    // Método que puede ser sobrescrito (polimorfismo)
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + 
                         "\nID: " + id + 
                         "\nSalario: $" + salario);
    }
}
