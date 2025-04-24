/* EJERCICIO 1

Problema: Jugadores de un equipo de fútbol. Cada jugador tiene un nombre, una posición en el campo, una edad y un
número de camiseta.

Objetivo: Desarrollar una clase en Java llamada Jugador que tenga los atributos y un metodo para mostrar la
información del jugador. Luego, crear tres objetos de esta clase, cada uno representando un jugador diferente.

Realizar EL REGISTRO de los atributos con datos quemados y utilizando Scanner combinar */

// Declaración de clase

public class Jugador {

    public String name;
    public String position;
    public int age;
    public int playerNumber;

// Constructor de objeto

    public Jugador(String name, String position, int age, int playerNumber) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.playerNumber = playerNumber;
    }

// Declaración de método

    public void infoJugador() {
        System.out.print("\nJugador: " + name +
                         "\nEdad: " + age + " años." +
                         "\nPosición: " + position +
                         "\nNúmero de jugador: " + playerNumber + "\n");
    }
}