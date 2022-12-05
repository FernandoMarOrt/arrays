/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author fer
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random numeroAleatorio = new Random();

        System.out.println("Dime el tamaño de los 2 arrays");

        int tamaño = teclado.nextInt();

        int[] numeros = new int[tamaño];
        int[] numeros2 = new int[tamaño];
        
        int nAleatorio = numeroAleatorio.nextInt(0, 100 + 1);
        
        int[] multiplicar = multiplicar(numeros, numeros2);
        
        for (int i = 0; i < multiplicar.length; i++) {
            
            System.out.println(multiplicar[i]);
        }

        

    }

    public static int[] multiplicar(int[] aux, int[] aux2) {
        
        int[] multiplicado = new int[aux.length];

        for (int i = 0; i < aux.length; i++) {
            
            multiplicado[i] = aux[i] * aux2[i];
        }
        
        
        return multiplicado;
    }

}
