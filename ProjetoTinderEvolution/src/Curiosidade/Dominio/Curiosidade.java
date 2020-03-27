package Curiosidade.Dominio;

import Curiosidade.Dominio.Curiosidade;

import java.time.LocalDate;

public class Curiosidade {
    private int id;
    private String descricao;
    private CuriosidadeCategoria categoria;

    public Curiosidade(String descricao, CuriosidadeCategoria categoria) {
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public CuriosidadeCategoria getCategoria () {
        return categoria;
    }

    public void setCategoria (final CuriosidadeCategoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Curiosidade{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
