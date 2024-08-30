package com.sigmotoa.funcion_1;

import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        saludar();
        System.out.println("Hello, type your name");
        String name = leer.next();
        System.out.println(name + " type an edge for the square");
        int lado = leer.nextInt();
        int area = areaCuadrado(lado);
        System.out.println("The area of the square is: " + area);
        mayus(name);

        System.out.println("The current year is: "+currentYear());
    }

    //Recibe, pero no retorna
    public static void mayus(String nombre) {
        System.out.println(nombre.toUpperCase());
    }

    //No Recibe, no retorna
    public static void saludar() {
        System.out.println("Hola");
    }

    //Recibe 1, retorna
    public static int areaCuadrado(int lado) {
        return lado * lado;
    }

    //No Recibe, retorna
    public static int currentYear()
    {
        return 2024;
    }

    /*
    Crear funciones para las siguientes situaciones
    1. Sumar 2 numeros
    2. Multiplicar 2 numeros con las sumas del 1
    3. Potenciar 2 numeros con las sumas del 1
    4. Calcular el factorial de 1 numero
    5. Calcular el area de un cuadrado(recibiendo un lado)
    6. Calcular el area de un circulo(recibiendo el radio)
    7. Calcular el volumen de un cono(recibiendo el radio y la altura
    8. Mostrar los n numeros de la serie de fibonacci(recibiendo n)

    Todas las funciones deben ser llamadas desde el Main.
     */

}
