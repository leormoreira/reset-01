package Serie.Console;

import Serie.Dominio.Serie;
import Serie.Dominio.SerieCategoria;
import Serie.Gerenciador.SerieGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class SerieMenu {
    private SerieGerenciador gerenciador;

    public SerieMenu () {
        this.gerenciador = new SerieGerenciador();
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

    public Serie criar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nCriação de Série");

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
        System.out.println("[ ST ] SITCOM");
        System.out.println("> ");
        String categorias = scanner.next();

        SerieCategoria categoria;

        switch (categorias){
            case "D":
                categoria = SerieCategoria.DRAMA;
                break;
            case "C":
                categoria = SerieCategoria.COMEDIA;
                break;
            case "S":
                categoria = SerieCategoria.SUSPENSE;
                break;
            case "T":
                categoria = SerieCategoria.TERROR;
                break;
            case "A":
                categoria = SerieCategoria.ACAO;
                break;
            case "ST":
                categoria = SerieCategoria.SITCON;
                break;
            default:
                categoria = SerieCategoria.ACAO;
        }

        System.out.println("Ano de Lançamento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento ");
        int dia = scanner.nextInt();

        System.out.println("Número de Temporadas ");
        int temporadas = scanner.nextInt();

        System.out.println("Número de Episódios ");
        int episodios = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Sinopse ");
        String sinopse = scanner.nextLine();

        Serie serie = new Serie (nome, diretor, categoria,  LocalDate.of(ano, mes, dia), temporadas, episodios, sinopse);
        return gerenciador.salvar(serie);
    }

    public Serie editar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nEdição de Série");
        System.out.println("\nQual Série desejas editar agora?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie: series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
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

        SerieCategoria categoria;
        switch (categorias){
            case "D":
                categoria = SerieCategoria.DRAMA;
                break;
            case "C":
                categoria = SerieCategoria.COMEDIA;
                break;
            case "S":
                categoria = SerieCategoria.SUSPENSE;
                break;
            case "T":
                categoria = SerieCategoria.TERROR;
                break;
            case "A":
                categoria = SerieCategoria.ACAO;
                break;
            case "ST":
                categoria = SerieCategoria.SITCON;
                break;
            default:
                categoria = SerieCategoria.ACAO;
        }

        System.out.println("Ano de Lançamento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento ");
        int dia = scanner.nextInt();

        System.out.println("Número de Temporadas ");
        int temporadas = scanner.nextInt();

        System.out.println("Número de Episódios ");
        int episodios = scanner.nextInt();
        scanner.nextInt();

        System.out.println("Sinopse ");
        String sinopse = scanner.nextLine();

        Serie atualizacao = new Serie (nome, diretor, categoria, LocalDate.of(ano, mes, dia), temporadas, episodios, sinopse);

        Serie serieAtualizada = gerenciador.editar(id, atualizacao);

        if (serieAtualizada == null) {
            System.out.println("Série não encontrada");
        } else {
            System.out.println(serieAtualizada);
        }

        return serieAtualizada;
    }

    private List<Serie> listar () {
        System.out.println("\nListagem de Série");
        List<Serie> series = gerenciador.listar();

        for (Serie serie : series) {
            System.out.println(serie);
        }

        return series;
    }

    private void pesquisar () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisar Série");
        System.out.println("Digitar código da Série:");

        System.out.println("> ");
        int id = scanner.nextInt();

        Serie serie = gerenciador.pesquisar(id);

        if (serie == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serie);
        }
    }

    private void deletar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nExcluir Série");
        System.out.println("Qual série desejas excluir?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[ " + serie.getId() + "] - " + serie.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Série deletada com sucesso.");
        } else {
            System.out.println("Série não encontrado.");
        }
    }
}
