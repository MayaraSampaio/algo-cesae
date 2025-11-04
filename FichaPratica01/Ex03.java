package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int altura,largura,area,perimetro;

        System.out.println("Introduza o valor de altura");
        altura = scanner.nextInt();

        System.out.println("Introduza o valor de largura");
        largura = scanner.nextInt();

        area = altura * largura;
        System.out.println("area = " + area);

        perimetro =(altura *2 ) + (largura *2);
        System.out.println("perimetro" + perimetro);

    }
}
