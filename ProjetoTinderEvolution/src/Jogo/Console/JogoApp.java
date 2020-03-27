package Jogo.Console;

import Jogo.Console.JogoMenu;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class JogoApp {
    public static void main(String[] args) {

        JogoMenu jogoMenu = new JogoMenu();
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ J ] Jogos");
            System.out.println("[ X ] Sair");
            System.out.println("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'J':
                    jogoMenu.opcoes();
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
