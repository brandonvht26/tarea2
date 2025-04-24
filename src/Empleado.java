/* EJERCICIO 2

Problema: Sistema de gestión de empleados en una empresa. Cada empleado tiene un nombre, un cargo, un salario
y una fecha de ingreso a la empresa.

Objetivo: Desarrollar una clase en Java llamada Empleado que tenga los atributos mencionados anteriormente y un método
para mostrar la información del empleado. Luego, crearemos tres objetos de esta clase, cada uno representando un
empleado diferente, y solicitaremos al usuario que ingrese los detalles de cada empleado a través del teclado. */

// Declaración de clase

public class Empleado {
    public String name;
    public String occupation;
    public String birthdate;
    public double salary;

// Constructor de clase

    public Empleado(String name, String occupation, String birthdate, double salary) {
        this.name = name;
        this.occupation = occupation;
        this.birthdate = birthdate;
        this.salary = salary;
    }

// Declaración de método

    public void mostrarEmpleado() {
        System.out.print("\nEmpleado: " + name +
                         "\nCargo: " + occupation +
                         "\nFecha de nacimiento: " + birthdate +
                         "\nSalario: " + String.format("%.2f", salary) + "$\n");
    }
}