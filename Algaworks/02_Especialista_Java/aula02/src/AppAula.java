public class AppAula {
  public static void main(String[] args) {
    CalculadoraIMCAula calculadoraIMC = new CalculadoraIMCAula();

    PacienteAula paciente = new PacienteAula();
    paciente.peso = 175;
    paciente.altura = 1.82;

    IndiceMassaCorporalAula imc = calculadoraIMC.calcular(paciente);

    if (imc.estahComObesidade()) {
      System.out.println("Paciente esta com obesidade");
    } 

    System.out.printf("IMC: %.2f", imc.resultado);
  }
}
