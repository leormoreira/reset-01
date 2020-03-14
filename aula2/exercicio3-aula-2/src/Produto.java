public class Produto {
    private String nome;
    private double  valor;
    private int quantidade;
    private Segmento categoria;

    public Produto(String nome, double valor, int quantidade, Segmento categoria) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.categoria = categoria;

    }

    public String getNome (){
        return this.nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Segmento getCategoria() {
        return categoria;
    }
}
