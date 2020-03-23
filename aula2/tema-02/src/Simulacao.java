import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Simulacao {
    public static void main(String[] args) {
        Arma espadaLonga = new Arma ("Espada Longa", 30);
        Arma machadoGuerra = new Arma("Machado de Guerra", 12);
        Arma bestaChinesa = new Arma ("Besta Chinesa", 22);
        Arma adagaTripla = new Arma ("Adaga Tripla", 18);
        Arma estrelaDaManhã = new Arma ("Estrela da Manhã", 15);
        Arma lancaCurta = new Arma ("Lança Curta", 16);

        Magia misselMagico = new Magia("Míssel Mágico", 10, 3);
        Magia raioCongelante = new Magia("Raio Congelante", 15, 7);
        Magia bolaFogo = new Magia("Bola de Fogo", 15, 6);
        Magia terrenoGelido = new Magia ("Terreno Gélido", 12, 5);
        Magia sono = new Magia("Sono", 8, 2);
        Magia explosaoDeFogo = new Magia("Explosão de Fogo", 22, 9);


        PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 6, 1);
        PoderDivino relampagos = new PoderDivino("Relâmpagos", 25, 5);
        PoderDivino laminaFlamejante = new PoderDivino("Lâmina Flamejante", 30, 3);
        PoderDivino temorDivino = new PoderDivino("Temor Divino", 10, 2);
        PoderDivino rajadaCelestial = new PoderDivino("Rajada Celestial", 20, 6);
        PoderDivino confusaoMental = new PoderDivino("Confusão Mental", 5, 1);



        Scanner entrada = new Scanner(System.in);
        int opcao;
        System.out.println("Criando Personagem...");
        System.out.println("Digite:");
        System.out.println("1 = Guerreiro | 2 = Bárbaro | 3 = Clérigo | 4 = Druida | 5 = Feiticeiro | 6 = Mago");
        opcao = entrada.nextInt();


        switch (opcao) {
            case 1:
                Guerreiro.criarGuerreiro ();
                List<Guerreiro> listaGuerreiros = new ArrayList<>();
                listaGuerreiros.add(guerreiro1);
                for (int i = 0; i < listaGuerreiros.size(); i++) {
                    Guerreiro guerreiro1 = guerreiro1.get(i);
                }
                break;
            case 2:
                Barbaro.criarBarbaro ();
                break;
            case 3:
                Clerigo.criarClerigo();
                break;
            case 4:
                Druida.criarDruida();
                break;
            case 5:
                Feiticeiro.criarFeiticeiro();
                break;
            case 6:
                Mago.criarMago();
                break;
            default:
                System.out.println("Digite SOMENTE números entre 1 e 6");
                break;

        }



    }
}
