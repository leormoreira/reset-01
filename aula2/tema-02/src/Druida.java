import java.util.Scanner;

public class Druida extends Sacerdote {
    public Druida(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa, fe);
    }
    public static Druida criarDruida() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de druida");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        System.out.print("Fé: ");
        int fe = scanner.nextInt();

        System.out.println("Druida Criado");
        Druida druida1 = new Druida(nome, vida, ataque, defesa, fe);
        System.out.print( "Nome: " + druida1.nome);
        System.out.print( " | Vida: " + druida1.vida);
        System.out.print( " | Ataque: " + druida1.ataque);
        System.out.print( " | Defesa: " + druida1.defesa);
        System.out.println( " | Fé: " + druida1.fe);

        return druida1;
    }
}
