public class IndiceMassaCorporalAula {

  double resultado;
  double peso;
  double altura;

  boolean estahComObesidade() {
    return resultado >= 30;
  }

  boolean estahAbaixoDoPesoIdel() {
    return resultado < 18.5;
  }
}
