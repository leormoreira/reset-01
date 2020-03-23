import java.util.Scanner;

public class Barbaro extends HomemDeArmas {
    public Barbaro(String nome, double vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
    }
    public static Barbaro criarBarbaro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de bárbaro");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        System.out.println("Bárbaro criado");
        Barbaro barbaro1 = new Barbaro(nome, vida, ataque, defesa);
        System.out.print( "Nome: " + barbaro1.nome);
        System.out.print( " | Vida: " + barbaro1.vida);
        System.out.print( " | Ataque: " + barbaro1.ataque);
        System.out.println( " | Defesa: " + barbaro1.defesa);

        return barbaro1;
    }
}
