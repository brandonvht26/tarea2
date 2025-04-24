import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* BORRAR PARA CORRER EL EJERCICIO1 (Jugador.java)

        // Jugador1

        System.out.print("\nIngrese el nombre del jugador: ");
        String name = sc.nextLine();
        System.out.print("Ingrese la posición de " + name + ": ");
        String position = sc.nextLine();
        System.out.print("Ingrese la edad de " + name + ": ");
        int age = sc.nextInt();
        Jugador jg = new Jugador(name, position, age, 17);
        System.out.print("¡Jugador ingresado con éxito!\n");
        sc.nextLine();

        // Jugador2

        System.out.print("\nIngrese el nombre del jugador: ");
        name = sc.nextLine();
        System.out.print("Ingrese la posición de " + name + ": ");
        position = sc.nextLine();
        System.out.print("Ingrese la edad de " + name + ": ");
        age = sc.nextInt();
        Jugador jg2 = new Jugador(name, position, age, 9);
        System.out.print("¡Jugador ingresado con éxito!\n");
        sc.nextLine();

        // Jugador3

        System.out.print("\nIngrese el nombre del jugador: ");
        name = sc.nextLine();
        System.out.print("Ingrese la posición de " + name + ": ");
        position = sc.nextLine();
        System.out.print("Ingrese la edad de " + name + ": ");
        age = sc.nextInt();
        Jugador jg3 = new Jugador(name, position, age, 80);
        System.out.print("¡Jugador ingresado con éxito!\n");
        sc.nextLine();

        // Mostrar Jugadores

        jg.infoJugador();
        jg2.infoJugador();
        jg3.infoJugador();

        BORRAR PARA CORRER EL EJERCICIO1 (Jugador.java) */

        /* BORRAR PARA CORRER EL EJERCICIO2 (Empleado.java)

        System.out.print("\nIngrese el nombre del empelado a registrar: ");
        String name = sc.nextLine();
        System.out.print("Ingrese la ocupación de " + name + ": ");
        String occupation = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (año/mes/dia) de " + name + ": ");
        String birthdate = sc.nextLine();
        System.out.print("Ingrese el salario de " + name + ": ");
        double salary = sc.nextDouble();
        Empleado emp = new Empleado(name, occupation, birthdate, salary);
        System.out.println("\n¡Registro exitoso!\n");
        sc.nextLine();

        System.out.print("Ingrese el nombre del empelado a registrar: ");
        name = sc.nextLine();
        System.out.print("Ingrese la ocupación de " + name + ": ");
        occupation = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (año/mes/dia) de " + name + ": ");
        birthdate = sc.nextLine();
        System.out.print("Ingrese el salario de " + name + ": ");
        salary = sc.nextDouble();
        Empleado emp2 = new Empleado(name, occupation, birthdate, salary);
        System.out.println("\n¡Registro exitoso!\n");
        sc.nextLine();

        System.out.print("Ingrese el nombre del empelado a registrar: ");
        name = sc.nextLine();
        System.out.print("Ingrese la ocupación de " + name + ": ");
        occupation = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (año/mes/dia) de " + name + ": ");
        birthdate = sc.nextLine();
        System.out.print("Ingrese el salario de " + name + ": ");
        salary = sc.nextDouble();
        Empleado emp3 = new Empleado(name, occupation, birthdate, salary);
        System.out.println("\n¡Registro exitoso!");
        sc.nextLine();

        // Mostrar Jugadores

        emp.mostrarEmpleado();
        emp2.mostrarEmpleado();
        emp3.mostrarEmpleado();

        BORRAR PARA CORRER EL EJERCICIO2 (Empleado.java) */

        sc.close(); // Cerrar el objeto Scanner es una buena práctica
    }
}