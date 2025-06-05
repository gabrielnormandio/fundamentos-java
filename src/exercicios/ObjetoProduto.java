package exercicios;

public class ObjetoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("TV", 2500, 3);

        produto.exibirDados(produto);
        System.out.println(produto.calcularValorTotal());

    }
}
