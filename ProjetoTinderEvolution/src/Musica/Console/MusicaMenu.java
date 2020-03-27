package Musica.Console;

import Musica.Dominio.MusicaEstilo;
import Musica.Gerenciador.MusicaGerenciador;
import Musica.Dominio.Musica;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MusicaMenu {
    private MusicaGerenciador gerenciador;

    public MusicaMenu () {
        this.gerenciador = new MusicaGerenciador();
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

    public Musica criar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nCriação de Música");

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        System.out.println("Artista ");
        String artista = scanner.nextLine();

        System.out.println("Ano de Lançamento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento ");
        int dia = scanner.nextInt();

        System.out.println("Estilo ");
        System.out.println("[ F ] FUNK");
        System.out.println("[ P ] PAGODE");
        System.out.println("[ R ] ROCK");
        System.out.println("[ I ] INDIE");
        System.out.println("[ S ] SERTANEJO");
        System.out.println("[ M ] METAL");
        System.out.println("> ");
        String estilo = scanner.next();

        MusicaEstilo estiloMusical;
        switch (estilo){
            case "F":
                estiloMusical = MusicaEstilo.FUNK;
                break;
            case "P":
                estiloMusical = MusicaEstilo.PAGODE;
                break;
            case "R":
                estiloMusical = MusicaEstilo.ROCK;
                break;
            case "I":
                estiloMusical = MusicaEstilo.INDIE;
                break;
            case "S":
                estiloMusical = MusicaEstilo.SERTANEJO;
                break;
            case "M":
                estiloMusical = MusicaEstilo.METAL;
                break;
            default:
                estiloMusical = MusicaEstilo.SERTANEJO;
        }
        Musica musica = new Musica (nome, artista, LocalDate.of(ano, mes, dia), estiloMusical);
        return gerenciador.salvar(musica);
    }

    public Musica editar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nEdição de Música");
        System.out.println("\nQual música desejas editar agora?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica: musicas) {
            System.out.println("[" + musica.getId() + "] - " + musica.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Artista: ");
        String artista = scanner.nextLine();

        System.out.println("Ano de Lançamento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento ");
        int dia = scanner.nextInt();

        System.out.println("Estilo ");
        System.out.println("[ F ] FUNK");
        System.out.println("[ P ] PAGODE");
        System.out.println("[ R ] ROCK");
        System.out.println("[ I ] INDIE");
        System.out.println("[ S ] SERTANEJO");
        System.out.println("[ M ] METAL");
        System.out.println("> ");
        String estilo = scanner.next();

        MusicaEstilo estiloMusical;
        switch (estilo){
            case "F":
                estiloMusical = MusicaEstilo.FUNK;
                break;
            case "P":
                estiloMusical = MusicaEstilo.PAGODE;
                break;
            case "R":
                estiloMusical = MusicaEstilo.ROCK;
                break;
            case "I":
                estiloMusical = MusicaEstilo.INDIE;
                break;
            case "S":
                estiloMusical = MusicaEstilo.SERTANEJO;
                break;
            case "M":
                estiloMusical = MusicaEstilo.METAL;
                break;
            default:
                estiloMusical = MusicaEstilo.SERTANEJO;
        }
        Musica atualizacao = new Musica(nome, artista, LocalDate.of(ano, mes, dia), estiloMusical);

        Musica musicaAtualizada = gerenciador.editar(id, atualizacao);

        if (musicaAtualizada == null) {
            System.out.println("Música não encontrada");
        } else {
            System.out.println(musicaAtualizada);
        }

        return musicaAtualizada;
    }

    private List<Musica> listar () {
        System.out.println("\nListagem de Músicas");
        List<Musica> musicas = gerenciador.listar();

        for (Musica musica : musicas) {
            System.out.println(musica);
        }

        return musicas;
    }

    private void pesquisar () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisar Música");
        System.out.println("Digitar código da Música:");

        System.out.println("> ");
        int id = scanner.nextInt();

        Musica musica = gerenciador.pesquisar(id);

        if (musica == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musica);
        }
    }

    private void deletar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nExcluir Música");
        System.out.println("Qual música desejas excluir?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[ " + musica.getId() + "] - " + musica.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Música deletada com sucesso.");
        } else {
            System.out.println("Música não encontrada.");
        }
    }
}
