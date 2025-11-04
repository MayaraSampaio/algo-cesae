package FichaPratica01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int numero1, numero2;
        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;

        System.out.println("Introduza o primeiro numero");
        numero1 = scanner.nextInt();

        System.out.println("Introduza o segundo numero");
        numero2 = scanner.nextInt();

        soma= numero1 + numero2;
        subtracao= numero1 - numero2;
        multiplicacao= numero1 * numero2;
        divisao= (double) numero1 /numero2;

        System.out.println("Soma = " + soma);
        System.out.println("subtracao = "+ subtracao);
        System.out.println("multiplicacao =" + multiplicacao);
        System.out.println("divisao= " + divisao);



//Alterar para resultado

    }
}
