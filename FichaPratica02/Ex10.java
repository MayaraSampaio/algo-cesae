package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, resultado = 0;
        String operacao;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        b = sc.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = sc.next();

        if(operacao == "+"){
            resultado = a + b;
            System.out.println("Resultado: " + resultado);
        }else if (operacao == "-"){
            resultado = a - b;
            System.out.println("Resultado: " + resultado);
        }else if (operacao == "*"){
            resultado = a * b;
            System.out.println("Resultado: " + resultado);
        }else if (operacao == "/"){
            resultado = a/b;
            System.out.println("Resultado: " + resultado);
        }else{ System.out.println("Operação inválida.");}
    }
}

