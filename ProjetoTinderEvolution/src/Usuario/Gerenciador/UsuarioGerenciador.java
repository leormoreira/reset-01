package Usuario.Gerenciador;

import Usuario.Acervo.UsuarioAcervo;
import Usuario.Dominio.Usuario;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class UsuarioGerenciador {
    private UsuarioAcervo acervo = new UsuarioAcervo();

    public Usuario salvar(Usuario usuario) {

        List<Usuario> usuarios = acervo.listar();
        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                System.out.println("Usuário existente");
                return usuarioExistente;
            }
        }
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getBio().isEmpty() || usuario.getdataNascimento() == null || usuario.getLocalização() == null) {
            System.out.println("Falha ao criar Usuário: dados obrigatórios não preenchidos");
            return null;
        }
        if (usuario.getidadeAtual (usuario.getdataNascimento()) < 18) {
            System.out.println("App somente para mariores de idade");
            return null;
        } else {
            System.out.println("Usuário criado com sucesso");
            return acervo.salvar(usuario);
        }
    }

    public Usuario editar (int id, Usuario usuarioAtualizado) {
        Usuario usuarioParaEditar = pesquisar (id);
        if (usuarioParaEditar == null) {
            System.out.println("Usuário inexistente");
            return null;
        } else {
            System.out.println("Usuário editado com sucesso");
            return acervo.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

    public List<Usuario> listar () {
        return acervo.listar();
    }

    public Usuario pesquisar (int id) {
        if (id > 0) {
            return acervo.pesquisar(id);
        }
        return null;
    }

    public boolean deletar (int id){
        if (id > 0) {
            return acervo.deletar(id);
        }
        return false;
    }
}



