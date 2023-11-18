/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_aaroncastillo;

import java.util.Random;
import java.util.Scanner;

public class Lab6P1_AaronCastillo {

    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();

    public static int[] SET1(int size) {
        int temporal[] = new int[size];
        for (int i = 0; i < size; i++) {
            temporal[i] = random.nextInt((73 - 65) + 1) + 65;
        }
        return temporal;
    }

    public static int[] SET2(int size2) {
        int temporal[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            temporal[i] = random.nextInt((73 - 65) + 1) + 65;
        }
        return temporal;
    }

    public static void imprimir_letras(int[] arreglo) {
        char letra;
        for (int i = 0; i < arreglo.length; i++) {
            letra = (char) arreglo[i];
            System.out.print("[ " + letra + " ]");
        }
    }

    public static char interseccion(int[] arreglo2, int[] arreglo) {
        char letra = ' ';
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo[i] == arreglo2[j]) {
                    letra = (char) arreglo[i];
                    System.out.print("[ " + letra + " ]");
                }
            }
        }
        return letra;
    }

    public static char diferencia(int[] arreglo2, int[] arreglo) {
        char letra = ' ';
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo[i] != arreglo2[j]) {
                    letra = (char) arreglo[i];
                    System.out.print("[ " + letra + " ]");
                }
            }
        }
        return letra;
    }

    public static int[] arreglo3(int tam, int lim_sup, int lim_inf) {
        int temporal[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            temporal[i] = random.nextInt((lim_sup - lim_inf) + 1) + lim_inf;
        }
        return temporal;
    }

    public static void imprimir(int arreglo3[]) {
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.print("[ " + arreglo3[i] + " ]");
        }
        System.out.println("");
    }

    public static int[] primo(int[] arreglo3) {
        int temporal[] = new int[arreglo3.length];
        int cont = 1;
        int res;
        int primo = 0;
        for (int i = 0; i < temporal.length; i++) {
            while (cont <= temporal[i]) {
                res = temporal[i] % cont;
                cont++;
                if (res == 0) {
                    primo = primo + 1;
                }
            }
            if (primo == 2) {
                temporal[i] = 1;
            } else if (primo>2||primo<2){
                temporal[i] = 2;
            }else{
                temporal[i]=2-1;
            }
        }
        return temporal;
    }

    public static void main(String[] args) {
        System.out.println("*****Menu*****");
        System.out.println("1. Conjuntos");
        System.out.println("2. ¿Cuántos primos tienes?");
        System.out.println("Ingrese cualquier otro numero para salir.");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        while (opcion > 0 && opcion < 3) {
            switch (opcion) {
                case 1:
                    System.out.println("Size SET1: ");
                    int size = leer.nextInt();
                    int arreglo[] = new int[size];
                    arreglo = SET1(size);
                    System.out.println("Size SET2: ");
                    int size2 = leer.nextInt();
                    int arreglo2[] = new int[size];
                    arreglo2 = SET2(size2);
                    System.out.println("Conjuntos generados: ");
                    System.out.print("SET1: ");
                    imprimir_letras(arreglo);
                    System.out.println("");
                    System.out.print("SET2: ");
                    imprimir_letras(arreglo2);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Operaciones");
                    System.out.println("1. Interseccion");
                    System.out.println("2. Diferencia");
                    System.out.println("Ingrese una opcion: ");
                    int opcion2 = leer.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.print("Interseccion(SET1, SET2): ");
                            char inter = interseccion(arreglo2, arreglo);
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Diferencia(SET1, SET2):");
                            char difer = diferencia(arreglo2, arreglo);
                            System.out.println("");
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Ingrese el tamaño del arreglo a generar: ");
                    int tam = leer.nextInt();
                    System.out.println("Ingrese el limte inferior: ");
                    int lim_inf = leer.nextInt();
                    System.out.println("Ingrese el limite superior: ");
                    int lim_sup = leer.nextInt();
                    int arreglo3[] = new int[tam];
                    arreglo3 = arreglo3(tam, lim_sup, lim_inf);
                    System.out.print("Arreglo generado: ");
                    imprimir(arreglo3);
                    System.out.println("No. divisores primos: ");
                    int[] primo = primo(arreglo3);
                    imprimir(primo);
                    break;

            }
            System.out.println("");
            System.out.println("*****Menu*****");
            System.out.println("1. Conjuntos");
            System.out.println("2. ¿Cuántos primos tienes?");
            System.out.println("Ingrese cualquier otro numero para salir.");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();
        }
    }

}
