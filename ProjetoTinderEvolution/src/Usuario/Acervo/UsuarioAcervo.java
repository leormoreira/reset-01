package Usuario.Acervo;

import Usuario.Dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAcervo {
    private static int contador = 1;
    private static final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar (Usuario usuario) {
        usuario.setId(contador ++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar () {
        return usuarios;
    }

    public Usuario pesquisar (int id) {
        for (Usuario usuario: usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public boolean deletar (int id) {
        Usuario usuarioParaDeletar = pesquisar(id);
        if (usuarioParaDeletar != null) {
            return usuarios.remove(usuarioParaDeletar);
        }
        return false;
    }

    public Usuario editar (Usuario usuarioParaEditar, Usuario usuarioAtualizado) {
        usuarioParaEditar.setNome(usuarioAtualizado.getNome());
        usuarioParaEditar.setEmail(usuarioAtualizado.getEmail());
        usuarioParaEditar.setTelefone(usuarioAtualizado.getTelefone());
        usuarioParaEditar.setDataNascimento(usuarioAtualizado.getdataNascimento());
        usuarioParaEditar.setBio(usuarioAtualizado.getBio());
        usuarioParaEditar.setLocalizacao(usuarioAtualizado.getLocalização());

        return usuarioParaEditar;
    }

}
