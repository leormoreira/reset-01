package Filme.Console;

import Filme.Console.FilmeMenu;

import java.util.Scanner;

public class FilmeApp {
    public static void main(String[] args) {

        FilmeMenu filmeMenu = new FilmeMenu();
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ F ] Filme");
            System.out.println("[ X ] Sair");
            System.out.println("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'F':
                    filmeMenu.opcoes();
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
