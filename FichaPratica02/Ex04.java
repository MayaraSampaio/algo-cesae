package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite em qual lugar o piloto terminou a corrida");
        int opcao = input.nextInt() ;


        switch (opcao) {

            case 1:
                System.out.println("10 pontos");
                break;
            case 2:
                System.out.println("8 pontos");
                break;
            case 3:
                System.out.println("6 pontos");
                break;
            case 4:
                System.out.println("5 pontos");
                break;
            case 5:
                System.out.println("4 pontos");
                break;
            case 6:
                System.out.println("3 pontos");
                break;
            case 7:
                System.out.println("2 pontos");
                break;
            case 8:
                System.out.println("1 ponto");
                break;
            default:
                System.out.println("Não ganhou pontos");
                break;
        }

    }
}
