package PCE.pt2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        int matriz[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i= 0; i < matriz.length; i++){
              for (int k=0; k < matriz[0].length; k++){
                  System.out.println("Digite um numero");
                  matriz[i][k] = sc.nextInt();

              }
        }
        for (int i= 0; i < matriz.length; i++){
            for (int k=0; k < matriz[0].length; k++){

                System.out.print(matriz[i][k]+" ");
            }
            System.out.println();
        }

    }
}
// 1 2 3
// 1 2 3
// 1 2 3