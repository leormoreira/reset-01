import java.util.Scanner;

public class Clerigo extends Sacerdote {
    public Clerigo(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa, fe);
    }
    public static Clerigo criarClerigo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de clérigo");
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

        System.out.println("Clérigo criado");
        Clerigo clerigo1 = new Clerigo(nome, vida, ataque, defesa, fe);
        System.out.print( "Nome: " + clerigo1.nome);
        System.out.print( " | Vida: " + clerigo1.vida);
        System.out.print( " | Ataque: " + clerigo1.ataque);
        System.out.print( " | Defesa: " + clerigo1.defesa);
        System.out.println( " | Fé: " + clerigo1.fe);


        return clerigo1;
    }
}
