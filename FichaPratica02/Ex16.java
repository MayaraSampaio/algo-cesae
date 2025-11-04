package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, notas200, notas100,notas50, notas20, notas10, notas5;
        System.out.println("Digite numero multiplo de 5");
        valor = scanner.nextInt();

        if (valor % 5 > 0 ){
            System.out.println("Valor inválido");
        }else {
            notas200 = valor/200;
            valor= valor % 200;


            notas100 = valor/100;
            valor= valor % 100;


            notas50 = valor/50;
            valor= valor % 50;


            notas20 = valor/20;
            valor= valor % 20;


            notas10 = valor/10;
            valor= valor % 10;


            notas5 = valor/5;
            valor= valor % 5;



            System.out.println("Notas de 200 : " + notas200);
            System.out.println("Notas de 100 : " + notas100);
            System.out.println("Notas de 50 : " + notas50);
            System.out.println("Notas de 20 : " + notas20);
            System.out.println("Notas de 10 : " + notas10);
            System.out.println("Notas de 05 : " + notas5);


        }
    }

}


