package exercicio3;

public class ResultadoFinal {
    public static void main(String[] args) {
        InfoAluno aluno1 = new InfoAluno("Leonardo", 6.5);
        System.out.println(aluno1.nome);
        System.out.println(aluno1.notaFinal);

        boolean aprovado = aluno1.estaAprovado();
        System.out.println("aluno aprovado " + aprovado);

        InfoAluno aluno2 = new InfoAluno("Rafaela", 9.5);
        System.out.println(aluno2.nome);
        System.out.println(aluno2.notaFinal);

        boolean aprovado2 = aluno2.estaAprovado();
        System.out.println("aluno aprovado " + aprovado2);

        InfoAluno aluno3 = new InfoAluno("Miguel", 7.0);
        System.out.println(aluno3.nome);
        System.out.println(aluno3.notaFinal);

        boolean aprovado3 = aluno3.estaAprovado();
        System.out.println("aluno aprovado " + aprovado3);
    }
}
