package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroLimite;
        int numeroAnterior;
        int total=0;
        int fatorial;
        int soma;

        System.out.println("Quantos numeros deseja inserir ?");
        numeroLimite= sc.nextInt();


        while(numeroLimite>=1){
            System.out.println(numeroLimite);
            numeroLimite--;
        }

    }
}







