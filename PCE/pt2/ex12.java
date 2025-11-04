package PCE.pt2;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];

        Scanner sc = new Scanner(System.in);

        // vetor1
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um numero");
            vetor1[i] = sc.nextInt();
        }
        //vetor2
        for(int k= 0; k < vetor2.length; k ++) {
            System.out.println("Digite um numero");
            vetor2[k] = sc.nextInt();
        }
        // matriz 10 x 2
        //matriz[0][1] = vetor1[]
        //[0][2] =


        for (int l= 0; l < matriz.length; l++){
            for(int m= 0; m < matriz[0].length; m++){
                matriz[l][m] = vetor1[l];
            }
        }


    }

}




