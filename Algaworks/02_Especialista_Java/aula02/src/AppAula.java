public class AppAula {
  public static void main(String[] args) {
    PacienteAula paciente = new PacienteAula();
    paciente.altura = 1.82;
    paciente.peso = 75;

    IndiceMassaCorporalAula imc = paciente.calcularIndiceMassaCorporal();

    if (imc.resultado >= 30) {
      System.out.println("Paciente esta com obesidade");
    } 

    System.out.printf("IMC: %.2f", imc.resultado);
  }
}
