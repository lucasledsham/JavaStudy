public class Principal {
  public static void main(String[] args) {
    Produto produto1 = new Produto();
    Produto produto2 = new Produto();

    produto1.custoEmbalagem = 5.00;
    produto2.custoEmbalagem = 10.60;
    // O custo da embalagem do produto1 tambem sera 10.60
    // Pelo uso do modificador static no atributo

    // Jeito correto de alterar atrivuto com static
    // Chamando a Classe e nao um objeto
    Produto.custoEmbalagem = 7.75;

    produto1.imprimirCustoEmbalagem();
    produto2.imprimirCustoEmbalagem();
    
  }
}
