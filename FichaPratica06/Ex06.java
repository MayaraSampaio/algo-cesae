package FichaPratica06;

import java.util.Scanner;


import static FichaPratica06.Ex05.*;

public class Ex06 {
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // Declarar variáveis;
                int numero, opcao;

                // Ler número
                System.out.print("Insira um número para ser analisado: ");
                numero = input.nextInt();


                do {

                    System.out.println("\n\n********** Programa de Análise de um Número: " + numero + " **********");
                    System.out.println("7. Maior Elemento");
                    System.out.println("8. Menor Elemento");
                    System.out.println("9. Crescente ou Não Crescente");
                    System.out.println("0. Sair");

                    System.out.print("\nOpção:");
                    opcao = input.nextInt();

                    System.out.println();

                    switch (opcao) {
                        case 7:// Retorna o maior
                            System.out.println("Digite o tamanho do seu vetor");
                            int[] vetor = new int[input.nextInt()];
                            for (int i = 1; i < vetor.length; i++){
                                System.out.println("digite um numero");
                                vetor[i]= input.nextInt();
                            }
                            System.out.println(retornaMaior(vetor));
                            break;

                        case 8://Retorna o menor
                            System.out.println("Digite o tamanho do seu vetor");
                            int[] vetorNum = new int[input.nextInt()];

                            for (int i = 1; i < vetorNum.length; i++){
                                System.out.println("digite um numero");
                                vetorNum[i]= input.nextInt();
                            }
                            System.out.println(retornaMenor(vetorNum));
                            break;

                        case 9:// retorna se é crescente ou não crecente
                            System.out.println("Digite se é crescente ou não crescente");
                            int[] vetorCrescente = new int[input.nextInt()];
                            for (int i = 1; i < vetorCrescente.length; i++){
                                System.out.println("digite um numero");
                                vetorCrescente[i]= input.nextInt();
                            }
                            if (crescenteOuNaoCrescente(vetorCrescente)){
                                System.out.println("é Crescente");
                            }else {
                                System.out.println("não é crescente");
                            }

                            break;

                        case 0: // Sair
                            System.out.println("Obrigado e até à próxima \uD83C\uDFC3\uD83D\uDEAA");
                            break;

                        default:
                            System.out.println("❌ Opção Inválida ❌");
                            break;
                    }





                } while (opcao != 0);
            }
    }

