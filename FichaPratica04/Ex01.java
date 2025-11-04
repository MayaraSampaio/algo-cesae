package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2, resultado;
        String operacao, opcao;




        do {

            System.out.println("Digite o primeiro valor");
            numero1 = sc.nextDouble();

            System.out.println("Digite o segundo valor");
            numero2= sc.nextDouble();

            System.out.println("Escolha uma das operacoes:+,*,-,/");
            operacao=sc.next();


            switch (operacao){

                case "+":
                    resultado= numero1+numero2;
                    System.out.println(resultado);
                    break;
                case "-" :
                    resultado = numero1-numero2;
                    System.out.println(resultado);
                    break;
                case "*":
                    resultado = numero1*numero2;
                    System.out.println(resultado);
                    break;
                case "/":
                    resultado = numero1/numero2;
                    System.out.println(resultado);
                    break;

            }

            System.out.println("Deseja continuar? s/n");
            opcao=sc.next();


        }while(opcao.equals("s"));



        }

    }

