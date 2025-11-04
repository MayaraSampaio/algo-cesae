package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, numero3, media, mediaPonderada;

        System.out.println("Introduza o primeiro numero");
        numero1 = scanner.nextInt();

        System.out.println("Introduza o segundo numero");
        numero2 = scanner.nextInt();

        System.out.println("Introduza o terceiro numero");
        numero3 = scanner.nextInt();

        media = (numero1 + numero2 + numero3) / 3;
        // mediaPonderada= numero1 *0.2 + ... ;

    }
}
