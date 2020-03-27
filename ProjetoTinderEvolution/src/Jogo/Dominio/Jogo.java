package Jogo.Dominio;

import Jogo.Dominio.JogoCategoria;

import Jogo.Dominio.JogoPlataforma;

import java.time.LocalDate;

public class Jogo {
    private int id;
    private String nome;
    private String publisher;
    private JogoCategoria categoria;
    private JogoPlataforma plataforma;
    private LocalDate dataLancamento;

    public Jogo (String nome, String publisher, JogoCategoria categoria, JogoPlataforma plataforma, LocalDate dataLancamento) {
        this.nome = nome;
        this.publisher = publisher;
        this.categoria = categoria;
        this.plataforma = plataforma;
        this.dataLancamento = dataLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPublisher () {
        return publisher;
    }

    public void setPublisher (String publisher) {
        this.publisher = publisher;
    }

    public JogoCategoria getCategoria () {
        return categoria;
    }

    public void setCategoria (final JogoCategoria categoria) {
        this.categoria = categoria;
    }

    public JogoPlataforma getPlataforma () {
        return plataforma;
    }

    public void setPlataforma (final JogoPlataforma plataforma) {
        this.plataforma = plataforma;
    }

    public LocalDate getDataLancamento () {
        return dataLancamento;
    }

    public void setDataLancamento (LocalDate dataLancamento){
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", publisher='" + publisher + '\'' +
                ", categoria=" + categoria +
                ", plataforma=" + plataforma +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}

