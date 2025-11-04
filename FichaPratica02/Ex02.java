package FichaPratica02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double salarioAnual;
        double montanteDeImpostos;

        System.out.println("Insira o valor do salario anual");
        salarioAnual = input.nextDouble();
        if(salarioAnual<= 15000){
            montanteDeImpostos = salarioAnual * 0.20;
        }else{
            montanteDeImpostos= salarioAnual* 0.30;
        }
        System.out.println("O montante de impostos e : " + montanteDeImpostos);

    }
}
