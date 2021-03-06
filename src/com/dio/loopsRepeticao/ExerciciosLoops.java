package com.dio.loopsRepeticao;

import java.util.Scanner;

public class ExerciciosLoops {
    /*Faça um programa que leia um conjunto de dois valores,
      o primeiro representando o nome do aluno e o segundo a sua idade.
      Pare inserindo 0 no campo nome*/
    public static void nomeIdade(){
        Scanner scan = new Scanner(System.in);
        String nome = "";
        int idade = 0;

        while(true){
            System.out.println("Informe o nome: ");
            nome = scan.next();
            if(nome.equals("0")){
                break;
            }else{
                System.out.println("Informe a idade: ");
                idade = scan.nextInt();
            }
        }
    }
    /*Faça um programa que peça uma nota entre 0 e 10
      Mostre uma mensagem caso o valor seja inválido
      e continue pedindo até que o usuário informe um valor válido*/
    public static void nota(){
        Scanner scan = new Scanner(System.in);
        int nota;

        while(true){
            System.out.println("Informe uma nota entre 0 e 10:");
            nota = scan.nextInt();
            if(nota >= 0 && nota <= 10){
                break;
            }else{
                System.out.println("Valor inválido!");
            }
        }
    }
    /*Faça um programa que leia 5 números
      informe o maior número e a média deles*/
    public static void maiorMedia(){
        Scanner scan = new Scanner(System.in);
        int maior=0;
        int total=0;
        int i = 0;

        do{
            System.out.println("Informe um número: ");
            int valor = scan.nextInt();
            if (valor > maior){
                maior = valor;
            }
            total += valor;
            i++;


        }while(i<5);

        int media = total/i;
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
    }
    /*Faça um programa que leia N números inteiros.
     Calcule e mostre a quantidade de números pares
     e a quantidade de números ímpares*/
    public static void parImpar(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai informar?");
        int i = scan.nextInt();
        int num;
        int par = 0;
        int impar = 0;
        do{
            System.out.println("informe o número:");
            num = scan.nextInt();
            if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }
            i--;
        }while(i>0);
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);

    }
    /*Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número inteiro
      entre 1 e 10. O Usuário deve informar de qual número ele deseja ver a tabuada.
      */
    public static void tabuada(){
        Scanner scan = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Qual tabuada você quer visualizar (entre 1 e 10)?");
            num = scan.nextInt();
        }while(num < 1 || num > 10);

        System.out.println("Tabuada de " + num + ":");

        for(int i = 1; i<=10; i++){
            int resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
        }
    }
    /*Faça um programa que calcule o fatorial de um número fornecido pelo usuário*/
    public static void fatorial(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número para cálculo do fatorial:");
        int num = scan.nextInt();
        int resultado = 1;

        for(int i = num; num>0; num--){
            resultado *= num;
        };

        System.out.println("o fatorial é:" + resultado);
    }
}
