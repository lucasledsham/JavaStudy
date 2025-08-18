public class CalculadoraIMCAula {
  double peso;
  double altura;

  IndiceMassaCorporalAula calcular() {
    IndiceMassaCorporalAula imc = new   IndiceMassaCorporalAula();
    imc.resultado = peso / (altura * altura);
    imc.peso = peso;
    imc.altura = altura;

    return imc;
  }
}
