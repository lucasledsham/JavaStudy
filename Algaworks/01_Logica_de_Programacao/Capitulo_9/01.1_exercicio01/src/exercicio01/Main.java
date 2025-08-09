package exercicio01;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Couve";
        produto.quantidadeEstoque = 15;

        if (verificaEstoque(produto)){
            System.out.println("Necessario repor estoque");
        } else {
            System.out.println("Nao repor estoque");
        }
    }

    static boolean verificaEstoque(Produto produto) {
        return produto.quantidadeEstoque < 10;
    }
}
