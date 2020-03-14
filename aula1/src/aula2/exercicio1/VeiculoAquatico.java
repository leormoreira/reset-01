package aula2.exercicio1;

public class VeiculoAquatico extends Veiculo {
    String combustivel;



    VeiculoAquatico(String nome, int velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
    }

}
