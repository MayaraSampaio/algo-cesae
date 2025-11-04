package FichaPratica03;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite;
        int inicio = 1;

        int numero, numeroAnterior;
        boolean crescente = true;


        System.out.println("Quantos numeros deseja inserir ?");
        limite = sc.nextInt();


        System.out.println("Digite seu número");
        numeroAnterior = sc.nextInt();
        inicio++;

        while (inicio <= limite) {
            System.out.println("Digite seu número");
            numero = sc.nextInt();

            if (numero <= numeroAnterior) {
                // se entrar neste if, é porque a sequencia não é crescente
                crescente = false;
                // System.out.println("entrei no if, a variavel crescente passou para falso");
            }

            numeroAnterior = numero;
            inicio++;

        }

        if (crescente == true) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }


    }
}
