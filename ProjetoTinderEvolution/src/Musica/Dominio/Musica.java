package Musica.Dominio;

import java.time.LocalDate;

public class Musica {
    private int id;
    private String nome;
    private String artista;
    private MusicaEstilo estiloMusical;
    private LocalDate dataLancamento;

    public Musica (String nome, String artista, LocalDate dataLancamento, MusicaEstilo estiloMusical) {
        this.nome = nome;
        this.artista = artista;
        this.estiloMusical = estiloMusical;
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

    public String getArtista () {
        return artista;
    }

    public void setArtista (String artista) {
        this.artista = artista;
    }

    public MusicaEstilo getEstiloMusical () {
        return estiloMusical;
    }

    public void setEstiloMusical (final MusicaEstilo estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public LocalDate getDataLancamento () {
        return dataLancamento;
    }

    public void setDataLancamento (LocalDate dataLancamento){
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", estiloMusical=" + estiloMusical +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
