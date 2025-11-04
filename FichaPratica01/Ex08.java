package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // formato hh:mm:ss
        //receber o valor das 5 musicas minutos e segundos

        int hh;
        int mm;
        int ss;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza os minutos da musica 1");
        mm = scanner.nextInt();
        System.out.println("Introduza o segundos da musica 1");
        ss = scanner.nextInt();

        System.out.println("Introduza os minutos da musica 2");
        mm += scanner.nextInt();
        System.out.println("Introduza o segundos da musica 2");
        ss += scanner.nextInt();

        System.out.println("Introduza os minutos da musica 3");
        mm += scanner.nextInt();
        System.out.println("Introduza o segundos da musica 3");
        ss += scanner.nextInt();

        System.out.println("Introduza os minutos da musica 4");
        mm += scanner.nextInt();
        System.out.println("Introduza o segundos da musica 4");
        ss += scanner.nextInt();

        System.out.println("Introduza os minutos da musica 5");
        mm += scanner.nextInt();
        System.out.println("Introduza o segundos da musica 5");
        ss += scanner.nextInt();

        // calcular
        mm += ss/60;
        ss = ss % 60;
        hh = mm/60;
        mm = mm %60;

        System.out.println( "Total do Album: " +hh+"h " + mm+"m "+ ss+"s ");





    }
}
