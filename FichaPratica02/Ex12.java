package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("Menu:");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Opção selecionada: Criar");
                break;
            case 2:
                System.out.println("Opção selecionada: Atualizar");
                break;
            case 3:
                System.out.println("Opção selecionada: Eliminar");
                break;
            case 4:
                // não faz nada
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

