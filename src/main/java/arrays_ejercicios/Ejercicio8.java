/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tamanio;

        System.out.println("Dime un numero entero");

        tamanio = teclado.nextInt();

        int[] numeros = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {

            System.out.println("Dime un numero para la posicion" + (i + 1));

            numeros[i] = teclado.nextInt();

        }
        
        
        for (int j = 0; j <= tamanio; j++) {

            System.out.println("");
            
            for (int i = 0; i < numeros[i]; i++) {

                System.out.print("*");

            }

        }

    }

}
