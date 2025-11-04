package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double salarioAnual;
        double montanteDeImpostos=0;

        System.out.println("Insira o valor do salario anual");
        salarioAnual = input.nextDouble();

        if(salarioAnual<=15000){
            montanteDeImpostos = salarioAnual * 0.20;
        }else if(salarioAnual<=20000){
            montanteDeImpostos = salarioAnual * 0.30;
        }else if(salarioAnual<=25000){
            montanteDeImpostos = salarioAnual * 0.35;
        }else{
            montanteDeImpostos = salarioAnual * 0.40;
        }

        System.out.println("O montante de impostos e : " + montanteDeImpostos);

    }
}
