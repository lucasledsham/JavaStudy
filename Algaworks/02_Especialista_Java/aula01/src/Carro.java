import java.time.LocalDate;

public class Carro {

  int id;
  String fabricante;
  String modelo;
  String cor;
  int anoFabricacao;
  double precoCompra;
  Pessoa proprietario; // Composicao "tem um". Carro tem um proprietario

  int calcularTempoDeUsoEmAnos() {
    int anoAtual = LocalDate.now().getYear();
    int tempoDeUsoEmAnos = anoAtual - anoFabricacao;
    return tempoDeUsoEmAnos; 
  }

  double calcularValorRevenda() {
    int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

    int vidaUtilEmAnos = 20;
    double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);
    if (valorRevenda < 0) {
      valorRevenda = 0;
    }
    
    return valorRevenda;
  }

  void imprimirResumoDepreciacao() {
    System.out.printf("Tempo de uso (anos): %d\n", calcularTempoDeUsoEmAnos());
    System.out.printf("Valo de Revenda do carro de %s: R$%.2f", proprietario.nome, calcularValorRevenda());
  }

  double calcularIPVA() {
    double ipva;
    int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
    
    if (tempoDeUsoEmAnos >= 10) {
      ipva = 0;
    } else {
      ipva = calcularValorRevenda() * 0.04;
    }

    return ipva;
  }
}
