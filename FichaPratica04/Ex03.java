package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroJogador1, numeroJogador2, contador=0;
        boolean sucesso = false;


        System.out.println("JOGADOR 1: Digite um valor de 0 a 100:");
        numeroJogador1=sc.nextInt();

        do {
            System.out.println("JOGADOR 2: Adivinhe o valor do jogador 1");
            numeroJogador2= sc.nextInt();

            if (numeroJogador1 == numeroJogador2){
                contador++;
                sucesso=true;

            }else if (numeroJogador2 != numeroJogador1) {
                contador++;
                sucesso=false;

                if (numeroJogador2 > numeroJogador1){
                    System.out.println("o numero do jogador 1 é inferior");
                }else {
                    System.out.println("o numero do jogador 1 é superior");
                }
            }
        }while(sucesso != true);

        System.out.println("tentativas :" + contador);
    }


}
