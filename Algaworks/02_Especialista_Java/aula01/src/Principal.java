public class Principal {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.modelo = "HRV";
    carro.anoFabricacao = 2018;
    carro.precoCompra = 120000;

    carro.proprietario = new Pessoa();
    carro.proprietario.nome = "Lucas";
    System.out.printf("Valo de Revenda do carro de %s: %.2f", carro.proprietario.nome, carro.calcularValorRevenda());
  }
}