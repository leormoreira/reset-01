package Serie.Dominio;

import Serie.Dominio.SerieCategoria;

import java.time.LocalDate;

public class Serie {
    private int id;
    private String nome;
    private String diretor;
    private SerieCategoria categoria;
    private LocalDate dataLancamento;
    private int temporadas;
    private int episodios;
    private String sinopse;

    public Serie (String nome, String diretor, SerieCategoria categoria, LocalDate dataLancamento, int temporadas, int episodios, String sinopse) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.categoria = categoria;
        this.dataLancamento = dataLancamento;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor () {
        return diretor;
    }

    public void setDiretor (String diretor) {
        this.diretor = diretor;
    }

    public SerieCategoria getCategoria () {
        return categoria;
    }

    public void setCategoria (final SerieCategoria categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataLancamento () {
        return dataLancamento;
    }

    public void setDataLancamento (LocalDate dataLancamento){
        this.dataLancamento = dataLancamento;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(final int temporadas) { this.temporadas = temporadas; }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(final int episodios) { this.episodios = episodios; }

    public String getSinopse () {
        return sinopse;
    }

    public void setSinopse (String sinopse){
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", categoria=" + categoria +
                ", dataLancamento=" + dataLancamento +
                ", temporadas=" + temporadas +
                ", episodios=" + episodios +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}

