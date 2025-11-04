package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Introduza o primeiro numero");
        numero1 = scanner.nextInt();

        System.out.println("Introduza o segundo numero");
        numero2 = scanner.nextInt();

        if(numero1> numero2){
            System.out.println( "O maior numero e = " + numero1);
        } else System.out.println("O maior numero e = " + numero2);

    }

}
