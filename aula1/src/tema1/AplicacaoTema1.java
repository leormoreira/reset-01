package tema1;

public class AplicacaoTema1 {
    public static void main (String[] args) {

        // personagens
        Barbaro barbaro1 = new Barbaro ("Lucio", 300, 5, 10);
        Guerreiro guerreiro1 = new Guerreiro ("Imperador", 1000, 8, 4);
        Clerigo clerigo1 = new Clerigo ("Kaka", 500, 8, 5, 50);
        Druida druida1 = new Druida ("Cafu", 400, 5, 7, 70);
        Feiticeiro feiticeiro1 = new Feiticeiro ("Nazario", 190, 10, 2, 750);
        Mago mago1 = new Mago ("Bruxo", 140, 9, 2, 100);

        //armas
        Arma armaBarbaro = new Arma ("foice",20);
        Arma armaGuerreiro = new Arma ("espada",15);
        Magia magiaMago = new Magia ("abracadabra", 11, 24);
        Magia magiaFeiticeiro = new Magia ("feitico", 9, 30);
        PoderDivino poderDivinoClerigo = new PoderDivino ("oracao", 15, 20);
        PoderDivino poderDivinoDruida = new PoderDivino ("ritual", 9, 28);

        // ataques
        System.out.println("Início do Combate");

        System.out.println("Rodada Um");

        //barbaro ataca guereiro
        double barbarovsguerreiro = armaBarbaro.poderDeAtaque * barbaro1.ataque;
        guerreiro1.vida = guerreiro1.vida -= barbarovsguerreiro;
        System.out.println(barbaro1.nome + " atacou " + guerreiro1.nome +" com " + armaBarbaro.nome + " e causou " + barbarovsguerreiro + " de dano.");
        System.out.println(guerreiro1.nome + " ficou com vida igual a " +guerreiro1.vida);

        //guerreiro ataca clerigo
        double guerreirovsclerigo = armaGuerreiro.poderDeAtaque * guerreiro1.ataque;
        clerigo1.vida = clerigo1.vida -= guerreirovsclerigo;
        System.out.println(guerreiro1.nome + " atacou " + clerigo1.nome +" com " + armaGuerreiro.nome + " e causou " + guerreirovsclerigo + " de dano.");
        System.out.println(clerigo1.nome + " ficou com vida igual a " +clerigo1.vida);

        //clerigo ataca feiticeiro
        double clerigovsfeiticeiro = poderDivinoClerigo.intensidade * clerigo1.ataque;
        feiticeiro1.vida = feiticeiro1.vida -= clerigovsfeiticeiro;
        clerigo1.fe = clerigo1.fe - poderDivinoClerigo.custoDeFe;
        System.out.println(clerigo1.nome + " atacou " + feiticeiro1.nome +" com " + poderDivinoClerigo.nome + " e causou " + clerigovsfeiticeiro + " de dano.");
        System.out.println(feiticeiro1.nome + " ficou com vida igual a " +feiticeiro1.vida);
        System.out.println(clerigo1.nome + " reduziu sua fe para " + clerigo1.fe);

        //feiticeiro ataca druida
        double feiticeirovsdruida = magiaFeiticeiro.poder * feiticeiro1.ataque;
        druida1.vida = druida1.vida -= feiticeirovsdruida;
        feiticeiro1.mana = feiticeiro1.mana - magiaFeiticeiro.custoDeMagia;
        System.out.println(feiticeiro1.nome + " atacou " + druida1.nome +" com " + magiaFeiticeiro.nome + " e causou " + feiticeirovsdruida + " de dano.");
        System.out.println(druida1.nome + " ficou com vida igual a " +druida1.vida);
        System.out.println(feiticeiro1.nome + " reduziu sua mana para " + feiticeiro1.mana);

        //druida ataca mago
        double druidavsmago = poderDivinoDruida.intensidade * druida1.ataque;
        mago1.vida = mago1.vida -= druidavsmago;
        druida1.fe = druida1.fe - poderDivinoDruida.custoDeFe;
        System.out.println(druida1.nome + " atacou " + mago1.nome +" com " + poderDivinoDruida.nome + " e causou " + druidavsmago + " de dano.");
        System.out.println(mago1.nome + " ficou com vida igual a " + mago1.vida);
        System.out.println(druida1.nome + " reduziu sua fe para " + druida1.fe);

        //mago ataca barbaro
        double magovsbarbaro = magiaMago.poder * mago1.ataque;
        barbaro1.vida = barbaro1.vida -= magovsbarbaro;
        mago1.mana = mago1.mana - magiaMago.custoDeMagia;
        System.out.println(mago1.nome + " atacou " + barbaro1.nome +" com " + magiaMago.nome + " e causou " + magovsbarbaro + " de dano.");
        System.out.println(barbaro1.nome + " ficou com vida igual a " +barbaro1.vida);
        System.out.println(mago1.nome + " reduziu sua mana para " + mago1.mana);

        System.out.println("---");

        System.out.println("Rodada Dois");

        //mago ataca druida
        double magovsdruida = magiaMago.poder * mago1.ataque;
        druida1.vida = druida1.vida -= magovsdruida;
        mago1.mana = mago1.mana - magiaMago.custoDeMagia;
        System.out.println(mago1.nome + " atacou " + druida1.nome +" com " + magiaMago.nome + " e causou " + magovsbarbaro + " de dano.");
        System.out.println(druida1.nome + " ficou com vida igual a " + druida1.vida);
        System.out.println(mago1.nome + " reduziu sua mana para " + mago1.mana);

        //druida ataca feiticeiro
        double druidavsfeiticeiro = poderDivinoDruida.intensidade * druida1.ataque;
        feiticeiro1.vida = feiticeiro1.vida -= druidavsfeiticeiro;
        druida1.fe = druida1.fe - poderDivinoDruida.custoDeFe;
        System.out.println(druida1.nome + " atacou " + feiticeiro1.nome +" com " + poderDivinoDruida.nome + " e causou " + druidavsfeiticeiro + " de dano.");
        System.out.println(feiticeiro1.nome + " ficou com vida igual a " + feiticeiro1.vida);
        System.out.println(druida1.nome + " reduziu sua fe para " + druida1.fe);

        //feiticeiro ataca clerigo
        double feiticeirovsclerigo = magiaFeiticeiro.poder * feiticeiro1.ataque;
        clerigo1.vida = clerigo1.vida -= feiticeirovsclerigo;
        feiticeiro1.mana = feiticeiro1.mana - magiaFeiticeiro.custoDeMagia;
        System.out.println(feiticeiro1.nome + " atacou " + clerigo1.nome +" com " + magiaFeiticeiro.nome + " e causou " + feiticeirovsclerigo + " de dano.");
        System.out.println(clerigo1.nome + " ficou com vida igual a " +clerigo1.vida);
        System.out.println(feiticeiro1.nome + " reduziu sua mana para " + feiticeiro1.mana);

        //clerigo ataca guerreiro
        double clerigovsguerreiro = poderDivinoClerigo.intensidade * clerigo1.ataque;
        guerreiro1.vida = guerreiro1.vida -= clerigovsguerreiro;
        clerigo1.fe = clerigo1.fe - poderDivinoClerigo.custoDeFe;
        System.out.println(clerigo1.nome + " atacou " + guerreiro1.nome +" com " + poderDivinoClerigo.nome + " e causou " + clerigovsguerreiro + " de dano.");
        System.out.println(guerreiro1.nome + " ficou com vida igual a " +guerreiro1.vida);
        System.out.println(clerigo1.nome + " reduziu sua fe para " + clerigo1.fe);

        // guerreiro ataca barbaro
        double guerreirovsbarbaro = armaGuerreiro.poderDeAtaque * guerreiro1.ataque;
        barbaro1.vida = barbaro1.vida -= guerreirovsbarbaro;
        System.out.println(guerreiro1.nome + " atacou " + barbaro1.nome +" com " + armaGuerreiro.nome + " e causou " + guerreirovsbarbaro + " de dano.");
        System.out.println(barbaro1.nome + " ficou com vida igual a " +barbaro1.vida);

        //barbaro ataca mago
        double barbarovsmago = armaBarbaro.poderDeAtaque * barbaro1.ataque;
        mago1.vida = mago1.vida -= barbarovsmago;
        System.out.println(barbaro1.nome + " atacou " + mago1.nome +" com " + armaBarbaro.nome + " e causou " + barbarovsmago + " de dano.");
        System.out.println(mago1.nome + " ficou com vida igual a " + mago1.vida);
        System.out.println(mago1.nome + " morreu ");

        System.out.println("---");

        //placar
        System.out.println("Placar Final");

        System.out.println( barbaro1.nome + " finalizou a partida com " + barbaro1.vida + " de vida." );
        System.out.println( guerreiro1.nome + " finalizou a partida com " + guerreiro1.vida + " de vida." );
        System.out.println( clerigo1.nome + " finalizou a partida com " + clerigo1.vida + " de vida e com " + clerigo1.fe + " de fe." );
        System.out.println( druida1.nome + " finalizou a partida com " + druida1.vida + " de vida e com " + druida1.fe + " de fe." );
        System.out.println( feiticeiro1.nome + " finalizou a partida com " + feiticeiro1.vida + " de vida e com " + feiticeiro1.mana + " de mana." );
        System.out.println( mago1.nome + " finalizou a partida com " + mago1.vida + " de vida e com " + mago1.mana + " de mana." );

        System.out.println("The End");



    }


}
