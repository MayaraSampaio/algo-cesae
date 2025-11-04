package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número");
        numero=sc.nextInt();
        int i =2;
        while(i<=numero){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }


    }
}
