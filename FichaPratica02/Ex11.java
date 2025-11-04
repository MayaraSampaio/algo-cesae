package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double saldo,montante,novoSaldo;

            saldo = sc.nextDouble();
            System.out.print("Digite o montante a creditar (positivo) ou debitar (negativo): ");
            montante = sc.nextDouble();
            novoSaldo = saldo + montante;

            if (novoSaldo >= 0) {
                System.out.println("Operação válida.");
            } else {
                System.out.println("Operação inválida! Saldo ficaria negativo.");}
                System.out.println("Novo saldo: " + novoSaldo);

    }
}
