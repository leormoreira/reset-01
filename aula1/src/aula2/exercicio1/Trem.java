package aula2.exercicio1;

public class Trem extends Veiculo {

    String combustivel;


    Trem (String nome, int velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
    }
}
