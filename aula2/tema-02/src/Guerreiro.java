import java.util.Scanner;

public class Guerreiro extends HomemDeArmas {
    public Guerreiro(String nome, double vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
    }

    public static Guerreiro criarGuerreiro() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Criação de guerreiro");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        System.out.println("Guerreiro criado");


        Guerreiro guerreiro1 = new Guerreiro(nome, vida, ataque, defesa);
        System.out.print( "Nome: " + guerreiro1.nome);
        System.out.print( " | Vida: " + guerreiro1.vida);
        System.out.print( " | Ataque: " + guerreiro1.ataque);
        System.out.println( " | Defesa: " + guerreiro1.defesa);

        return guerreiro1;
    }


}
