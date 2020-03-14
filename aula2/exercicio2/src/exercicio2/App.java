package exercicio2;

public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro ("Quincas Borba", "Machado de Assis", Categoria.ROMANCE, Status.EM_USO);
        Livro livro2 = new Livro ("Senhor dos Anéis", "J. Tolkien", Categoria.FANTASIA, Status.EMPRESTADO);
        Livro livro3 = new Livro ("A Sombra do Vento", "Carlos Zafón", Categoria.SUSPENSE, Status.DISPONÍVEL);
        Livro livro4 = new Livro ("O Exorcista", "William Blatty", Categoria.TERROR, Status.EMPRESTADO);

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
        System.out.println(livro4);
    }
}
