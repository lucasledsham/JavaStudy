public class Paciente {
  String nome;
  double altura;
  double peso;

  public double calcularIMC() {
    return peso / (altura * altura);
  }
}
