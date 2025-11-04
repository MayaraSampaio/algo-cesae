package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Digite o primeiro valor: ");
        a = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextDouble();
        if (a > b) {
            System.out.println("Maior: " + a);
            System.out.println("Menor: " + b);
        } else {
            System.out.println("Maior: " + b);
            System.out.println("Menor: " + a);
        }

    }
}
