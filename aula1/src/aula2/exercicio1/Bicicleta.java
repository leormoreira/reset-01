package aula2.exercicio1;

public class Bicicleta extends Veiculo {
    int numeroDeRodas;


    Bicicleta (String nome, int velocidadeMaxima, String terreno, int lotacaoMaxima, int numeroDeRodas) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
    }
}
