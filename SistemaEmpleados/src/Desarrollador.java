/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Desarrollador extends Empleado {
    // Atributo adicional
    private String lenguaje;

    // Constructor
    public Desarrollador(String nombre, int id, double salario, String lenguaje) {
        super(nombre, id, salario);
        this.lenguaje = lenguaje;
    }

    // Sobrescritura del método (polimorfismo)
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Lenguaje: " + lenguaje);
    }

    // Getter adicional
    public String getLenguaje() {
        return lenguaje;
    }
}
