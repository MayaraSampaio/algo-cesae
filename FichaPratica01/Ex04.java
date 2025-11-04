package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio;
        double pi = 3.14;
        double areaCircuferencia;

        System.out.println("Introduza o valor do raio");

        raio = scanner.nextDouble();
        areaCircuferencia = ( raio * raio) * pi;
        System.out.println("Area Circuferencia = " + areaCircuferencia);

    }
}
