public class AppAula {
  public static void main(String[] args) {
    CalculadoraIMCAula calculadoraIMC = new CalculadoraIMCAula();

    double peso = 175;
    double altura = 1.82;

    IndiceMassaCorporalAula imc = calculadoraIMC.calcular(peso, altura);

    if (imc.estahComObesidade()) {
      System.out.println("Paciente esta com obesidade");
    } 

    System.out.printf("IMC: %.2f", imc.resultado);
  }
}
