package Filme.Dominio;

import java.time.LocalDate;

public class Filme {
        private int id;
        private String nome;
        private String diretor;
        private FilmeCategoria categoria;
        private LocalDate dataLancamento;
        private String sinopse;

        public Filme(String nome, String diretor, FilmeCategoria categoria, LocalDate dataLancamento, String sinopse) {
            this.id = id;
            this.nome = nome;
            this.diretor = diretor;
            this.categoria = categoria;
            this.dataLancamento = dataLancamento;
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

        public FilmeCategoria getCategoria () {
            return categoria;
        }

        public void setCategoria (final FilmeCategoria categoria) {
            this.categoria = categoria;
        }

        public LocalDate getDataLancamento () {
            return dataLancamento;
        }

        public void setDataLancamento (LocalDate dataLancamento){
            this.dataLancamento = dataLancamento;
        }

        public String getSinopse () {
            return sinopse;
        }

        public void setSinopse (String sinopse){
            this.sinopse = sinopse;
        }

        @Override
        public String toString() {
            return "Filme{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", diretor='" + diretor + '\'' +
                    ", categoria=" + categoria +
                    ", dataLancamento=" + dataLancamento +
                    ", sinopse='" + sinopse + '\'' +
                    '}';
        }
}

