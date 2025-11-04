package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,temp;
        System.out.println("Digite o primeiro número");
        a = sc.nextDouble();
        System.out.println("Digite o segundo número");
        b = sc.nextDouble();
        System.out.println("Digite o terceiro número");
        c = sc.nextDouble();

        if(a < b && a < c){
            System.out.println("Menor "+ a);
        }
        if (b < a && b < c){
            System.out.println("Menor "+b);
        }
        if (c < a && c< b){
            System.out.println("Menor "+c);
        }
    }
}
