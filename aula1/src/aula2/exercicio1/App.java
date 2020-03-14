package aula2.exercicio1;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        Aviao boeing = new Aviao ("Tecoteco", 1000, "Ar", 246, "Carvao", 1000);
        System.out.println(boeing);
        System.out.println(boeing.toString());

    }
}
