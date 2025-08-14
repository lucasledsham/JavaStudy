public class Principal {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.modelo = "HRV";
    carro.anoFabricacao = 1983;
    carro.precoCompra = 120000;

    carro.proprietario = new Pessoa();
    carro.proprietario.nome = "Lucas";

    carro.imprimirResumoDepreciacao();
    System.out.printf("\nValor do IPVA do carro de %s: R$%.2f", carro.proprietario.nome, carro.calcularIPVA()); 
  }
}