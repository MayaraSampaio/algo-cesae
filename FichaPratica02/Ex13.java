package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minuto;
        System.out.print("Digite a hora (0-23): ");
        hora = sc.nextInt();
        System.out.print("Digite os minutos (0-59): ");
        minuto = sc.nextInt();
        if (hora > 12) {
            hora = hora - 12;
            System.out.println("Resultado: " + hora + " " + minuto + " PM");
        } else {
            System.out.println("Resultado: " + hora + " " + minuto + " AM");
        }
    }
}
