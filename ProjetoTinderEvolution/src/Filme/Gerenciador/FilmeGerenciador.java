package Filme.Gerenciador;

import Filme.Acervo.FilmeAcervo;
import Filme.Dominio.Filme;

import java.time.LocalDate;
import java.util.List;

public class FilmeGerenciador {

    private FilmeAcervo acervo = new FilmeAcervo();

    public Filme salvar (Filme filme) {
        List<Filme> filmes = acervo.listar();

        for (Filme filmeExistente: filmes) {
            if (filme.getNome().equals(filmeExistente.getNome())){
                return filmeExistente;
            }
        }

        if (filme.getNome().isEmpty() || filme.getDiretor().isEmpty() || filme.getCategoria() == null || filme.getDataLancamento() == null || filme.getSinopse().isEmpty()) {
            System.out.println ("Campos obrigatórios não informados");
            return null;
        }

        if (filme.getDataLancamento().isAfter(LocalDate.now())){
            return null;
        }

        return acervo.salvar(filme);
    }

    public  Filme editar (int id, Filme filmeAtualizado) {
        Filme filmeParaEditar = pesquisar (id);
        if (filmeParaEditar == null) {
            return null;
        }
        else {
            return acervo.editar (filmeParaEditar, filmeAtualizado);
        }
    }

    public List <Filme> listar () {
        return acervo.listar();
    }

    public Filme pesquisar (int id) {
        if (id > 0) {
            return acervo.pesquisar(id);
        }
        return null;
    }

    public boolean deletar (int id) {
        if (id > 0) {
            return acervo.deletar (id);
        }
        return false;
    }
}