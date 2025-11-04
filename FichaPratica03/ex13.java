package FichaPratica03;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inicio,limite;

        System.out.println("Digite o valor de inicio:");
        inicio= sc.nextInt();
        System.out.println("Digite o valor limite");
        limite=sc.nextInt();

        while (inicio <= limite){{
            if (inicio % 5 == 0 ){
                System.out.println(inicio);
            }
            inicio=inicio+1;
        }
        }
    }
}
