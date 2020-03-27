package Usuario.Dominio;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String bio;
    private Localizacao localizacao;
    double idadeAtual;

    public Usuario(String nome, String email, String telefone, LocalDate dataNascimento, String bio, Localizacao localizacao) {

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.bio = bio;
        this.localizacao = localizacao;
    }

    public int getId () {
        return  id;
    }
    public void setId(final int id) {
        this.id = id;
    }

    public String getNome () {
        return nome;
    }
    public void setNome (final String nome) {
        this.nome = nome;
    }

    public String getEmail () {
        return email;
    }
    public void setEmail(final String email) {
        this.email = email;
    }

    public String getTelefone () {
        return telefone;
    }
    public void setTelefone(final String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getdataNascimento () {
        return dataNascimento;
    }
    public void setDataNascimento(final LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBio () {
        return bio;
    }
    public void setBio(final String bio) {
        this.bio = bio;
    }

    public Localizacao getLocalização () { return localizacao; }
    public void setLocalizacao(final Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public double getidadeAtual (LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = getdataNascimento();

        Period p = Period.between(nascimento, hoje);
        idadeAtual = p.getYears();

        return idadeAtual;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", bio='" + bio + '\'' +
                ", localizacao=" + localizacao +
                '}';
    }
}
