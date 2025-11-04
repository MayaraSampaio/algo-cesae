package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean primo = true;


        System.out.println("digite um número :");
        numero = sc.nextInt();


        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                primo = false;
            }

        }if (!primo){
            System.out.println("não é primo");
        }else {
            System.out.println("é primo");
        }









    }
}
