package Serie.Gerenciador;

import Serie.Acervo.SerieAcervo;
import Serie.Dominio.Serie;

import java.time.LocalDate;
import java.util.List;

public class SerieGerenciador {

    private SerieAcervo acervo = new SerieAcervo();

    public Serie salvar (Serie serie) {
        List<Serie> series = acervo.listar();

        for (Serie serieExistente: series) {
            if (serie.getNome().equals(serieExistente.getNome())){
                return serieExistente;
            }
        }

        if (serie.getNome().isEmpty() || serie.getDiretor().isEmpty() || serie.getCategoria() == null || serie.getDataLancamento() == null || serie.getTemporadas() < 0 ||  serie.getEpisodios() < 0 ||  serie.getSinopse().isEmpty()) {
            System.out.println ("Campos obrigatórios não informados corretamente");
            return null;
        }

        if (serie.getDataLancamento().isAfter(LocalDate.now())){
            return null;
        }

        return acervo.salvar(serie);
    }

    public  Serie editar (int id, Serie serieAtualizada) {
        Serie serieParaEditar = pesquisar (id);
        if (serieParaEditar == null) {
            return null;
        }
        else {
            return acervo.editar (serieParaEditar, serieAtualizada);
        }
    }

    public List <Serie> listar () {
        return acervo.listar();
    }

    public Serie pesquisar (int id) {
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
