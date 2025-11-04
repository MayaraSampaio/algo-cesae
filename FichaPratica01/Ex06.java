package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza o primeiro numero");
        numero1 = scanner.nextInt();

        System.out.println("Introduza o segundo numero");
        numero2 = scanner.nextInt();


        //n1=4
        //n2=2

        System.out.println("numero1 =" + numero1);
        System.out.println("numero2 = " + numero2);
        numero1= numero1 + numero2;
        numero2= numero1 - numero2;
        System.out.println("numero2 = " + numero2);
        numero1 = numero1 - numero2;
        System.out.println("numero1 = " + numero1);

    }
}
