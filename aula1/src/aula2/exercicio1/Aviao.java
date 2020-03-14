package aula2.exercicio1;

public class Aviao extends Veiculo {
    String combustivel;
    int altitudeMaxima;


    Aviao (String nome, int velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int altitudeMaxima) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
        this.altitudeMaxima = altitudeMaxima;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "combustivel='" + combustivel + '\'' +
                ", altitudeMaxima=" + altitudeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
