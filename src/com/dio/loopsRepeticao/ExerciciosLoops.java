package com.dio.loopsRepeticao;

import java.util.Scanner;

public class ExerciciosLoops {

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

    public static void tabuada(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você quer visualizar (entre 1 e 10)?");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for(int i = 1; i<=10; i++){
            int resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
        }
    }

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
