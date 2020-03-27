package Curiosidade.Console;

import Curiosidade.Dominio.Curiosidade;
import Curiosidade.Dominio.CuriosidadeCategoria;
import Curiosidade.Gerenciador.CuriosidadeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CuriosidadeMenu  {
    private CuriosidadeGerenciador gerenciador;

    public CuriosidadeMenu () {
        this.gerenciador = new CuriosidadeGerenciador();
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

    public Curiosidade criar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nCriação de Curiosidade");

        System.out.println("Descrição ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria ");
        System.out.println("[ C ] COMPORTAMENTO");
        System.out.println("[ E ] EVENTO");
        System.out.println("[ AP ] APARÊNCIA");
        System.out.println("[ AL ] ALIMENTAÇÃO");
        System.out.println("> ");
        String categorias = scanner.next();

        CuriosidadeCategoria categoria;
        switch (categorias){
            case "C":
                categoria = CuriosidadeCategoria.COMPORTAMENTO;
                break;
            case "E":
                categoria = CuriosidadeCategoria.EVENTO;
                break;
            case "AP":
                categoria = CuriosidadeCategoria.APARENCIA;
                break;
            case "AL":
                categoria = CuriosidadeCategoria.ALIMENTACAO;
                break;
            default:
                categoria = CuriosidadeCategoria.COMPORTAMENTO;
        }
        Curiosidade curiosidade = new Curiosidade (descricao, categoria);
        return gerenciador.salvar(curiosidade);
    }

    public Curiosidade editar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nEdição de Curiosidade");
        System.out.println("\nQual duriosidade desejas editar agora?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade: curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria ");
        System.out.println("[ C ] COMPORTAMENTO");
        System.out.println("[ E ] EVENTO");
        System.out.println("[ AP ] APARÊNCIA");
        System.out.println("[ AL ] ALIMENTAÇÃO");
        System.out.println("> ");
        String categorias = scanner.next();

        CuriosidadeCategoria categoria;
        switch (categorias){
            case "C":
                categoria = CuriosidadeCategoria.COMPORTAMENTO;
                break;
            case "E":
                categoria = CuriosidadeCategoria.EVENTO;
                break;
            case "AP":
                categoria = CuriosidadeCategoria.APARENCIA;
                break;
            case "AL":
                categoria = CuriosidadeCategoria.ALIMENTACAO;
                break;
            default:
                categoria = CuriosidadeCategoria.COMPORTAMENTO;
        }
        Curiosidade atualizacao = new Curiosidade(descricao, categoria);

        Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualizacao);

        if (curiosidadeAtualizada == null) {
            System.out.println("Curiosidade não encontrada");
        } else {
            System.out.println(curiosidadeAtualizada);
        }

        return curiosidadeAtualizada;
    }

    private List<Curiosidade> listar () {
        System.out.println("\nListagem de Cusiosidades");
        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }

        return curiosidades;
    }

    private void pesquisar () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisar Curiosidade");
        System.out.println("Digitar código da Curiosidade:");

        System.out.println("> ");
        int id = scanner.nextInt();

        Curiosidade curiosidade = gerenciador.pesquisar(id);

        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidade);
        }
    }

    private void deletar () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nExcluir Curiosidade");
        System.out.println("Qual Curiosidade desejas excluir?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[ " + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }
        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Curiosidade deletada com sucesso.");
        } else {
            System.out.println("Curiosidade não encontrada.");
        }
    }
}

