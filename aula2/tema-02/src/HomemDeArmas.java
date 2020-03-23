abstract class HomemDeArmas extends Personagem {
     HomemDeArmas (final String nome, final double vida, final double ataque, final double defesa) {
        super (nome, vida, ataque, defesa);
    }
    void imprimirEstado () {
        System.out.println("Nome: " + this.nome + "| Vida: " + this.vida);
    }
    void atacar (Personagem alvo, Arma arma ) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
        if (alvo.vida <=0){
            System.out.println(alvo.nome + " morreu.");
        }
    }

    void registrar (String nomeAlvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + dano + " de dano.");
    }
}
