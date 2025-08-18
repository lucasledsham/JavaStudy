public class ServicoDePrecificacao {

  double calcularPrecoVenda(double precoCusto) {
    // adiciona 20% de margem de lucro
    double precoVenda = precoCusto * 1.20;
    return precoVenda;
  }
}
