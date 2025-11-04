package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite seu número");
        numero=sc.nextInt();

        for(int i = numero-5; i<=numero+5;i++){
            System.out.println(i);


        }
    }
}
