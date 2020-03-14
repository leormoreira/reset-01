package aula2.exercicio1;

public class Carro extends Veiculo {
    String combustivel;
    int numeroDeRodas;


    Carro (String nome, int velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int numeroDeRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
        this.numeroDeRodas = numeroDeRodas;
    }
}
