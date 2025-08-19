public class App {
    public static void main(String[] args) throws Exception {
        Produto novoProduto = new Produto();

        novoProduto.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preco de custo: R$%.2f\n", novoProduto.precoCusto);
        System.out.printf("Preco de venda: R$%.2f\n", novoProduto.precoVenda);
    }
}
