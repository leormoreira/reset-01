package aula1;

public class Aplicacao {

    public static void main (String [] args) {
        Comparador comparadorDeValores = new Comparador();
        boolean primeiroMenor = comparadorDeValores.menorQue(1,10);
        System.out.println("resultado " + primeiroMenor);
    }
}
