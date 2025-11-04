package FichaPratica03;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero, contadorIntervalo1,contadorIntervalo2,contadorIntervalo3,contadorIntervalo4 ;

        contadorIntervalo1=0;
        contadorIntervalo2=0;
        contadorIntervalo3=0;
        contadorIntervalo4=0;


        System.out.println("Digite um número:");
        numero= sc.nextInt();

        while(numero > 0){
            if (numero >= 0 && numero <=25){
                contadorIntervalo1++;
            } else if (numero >= 26 && numero <=50) {
                contadorIntervalo2++;
            }else if (numero >= 51 && numero <=75){
                contadorIntervalo3++;
            } else if (numero >= 76 && numero <= 100) {
                contadorIntervalo4++;
            }
            System.out.println("Digite um número:");
            numero= sc.nextInt();
        }
        System.out.println("[0,25]" + contadorIntervalo1);
        System.out.println("[26,50]" +contadorIntervalo2);
        System.out.println("[51,75]" +contadorIntervalo3);
        System.out.println("[76,100]" +contadorIntervalo4);
    }
}
