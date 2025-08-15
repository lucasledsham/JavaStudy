public class PacienteAula {
  double peso;
  double altura;

  IndiceMassaCorporalAula calcularIndiceMassaCorporal() {
    IndiceMassaCorporalAula imc = new   IndiceMassaCorporalAula();
    imc.resultado = peso / (altura * altura);
    imc.peso = peso;
    imc.altura = altura;

    return imc;
  }
}
