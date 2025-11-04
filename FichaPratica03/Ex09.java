package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        int contador = 0;
        double media = 0;

        while (numero != -1) {
            System.out.println("digite um numero");
            numero = sc.nextInt();
            soma = soma + numero;
            contador++;

        }
        media = (double) soma + 1 / (double) contador;
        System.out.println(media);

    }


}
