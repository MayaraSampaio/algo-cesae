package PCE.pt2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i= 0; i < matriz.length; i++){
            for (int k=0; k < matriz[0].length; k++){
                System.out.println("Digite um numero");
                matriz[i][k] = sc.nextInt();


            }
        }
        for (int i= 0; i < matriz.length; i++){
            for (int k=0; k < matriz[0].length; k++){

                soma += matriz[i][k];
                System.out.print(matriz[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println(soma);
    }
}


