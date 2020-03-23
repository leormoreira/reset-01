import java.util.Scanner;

public class Mago extends Arcano {
    public Mago(String nome, double vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }
    public static Mago criarMago() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de mago");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        System.out.print("Mana: ");
        int mana = scanner.nextInt();

        System.out.println("Mago criado.");
        Mago mago1 = new Mago(nome, vida, ataque, defesa, mana);
        System.out.print( "Nome: " + mago1.nome);
        System.out.print( " | Vida: " + mago1.vida);
        System.out.print( " | Ataque: " + mago1.ataque);
        System.out.print( " | Defesa: " + mago1.defesa);
        System.out.println( " | Mana: " + mago1.mana);

        return mago1;
    }
}
