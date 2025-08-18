public class CalculadoraIMCAula {

  IndiceMassaCorporalAula calcular(PacienteAula paciente) {
    IndiceMassaCorporalAula imc = new   IndiceMassaCorporalAula();
    imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
    imc.peso = paciente.peso;
    imc.altura = paciente.altura;

    return imc;
  }
}
