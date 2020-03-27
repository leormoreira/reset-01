package Esporte.Console;

import Esporte.Console.EsporteMenu;

import java.util.Scanner;

public class EsporteApp {
    public static void main(String[] args) {

        EsporteMenu esporteMenu = new EsporteMenu();
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ E ] Esportes");
            System.out.println("[ X ] Sair");
            System.out.println("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'E':
                    esporteMenu.opcoes();
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
