package Esporte.Console;

import Esporte.Dominio.Esporte;
import Esporte.Gerenciador.EsporteGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class EsporteMenu {
    private EsporteGerenciador gerenciador;

    public EsporteMenu () {
        this.gerenciador = new EsporteGerenciador();
    }

    public void opcoes () {
        Scanner scanner = new Scanner (System.in);
        char opcao = ' ';

        while (opcao != 'X') {
            System.out.println("\nSelecione uma opção");
            System.out.println("[ C ] Criar");
            System.out.println("[ E ] Editar");
            System.out.println("[ L ] Listar");
            System.out.println("[ P ] Pesquisar");
            System.out.println("[ D ] Deletar");
            System.out.println("[ X ] Voltar");
            System.out.println("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    criar ();
                    break;
                case 'E':
                    editar ();
                    break;
                case 'L':
                    listar ();
                    break;
                case 'P':
                    pesquisar ();
                    break;
                case 'D':
                    deletar ();
                    break;
                case 'X':
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public Esporte criar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nCriação de Esporte");

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        Esporte esporte = new Esporte (nome);
        return gerenciador.salvar(esporte);
    }

    public Esporte editar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nEdição de Esporte");
        System.out.println("\nQual esporte desejas editar agora?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte: esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        Esporte atualizacao = new Esporte(nome);

        Esporte esporteAtualizado = gerenciador.editar(id, atualizacao);

        if (esporteAtualizado == null) {
            System.out.println("Esporte não encontrado");
        } else {
            System.out.println(esporteAtualizado);
        }

        return esporteAtualizado;
    }

    private List<Esporte> listar () {
        System.out.println("\nListagem de Esportes");
        List<Esporte> esportes = gerenciador.listar();

        for (Esporte esporte : esportes) {
            System.out.println(esporte);
        }

        return esportes;
    }

    private void pesquisar () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisar Esporte");
        System.out.println("Digitar código do Esporte:");

        System.out.println("> ");
        int id = scanner.nextInt();

        Esporte esporte = gerenciador.pesquisar(id);

        if (esporte == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporte);
        }
    }

    private void deletar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nExcluir Jogo");
        System.out.println("Qual esporte desejas excluir?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[ " + esporte.getId() + "] - " + esporte.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Esporte deletado com sucesso.");
        } else {
            System.out.println("Esporte não encontrado.");
        }
    }
}
