public class Produto {

  //static vai deixar o atributo com o mesmo valor para todos os objetos da Classe
  static double custoEmbalagem; // DA CLASSE, MESMO VALOR PARA TODOS OBJETOS
  double precoCusto;
  double precoVenda;

  void alterarPrecoCusto(double precoCusto) {
    this.precoCusto = precoCusto;
  }

  void imprimirCustoEmbalagem() {
    System.out.printf("Custo com embalagem: %.2f\n", custoEmbalagem);
  }
}
