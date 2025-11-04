package Ficha_Extra;

public class Ex4_3 {
    public static void main(String[] args) {

        int quantidadeAsteriscos=1;

        for (int linha = 0; linha < 5; linha++) {
            System.out.println();

            for (int espacos = 4; espacos > linha; espacos--) {
                System.out.print(" ");

            }

            for (int i = 0; i < quantidadeAsteriscos; i++) {
                System.out.print("*");
            }

            quantidadeAsteriscos+=2;

        }
    }
}
