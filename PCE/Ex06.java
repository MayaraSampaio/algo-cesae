package PCE;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        boolean crescente = true;


        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor ");
            vetor[i] = sc.nextInt();
        }

    //começa a 1 para comparar com o anterior
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] < vetor[i-1]) {
                crescente = false;
            }


        }
        if (crescente == true) {
            System.out.println("e crescente");
        } else {
            System.out.println("não e crescente");
        }

    }
}
