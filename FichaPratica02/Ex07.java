package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Digite um número: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");

        }
    }
}
