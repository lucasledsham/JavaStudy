import java.time.LocalDate;

public class Carro {

  int id;
  String fabricante;
  String modelo;
  String cor;
  int anoFabricacao;
  double precoCompra;
  Pessoa proprietario; // Composicao "tem um". Carro tem um proprietario

  double calcularValorRevenda() {
    int anoAtual = LocalDate.now().getYear();
    int tempoDeUsoEmAnos = anoAtual - anoFabricacao;


    int vidaUtilEmAnos = 20;
    double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);
    if (valorRevenda < 0) {
      valorRevenda = 0;
    }
    
    return valorRevenda;
  }
}
