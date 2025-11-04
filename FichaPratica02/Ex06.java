package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;
        System.out.print("Nota 1: ");
        n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        n3 = sc.nextDouble();
        media = (n1 * 0.25 + n2 * 0.35 + n3 * 0.40)/3;

        if (media >= 9.5) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }

    }
}
