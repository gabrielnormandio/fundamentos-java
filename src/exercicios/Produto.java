package exercicios;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDados(Produto produto) {
        System.out.println(
                "Nome: " + produto.nome +
                ", Preço: " + String.format("%.2f", produto.preco) +
                ", Quantidade: " + produto.quantidade);
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }
}
