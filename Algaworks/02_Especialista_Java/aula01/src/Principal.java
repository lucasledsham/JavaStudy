public class Principal {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.modelo = "HRV";
    carro.anoFabricacao = 2015;

    carro.proprietario = new Pessoa();
    carro.proprietario.nome = "Lucas";
    System.out.printf("Carro de: %s\n", carro.proprietario.nome);
    carro.calcularValorRevenda();
  }
}