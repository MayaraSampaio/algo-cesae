package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inicio,salto, limite ;
        inicio= 0;

        System.out.println("Digite o valor de salto:");
        salto= sc.nextInt();
        System.out.println("Digite o valor limite");
        limite=sc.nextInt();
        while(inicio<=limite){
            System.out.println(inicio);
            inicio= inicio + salto;
        }
    }
}