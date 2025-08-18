public class App {
    public static void main(String[] args) throws Exception {
        double precoCompraFornecedor = 140.50;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        double precoVenda = servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);

        System.out.printf("Preco: R$%.2f\n", precoVenda);
    }
}
