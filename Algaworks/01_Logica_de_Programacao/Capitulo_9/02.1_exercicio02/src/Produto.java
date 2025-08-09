public class Produto {
    String nome;
    int quantidadeEstoque;

    boolean reporEstoque() {
        return quantidadeEstoque < 10;
    }
}
