package Musica.Console;

import java.util.Scanner;

public class MusicaApp {
    public static void main(String[] args) {

        MusicaMenu musicaMenu = new MusicaMenu();
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ M ] Músicas");
            System.out.println("[ X ] Sair");
            System.out.println("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'M':
                    musicaMenu.opcoes();
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
