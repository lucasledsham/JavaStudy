public class TesteInicializacao {
  public static void main(String[] args) {
    Carro2 carroTeste = new Carro2();

    carroTeste.fabricante = "Honda";
    carroTeste.anoFabricacao = 2021;
    carroTeste.proprietario.nome = "Joao Sorrisao";

    System.out.println(carroTeste.fabricante);
    System.out.println(carroTeste.modelo);
    System.out.println(carroTeste.anoFabricacao);
    System.out.println(carroTeste.proprietario.nome); // Joao Sorrisao

    // Alterando proprietario
    carroTeste.proprietario = new Pessoa();
    System.out.println(carroTeste.proprietario.nome); // null
  }
}
