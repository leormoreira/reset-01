package Curiosidade.Console;

import Curiosidade.Console.CuriosidadeMenu;

import java.util.Scanner;

public class CuriosidadeApp {
    public static void main(String[] args) {

        CuriosidadeMenu curiosidadeMenu = new CuriosidadeMenu();
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ C ] Curiosidade");
            System.out.println("[ X ] Sair");
            System.out.println("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    curiosidadeMenu.opcoes();
                    break;
                case 'X':
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
