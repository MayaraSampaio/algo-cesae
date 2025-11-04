package FichaPratica06;

import java.util.Scanner;

public class Ex05 {
    /**
     * Função para retornar o maior valor
     * @param vetor
     * @return retorna o maior numero de um vetor
     */
        public static int retornaMaior(int[] vetor){
        int maior= vetor[0];

            for (int i = 1; i < vetor.length; i++){

                if (vetor[i] > maior){
                        maior = vetor[i];
                }

            }   return maior;


        }

    /**
     * Função para retornar o menor valor
     * @param vetor
     * @return retorna o menor valor
     */
    public static int retornaMenor(int[] vetor){
        int menor= vetor[0];

        for (int i = 1; i < vetor.length; i++){

            if (vetor[i] <= menor){
                menor = vetor[i];
            }

        }   return menor;


    }

    /**
     * Função para verificar se o número é crescente ou não crescente
     * @param vetor
     * @return false se for não crescente || true se for crescente
     */
    public static boolean crescenteOuNaoCrescente(int[] vetor){

        for (int i = 1; i < vetor.length; i++){
            if (vetor[i -1] < vetor[i]){
                return false;
            }

        }return true;


    }


}
