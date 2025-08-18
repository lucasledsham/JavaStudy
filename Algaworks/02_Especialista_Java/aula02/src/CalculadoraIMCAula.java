public class CalculadoraIMCAula {

  IndiceMassaCorporalAula calcular(double peso, double altura) {
    IndiceMassaCorporalAula imc = new   IndiceMassaCorporalAula();
    imc.resultado = peso / (altura * altura);
    imc.peso = peso;
    imc.altura = altura;

    return imc;
  }
}
