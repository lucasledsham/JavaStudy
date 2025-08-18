public class AppAula {
  public static void main(String[] args) {
    CalculadoraIMCAula calculadoraIMC = new CalculadoraIMCAula();
    calculadoraIMC.altura = 1.82;
    calculadoraIMC.peso = 75;

    IndiceMassaCorporalAula imc = calculadoraIMC.calcular();

    if (imc.estahComObesidade()) {
      System.out.println("Paciente esta com obesidade");
    } 

    System.out.printf("IMC: %.2f", imc.resultado);
  }
}
