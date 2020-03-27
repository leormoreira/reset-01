package Usuario.Console;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import Usuario.Dominio.Usuario;

public class UsuarioApp {
    public static void main(String[] args) {
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {
            System.out.println("\nSelecione uma opção");
            System.out.println("[ U ] Usuários");
            System.out.println("[ X ] Sair");
            System.out.println("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'U':
                    usuarioMenu.opcoes();
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
