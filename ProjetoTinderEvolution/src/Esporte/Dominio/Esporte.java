package Esporte.Dominio;


import java.time.LocalDate;

public class Esporte {
    private int id;
    private String nome;


    public Esporte (String nome) { this.nome = nome; }

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


    @Override
    public String toString() {
        return "Esporte{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
