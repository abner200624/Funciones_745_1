package com.sigmotoa.funcion_1;

import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        saludar();
        int resultao;
        System.out.println("Hello, escribe tu nombre: ");
        String name = leer.next();
        System.out.println(name + " como estas por favor digita la opcion del menu que guste usar: ");
        do {
            System.out.println("1 - Suma de numeros");
            System.out.println("2 - Multiplicacion de numeros");
            System.out.println("3 - Potencia de numeros");
            System.out.println("4 - Calcular el factorial");
            System.out.println("5 - Calcular el area de un cuadrado");
            System.out.println("6 - Calcular el area de un circulo");
            System.out.println("7 - Calcular el area de un cono");
            System.out.println("8 - Calcular la serie de Fibonacci n veces");
            int mennu = leer.nextInt();
            switch (mennu){
                case 1:
                    System.out.println("numero a sumarle:");
                    int numa = leer.nextInt();
                    System.out.println(name + " digita numero a ser sumado: ");
                    int numb = leer.nextInt();
                    resultao = sumita(numa, numb);
                    System.out.println("El resultado de su suma fue: " + resultao);
                    break;
                case 2:
                    System.out.println("Muy bien hecho, " + name + ", ahora digita el numero que deceas multiplicar: ");
                    int numc = leer.nextInt();
                    System.out.println(name + ", ahora digita el numero a multiplicar: ");
                    int numd = leer.nextInt();
                    resultao = multiplicasao(numa, numb);
                    System.out.println("El resultado de su multiplicacion fue: " + resultao);

        }




        mayus(name);
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
    public static int currentYear() {
        return 2024;
    }

    /*
    Crear funciones para las siguientes situaciones
    1. Sumar 2 numeros*/

    public static int sumita(int numa, int numb) {
        return numa + numb;
    }
    /*
    2. Multiplicar 2 numeros con las sumas del 1
    */


    /*
    3. Potenciar 2 numeros con las sumas del 1
    4. Calcular el factorial de 1 numero
    5. Calcular el area de un cuadrado(recibiendo un lado)
    6. Calcular el area de un circulo(recibiendo el radio)
    7. Calcular el volumen de un cono(recibiendo el radio y la altura
    8. Mostrar los n numeros de la serie de fibonacci(recibiendo n)

    Todas las funciones deben ser llamadas desde el Main.
     */

}
