package Serie.Console;

import Serie.Console.SerieMenu;

import java.util.Scanner;

public class SerieApp {
    public static void main(String[] args) {

    SerieMenu serieMenu = new SerieMenu();
    Scanner scanner = new Scanner(System.in);
    char opcao = ' ';

        while (opcao != 'X') {

        System.out.println("\nSelecione uma opção");
        System.out.println("[ S ] Série");
        System.out.println("[ X ] Sair");
        System.out.println("> ");
        opcao = scanner.next().charAt(0);

        switch (opcao) {
            case 'S':
                serieMenu.opcoes();
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

