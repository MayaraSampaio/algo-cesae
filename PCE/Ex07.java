package PCE;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        boolean existe = false;

        Scanner sc = new Scanner(System.in);

        //inserir numeros no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor ");
            vetor[i] = sc.nextInt();
        }

        int maior=-1;

        // identificar números pares
        for(int i = 1; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                maior= vetor[i-1];
                if (vetor[i] > maior){
                    maior= vetor[i];
                    existe = true;
                }

            }
        }
        if (existe == true){
            System.out.println(" Esse é o maior" + maior);
        }else {
            System.out.println("não existe");
        }
    }
}
