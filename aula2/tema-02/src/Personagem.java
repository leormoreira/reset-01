public class Personagem {
    String nome;
    double vida;
    double ataque;
    double  defesa;

    public Personagem(final String nome, double vida, final double ataque, final double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    boolean isVivo () {
        return this.vida > 0;
    }

    double calcularDano (double defesa, double  poder) {
        if (isVivo()) {
            return ataque * poder - defesa;
        } else {
            return 0;
              }
    }


}
