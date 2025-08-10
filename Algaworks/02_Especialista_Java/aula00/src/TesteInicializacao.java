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

    // Variaveis referenciam objetos
    // Nao sao o objeto em si
    // TESTES
    System.out.println("\n");
    System.out.println("=".repeat(95));
    Pessoa pessoaTeste = new Pessoa();
    pessoaTeste.nome = "Marcos";
    pessoaTeste.anoNascimento = 2000;
    pessoaTeste.cpf = "123";

    Carro carroParaTestar = new Carro();
    carroParaTestar.proprietario = pessoaTeste;

    System.out.printf("Proprietario Nome: %s\nProprietario Ano Nascimento: %d\nProprietario CPF: %s", carroParaTestar.proprietario.nome, carroParaTestar.proprietario.anoNascimento, carroParaTestar.proprietario.cpf);

    // O nome do proprietario do carro ira mudar para Julio
    carroParaTestar.proprietario.nome = "Julio";
    System.out.printf("\nProprietario Nome: %s\nProprietario Ano Nascimento: %d\nProprietario CPF: %s", carroParaTestar.proprietario.nome, carroParaTestar.proprietario.anoNascimento, carroParaTestar.proprietario.cpf);
    System.out.println("\n");
    System.out.printf("Nome objeto Pessoa: %s", pessoaTeste.nome);
    System.out.printf("\nNome Proprietario Carro alterado (OBJETO UNICO!): %s", carroParaTestar.proprietario.nome);
  }
}
