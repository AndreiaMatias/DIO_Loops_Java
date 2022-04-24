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

        int opcao = scan.nextInt();


        switch(opcao){
            case 1:
                ExerciciosLoops.nomeIdade();
            case 2:
                ExerciciosLoops.nota();
            case 3:
                ExerciciosLoops.maiorMedia();
            case 4:
                ExerciciosLoops.parImpar();
            case 5:
                ExerciciosLoops.tabuada();
            case 6:
                ExerciciosLoops.fatorial();
            case 7:
                ExerciciosArrays.inverso();
            case 8:
                ExerciciosArrays.consoantes();

        }

    }
}
