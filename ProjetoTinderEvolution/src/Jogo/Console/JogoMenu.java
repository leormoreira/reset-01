package Jogo.Console;

import Jogo.Dominio.Jogo;
import Jogo.Dominio.JogoCategoria;
import Jogo.Dominio.JogoPlataforma;
import Jogo.Gerenciador.JogoGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class JogoMenu {
    private JogoGerenciador gerenciador;

    public JogoMenu () {
        this.gerenciador = new JogoGerenciador();
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

    public Jogo criar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nCriação de Jogo");

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        System.out.println("Publisher ");
        String publisher = scanner.nextLine();

        System.out.println("Ano de Lançamento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento ");
        int dia = scanner.nextInt();

        System.out.println("Categoria ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.println("> ");
        String categorias = scanner.next();

        JogoCategoria categoria;
        switch (categorias){
            case "D":
                categoria = JogoCategoria.DRAMA;
                break;
            case "C":
                categoria = JogoCategoria.COMEDIA;
                break;
            case "S":
                categoria = JogoCategoria.SUSPENSE;
                break;
            case "T":
                categoria = JogoCategoria.TEROR;
                break;
            case "A":
                categoria = JogoCategoria.ACAO;
                break;
            case "M":
                categoria = JogoCategoria.MUSICAL;
                break;
            default:
                categoria = JogoCategoria.DRAMA;
        }

        System.out.println("Plataforma ");
        System.out.println("[ X ] XBOX");
        System.out.println("[ PS ] PS4");
        System.out.println("[ PC ] PC");
        System.out.println("[ S ] SNES");

        System.out.println("> ");
        String plataformas = scanner.next();

        JogoPlataforma plataforma;
        switch (plataformas){
            case "X":
                plataforma = JogoPlataforma.XBOX;
                break;
            case "PS":
                plataforma = JogoPlataforma.PS4;
                break;
            case "PC":
                plataforma = JogoPlataforma.PC ;
                break;
            case "S":
                plataforma = JogoPlataforma.SNES;
                break;
            default:
                plataforma = JogoPlataforma.XBOX;
        }
        Jogo jogo = new Jogo (nome, publisher, categoria, plataforma, LocalDate.of(ano, mes, dia));
        return gerenciador.salvar(jogo);
    }

    public Jogo editar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nEdição de Jogo");
        System.out.println("\nQual jogo desejas editar agora?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo: jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        System.out.println("Publisher ");
        String publisher = scanner.nextLine();

        System.out.println("Ano de Lançamento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Lançamento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento ");
        int dia = scanner.nextInt();

        System.out.println("Categoria ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.println("> ");
        String categorias = scanner.next();

        JogoCategoria categoria;
        switch (categorias){
            case "D":
                categoria = JogoCategoria.DRAMA;
                break;
            case "C":
                categoria = JogoCategoria.COMEDIA;
                break;
            case "S":
                categoria = JogoCategoria.SUSPENSE;
                break;
            case "T":
                categoria = JogoCategoria.TEROR;
                break;
            case "A":
                categoria = JogoCategoria.ACAO;
                break;
            case "M":
                categoria = JogoCategoria.MUSICAL;
                break;
            default:
                categoria = JogoCategoria.DRAMA;
        }

        System.out.println("Plataforma ");
        System.out.println("[ X ] XBOX");
        System.out.println("[ PS ] PS4");
        System.out.println("[ PC ] PC");
        System.out.println("[ S ] SNES");
        System.out.println("> ");
        String plataformas = scanner.next();

        JogoPlataforma plataforma;
        switch (plataformas){
            case "X":
                plataforma = JogoPlataforma.XBOX;
                break;
            case "PS":
                plataforma = JogoPlataforma.PS4;
                break;
            case "PC":
                plataforma = JogoPlataforma.PC ;
                break;
            case "S":
                plataforma = JogoPlataforma.SNES;
                break;
            default:
                plataforma = JogoPlataforma.XBOX;
        }

        Jogo atualizacao = new Jogo(nome, publisher, categoria, plataforma,  LocalDate.of(ano, mes, dia));

        Jogo jogoAtualizado = gerenciador.editar(id, atualizacao);

        if (jogoAtualizado == null) {
            System.out.println("Jogo não encontrado");
        } else {
            System.out.println(jogoAtualizado);
        }

        return jogoAtualizado;
    }

    private List<Jogo> listar () {
        System.out.println("\nListagem de Jogos");
        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        return jogos;
    }

    private void pesquisar () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisar Jogo");
        System.out.println("Digitar código do Jogo:");

        System.out.println("> ");
        int id = scanner.nextInt();

        Jogo jogo = gerenciador.pesquisar(id);

        if (jogo == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogo);
        }
    }

    private void deletar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nExcluir Jogo");
        System.out.println("Qual jogo desejas excluir?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[ " + jogo.getId() + "] - " + jogo.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Jogo deletado com sucesso.");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }
}