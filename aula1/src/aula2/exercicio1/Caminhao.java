package aula2.exercicio1;

public class Caminhao extends Veiculo {

    String combustivel;
    int numeroDeRodas;


    Caminhao (String nome, int velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int numeroDeRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
        this.numeroDeRodas = numeroDeRodas;
    }
}
