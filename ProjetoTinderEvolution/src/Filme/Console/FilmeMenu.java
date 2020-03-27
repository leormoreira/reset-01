package Filme.Console;




import Filme.Dominio.Filme;
import Filme.Dominio.FilmeCategoria;
import Filme.Gerenciador.FilmeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class FilmeMenu {
    private FilmeGerenciador gerenciador;

    public FilmeMenu () {
        this.gerenciador = new FilmeGerenciador();
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

    public Filme criar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nCriação de Filme");

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        System.out.println("Diretor ");
        String diretor = scanner.nextLine();

        System.out.println("Categoria ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.println("> ");
        String categorias = scanner.next();

        FilmeCategoria categoria;

        switch (categorias){
            case "D":
                categoria = FilmeCategoria.DRAMA;
                break;
            case "C":
                categoria = FilmeCategoria.COMEDIA;
                break;
            case "S":
                categoria = FilmeCategoria.SUSPENSE;
                break;
            case "T":
                categoria = FilmeCategoria.TERROR;
                break;
            case "A":
                categoria = FilmeCategoria.ACAO;
                break;
            case "M":
                categoria = FilmeCategoria.MUSICAL;
                break;
            default:
                categoria = FilmeCategoria.ACAO;
        }

        System.out.println("Ano de Lançamento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento ");
        int dia = scanner.nextInt();
        scanner.nextInt();

        System.out.println("Sinopse ");
        String sinopse = scanner.nextLine();

        Filme filme = new Filme (nome, diretor, categoria,  LocalDate.of(ano, mes, dia), sinopse);
        return gerenciador.salvar(filme);
    }

    public Filme editar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nEdição de Filme");
        System.out.println("\nQual Filme desejas editar agora?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme: filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        System.out.println("Diretor ");
        String diretor = scanner.nextLine();

        System.out.println("Categoria ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.println("> ");
        String categorias = scanner.next();

        FilmeCategoria categoria;
        switch (categorias){
            case "D":
                categoria = FilmeCategoria.DRAMA;
                break;
            case "C":
                categoria = FilmeCategoria.COMEDIA;
                break;
            case "S":
                categoria = FilmeCategoria.SUSPENSE;
                break;
            case "T":
                categoria = FilmeCategoria.TERROR;
                break;
            case "A":
                categoria = FilmeCategoria.ACAO;
                break;
            case "M":
                categoria = FilmeCategoria.MUSICAL;
                break;
            default:
                categoria = FilmeCategoria.ACAO;
        }

        System.out.println("Ano de Lançamento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento ");
        int dia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Sinopse ");
        String sinopse = scanner.nextLine();

        Filme atualizacao = new Filme (nome, diretor, categoria, LocalDate.of(ano, mes, dia), sinopse);

        Filme filmeAtualizado = gerenciador.editar(id, atualizacao);

        if (filmeAtualizado == null) {
            System.out.println("Filme não encontrado");
        } else {
            System.out.println(filmeAtualizado);
        }

        return filmeAtualizado;
    }

    private List<Filme> listar () {
        System.out.println("\nListagem de Filmes");
        List<Filme> filmes = gerenciador.listar();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        return filmes;
    }

    private void pesquisar () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisar Filme");
        System.out.println("Digitar código da Filme:");

        System.out.println("> ");
        int id = scanner.nextInt();

        Filme filme = gerenciador.pesquisar(id);

        if (filme == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filme);
        }
    }

    private void deletar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nExcluir Filme");
        System.out.println("Qual filme desejas excluir?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[ " + filme.getId() + "] - " + filme.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Filme deletado com sucesso.");
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
