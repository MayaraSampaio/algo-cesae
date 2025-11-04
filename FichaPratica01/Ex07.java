package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        double valorProduto1,valorProduto2,valorProduto3;
        double valorTotal;
        double valorComDesconto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza o valor do produto 01");
        valorProduto1 = scanner.nextDouble();

        System.out.println("Introduza o valor do produto 02");
        valorProduto2 = scanner.nextDouble();

        System.out.println("Introduza o valor do produto 03");
        valorProduto3 = scanner.nextDouble();


        valorTotal = (valorProduto1+valorProduto2+valorProduto3);
        valorComDesconto= valorTotal - (valorTotal* 0.1);


    }
}
