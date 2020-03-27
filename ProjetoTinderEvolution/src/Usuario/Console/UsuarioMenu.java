package Usuario.Console;

import Musica.Dominio.Musica;
import Usuario.Dominio.Localizacao;
import Usuario.Dominio.Usuario;
import Usuario.Gerenciador.UsuarioGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UsuarioMenu {
    private UsuarioGerenciador gerenciador;

    public UsuarioMenu () {
        this.gerenciador = new UsuarioGerenciador();
    }

    public void opcoes () {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {
            System.out.println("\nSelecione a opção desejada");
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
                    pesquisar();
                    break;
                case 'D':
                    deletar ();
                    break;
                case 'X':
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public Usuario criar () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriar novo usuário");

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        System.out.println("E-mail ");
        String email = scanner.nextLine();

        System.out.println("Telefone ");
        String telefone = scanner.nextLine();

        System.out.println("Ano de Nascimento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Nascimento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Nascimento ");
        int dia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Bio ");
        String bio = scanner.nextLine();

        System.out.println("Latitude ");
        double latitude = scanner.nextDouble();

        System.out.println("Longitude ");
        double longitude = scanner.nextDouble();

        Localizacao localizacao = new Localizacao(latitude, longitude);

        Usuario usuario = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, localizacao);

        return gerenciador.salvar(usuario);
    }

    public Usuario editar () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar Usuário");
        System.out.println("Qual Usuário deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios){
            System.out.println("[ " + usuario.getId() + " ] - " + usuario.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome ");
        String nome = scanner.nextLine();

        System.out.println("E-mail ");
        String email = scanner.nextLine();

        System.out.println("Telefone ");
        String telefone = scanner.nextLine();

        System.out.println("Ano de Nascimento ");
        int ano = scanner.nextInt();

        System.out.println("Mês de Nascimento ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Nascimento ");
        int dia = scanner.nextInt();

        System.out.println("Bio ");
        String bio = scanner.nextLine();

        System.out.println("Latitude ");
        double latitude = scanner.nextDouble();

        System.out.println("Longitude ");
        double longitude = scanner.nextDouble();

        Localizacao localizacao = new Localizacao(latitude, longitude);

        Usuario atualizacao = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, localizacao);
        Usuario usuarioAtualizado = gerenciador.editar(id, atualizacao);

        if (usuarioAtualizado == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuarioAtualizado);
        }
        return usuarioAtualizado;
    }

    private List<Usuario> listar () {
        System.out.println("\n Listagem de Usuário");
        List<Usuario> usuarios = gerenciador.listar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        return usuarios;
    }

    private void pesquisar () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisar Usuário");
        System.out.println("Qual o código do Usuário?");

        System.out.println("> ");
        int id = scanner.nextInt();

        Usuario usuario = gerenciador.pesquisar(id);

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuario);
        }
    }

    public void deletar () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDeletar perfil de Usuário");
        System.out.println("Qual perfil quer deletar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[ " + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Perfil excluído.");
        } else {
            System.out.println("Perfil não encontrado");
        }
    }
}
