package aula2.exercicio1;

public class Submarino extends VeiculoAquatico {
    int profundidade;


    Submarino (String nome, int velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int profundidade) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, combustivel);
        this.profundidade = profundidade;
    }
}
