package exercicio3;

public class InfoAluno {
    String nome;
    double notaFinal;

    InfoAluno ( String nome, double notaFinal){
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    boolean estaAprovado () {
        return notaFinal >= 7.00;
    }


}
