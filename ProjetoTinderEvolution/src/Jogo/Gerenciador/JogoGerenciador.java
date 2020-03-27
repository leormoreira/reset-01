package Jogo.Gerenciador;

import Jogo.Acervo.JogoAcervo;
import Jogo.Dominio.Jogo;

import java.time.LocalDate;
import java.util.List;

public class JogoGerenciador {

    private JogoAcervo acervo = new JogoAcervo();

    public Jogo salvar (Jogo jogo) {
        List<Jogo> jogos = acervo.listar();

        for (Jogo jogoExistente: jogos) {
            if (jogo.getNome().equals(jogoExistente.getNome())){
                return jogoExistente;
            }
        }

        if (jogo.getNome().isEmpty() || jogo.getCategoria() == null || jogo.getPlataforma() == null || jogo.getDataLancamento() == null) {
            System.out.println ("Campos obrigatórios não informados");
            return null;
        }

        if (jogo.getDataLancamento().isAfter(LocalDate.now())){
            return null;
        }

        return acervo.salvar(jogo);
    }

    public  Jogo editar (int id, Jogo jogoAtualizado) {
        Jogo jogoParaEditar = pesquisar (id);
        if (jogoParaEditar == null) {
            return null;
        }
        else {
            return acervo.editar (jogoParaEditar, jogoAtualizado);
        }
    }

    public List <Jogo> listar () {
        return acervo.listar();
    }

    public Jogo pesquisar (int id) {
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
