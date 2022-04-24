package com.dio.loopsRepeticao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExerciciosArrays {
/*Ordem Inversa: Faça um Programa que leia um vetor de 5
números inteiros e mostre-os na ordem inversa.*/

    public static void inverso() {
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        //solicita ao usuário os elementos do array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " do array:");
            arr[i] = scan.nextInt();
        }

        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
    }

    public static void consoantes() {
        Scanner scan = new Scanner(System.in);
        String[] letras = new String[6];
        int i = 0;
        int consoantes = 0;
        while (i < letras.length) {
            System.out.println("Informe uma letra");
            String letra = scan.next();
            if (letra.length() == 1) {
                letras[i] = letra.toLowerCase();
                i++;
            } else {
                System.out.println("Informe apenas uma letra.");
            }
        }

        for (int j = 0; j < letras.length; j++){
            if(letras[j].equals("b") || letras[j].equals("c") || letras[j].equals("d") ||
               letras[j].equals("f") || letras[j].equals("g") || letras[j].equals("h") ||
               letras[j].equals("j") || letras[j].equals("k") || letras[j].equals("l") ||
               letras[j].equals("m") || letras[j].equals("n") || letras[j].equals("p") ||
               letras[j].equals("q") || letras[j].equals("r") || letras[j].equals("s") ||
               letras[j].equals("t") || letras[j].equals("v") || letras[j].equals("w") ||
               letras[j].equals("x") || letras[j].equals("y") || letras[j].equals("z")){
                consoantes++;
            }

        }
        System.out.println("Quantidade de consoantes: " + consoantes);

    }
}