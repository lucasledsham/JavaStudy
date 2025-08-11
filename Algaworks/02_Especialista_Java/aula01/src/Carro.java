public class Carro {

  int id;
  String fabricante;
  String modelo;
  String cor;
  int anoFabricacao;
  Pessoa proprietario; // Composicao "tem um". Carro tem um proprietario

  void calcularValorRevenda() {
    System.out.printf("Calcular valor de revenda de: %s %d\n", modelo, anoFabricacao);
  }
}
