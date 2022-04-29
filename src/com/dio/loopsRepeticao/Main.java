package com.dio.loopsRepeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a opção: ");
        System.out.println("1 - Nome e idade");
        System.out.println("2 - Nota");
        System.out.println("3 - Maior e Média");
        System.out.println("4 - Par/Ímpar");
        System.out.println("5 - Tabuada");
        System.out.println("6 - Fatorial");
        System.out.println("7 - Array inverso");
        System.out.println("8 - Consoantes");
        System.out.println("9 - Números aleatórios");
        System.out.println("10 - Matriz");

        int opcao = scan.nextInt();


        switch(opcao){
            case 1:
                ExerciciosLoops.nomeIdade();
                break;
            case 2:
                ExerciciosLoops.nota();
                break;
            case 3:
                ExerciciosLoops.maiorMedia();
                break;
            case 4:
                ExerciciosLoops.parImpar();
                break;
            case 5:
                ExerciciosLoops.tabuada();
                break;
            case 6:
                ExerciciosLoops.fatorial();
                break;
            case 7:
                ExerciciosArrays.inverso();
                break;
            case 8:
                ExerciciosArrays.consoantes();
                break;
            case 9:
                ExerciciosArrays.numerosAleatorios();
                break;
            case 10:
                ExerciciosArrays.matriz();
                break;

        }

    }
}
