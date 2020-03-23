import java.util.Scanner;

public class Feiticeiro extends Arcano {
    public Feiticeiro(String nome, double vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }
    public static Feiticeiro criarFeiticeiro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de feiticeiro");
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

        System.out.println("Feiticeiro criado");
        Feiticeiro feiticeiro1 = new Feiticeiro(nome, vida, ataque, defesa, mana);
        System.out.print( "Nome: " + feiticeiro1.nome);
        System.out.print( " | Vida: " + feiticeiro1.vida);
        System.out.print( " | Ataque: " + feiticeiro1.ataque);
        System.out.print( " | Defesa: " + feiticeiro1.defesa);
        System.out.println( " | Mana: " + feiticeiro1.mana);

        return feiticeiro1;
    }
}
