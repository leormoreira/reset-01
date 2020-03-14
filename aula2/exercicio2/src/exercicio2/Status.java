package exercicio2;

public enum Status {
    DISPONÍVEL ("Disponível"),
    EM_USO ("Em uso"),
    EMPRESTADO ("Emprestado");

    String situacao;

    Status (String situacao) {
        this.situacao = situacao;
    }


}
