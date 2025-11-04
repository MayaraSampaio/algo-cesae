package PCE;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int[] listaNumero = new int[10];
        int numero = 0;
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < listaNumero.length; i++) {
            System.out.println("digite um número");
            numero = sc.nextInt();
            listaNumero[i] = numero;
        }
        for (int i = 0; i < listaNumero.length; i++) {
            soma += listaNumero[i];
        }
        System.out.println(soma/listaNumero.length);
    }
}


