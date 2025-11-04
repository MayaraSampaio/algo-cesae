package FichaPratica06;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracter;
        int linha;


        System.out.println("Digite um caracter");
        caracter= sc.next();
        System.out.println("Digite uma linha");
        linha =sc.nextInt();







    }


            public static void fazerQuadrado(String caracter,int linha, int coluna){

                    for (int k =0 ;k < coluna; k++){
                        System.out.print(caracter);
                    }
                    System.out.println(" ");

                    for (int m = 0; m <= coluna-2; m++ ) {
                        for (int i = 0; i < coluna ; i++) {

                            if (i == 0) {
                                System.out.print(caracter);
                            } else if (i == coluna) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");

                            }
                        }
                    }
                    for (int k =0 ;k < coluna; k++){
                        System.out.print(caracter);
                    }



            }
}

