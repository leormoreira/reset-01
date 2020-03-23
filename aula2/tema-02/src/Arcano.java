abstract class Arcano extends Personagem {
    int mana;

    Arcano(String nome, double vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    void imprimirEstado () {
        System.out.println("Nome: " + this.nome + "| Vida: " + this.vida + "| Mana: " + this.mana);
    }

    void atacar (Personagem alvo, Magia magia ) {
        if (mana > 0 && vida > 0) {
            double dano = calcularDano(alvo.defesa, magia.poderAtaque);
            alvo.vida -= dano;
            this.mana -= magia.custoMana;
            registrar(alvo.nome, magia.nome, dano);
            if (alvo.vida <=0){
                System.out.println(alvo.nome + " morreu.");
            }
        } else {
            if (mana <=0) {
                System.out.println(this.nome + " está com mana insuficiente e não pode realizar um ataque.");
            }
            if (vida <= 0) {
                System.out.println(this.nome + " está morto e não pode realizar um ataque.");

            }
        }
    }
    void registrar (String nomeAlvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + dano + " de dano.");
    }
}
