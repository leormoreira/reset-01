package Esporte.Gerenciador;

import Esporte.Acervo.EsporteAcervo;
import Esporte.Dominio.Esporte;

import java.time.LocalDate;
import java.util.List;

public class EsporteGerenciador {

    private EsporteAcervo acervo = new EsporteAcervo();

    public Esporte salvar (Esporte esporte) {
        List<Esporte> esportes = acervo.listar();

        for (Esporte esporteExistente: esportes) {
            if (esporte.getNome().equals(esporteExistente.getNome())){
                return esporteExistente;
            }
        }

        if (esporte.getNome().isEmpty() ) {
            System.out.println ("Nome não informado");
            return null;
        }

        return acervo.salvar(esporte);
    }

    public  Esporte editar (int id, Esporte esporteAtualizado) {
        Esporte esporteParaEditar = pesquisar (id);
        if (esporteParaEditar == null) {
            return null;
        }
        else {
            return acervo.editar (esporteParaEditar, esporteAtualizado);
        }
    }

    public List <Esporte> listar () {
        return acervo.listar();
    }

    public Esporte pesquisar (int id) {
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
