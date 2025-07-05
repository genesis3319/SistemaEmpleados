/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Gerente extends Empleado {
    // Atributo adicional
    private String departamento;

    // Constructor
    public Gerente(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario); // Llama al constructor de Empleado
        this.departamento = departamento;
    }

    // Sobrescritura del método (polimorfismo)
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase padre
        System.out.println("Departamento: " + departamento);
    }

    // Getter adicional
    public String getDepartamento() {
        return departamento;
    }
}

