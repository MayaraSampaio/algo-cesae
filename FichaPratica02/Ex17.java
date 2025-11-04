package FichaPratica02;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoMedio=0;
        double taxa=0;
        double calculoCredito = 0;

        System.out.println("Digite o saldo medio");
        saldoMedio = sc.nextDouble();


        if(saldoMedio == 0 && saldoMedio <=2000){
            System.out.println("Nenhum crédito");
            calculoCredito= saldoMedio + (saldoMedio*taxa);
        } else if (saldoMedio>2000 && saldoMedio<=4000 ) {
            taxa = 0.2;
            calculoCredito= saldoMedio + (saldoMedio*taxa);
        }else if (saldoMedio>4000 && saldoMedio<=6000){
            taxa = 0.3;
            calculoCredito= saldoMedio + (saldoMedio*taxa);
        }else if (saldoMedio>6000){
            taxa = 0.4;
            calculoCredito= saldoMedio + (saldoMedio*taxa);
        }
        System.out.println("Credito " + calculoCredito);
    }
}
