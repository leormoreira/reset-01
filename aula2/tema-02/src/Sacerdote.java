abstract class Sacerdote extends Personagem {
    int fe;

    Sacerdote(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }
    void imprimirEstado () {
        System.out.println("Nome: " + this.nome + "| Vida: " + this.vida + "| Fé " + this.fe);
    }

    void atacar (Personagem alvo, PoderDivino poderDivino ) {
        if (fe > 0) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
            if (alvo.vida <=0){
                System.out.println(alvo.nome + " morreu.");
            }
        } else {
            if (fe <=0) {
                System.out.println(this.nome + " está com fé insuficiente e não pode realizar um ataque.");
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
