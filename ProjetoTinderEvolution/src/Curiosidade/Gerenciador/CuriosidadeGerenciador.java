package Curiosidade.Gerenciador;

import Curiosidade.Acervo.CuriosidadeAcervo;
import Curiosidade.Dominio.Curiosidade;

import java.time.LocalDate;
import java.util.List;

public class CuriosidadeGerenciador {

    private CuriosidadeAcervo acervo = new CuriosidadeAcervo();

    public Curiosidade salvar (Curiosidade curiosidade) {
        List<Curiosidade> curiosidades = acervo.listar();

        for (Curiosidade curiosidadeExistente: curiosidades) {
            if (curiosidade.getDescricao().equals(curiosidade.getDescricao())){
                return curiosidadeExistente;
            }
        }

        if (curiosidade.getDescricao().isEmpty() || curiosidade.getCategoria() == null) {
            System.out.println ("Campos obrigatórios não informados");
            return null;
        }

        return acervo.salvar(curiosidade);
    }

    public  Curiosidade editar (int id, Curiosidade curiosidadeAtualizada) {
        Curiosidade curiosidadeParaEditar = pesquisar (id);
        if (curiosidadeParaEditar == null) {
            return null;
        }
        else {
            return acervo.editar (curiosidadeParaEditar, curiosidadeAtualizada);
        }
    }

    public List <Curiosidade> listar () {
        return acervo.listar();
    }

    public Curiosidade pesquisar (int id) {
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
