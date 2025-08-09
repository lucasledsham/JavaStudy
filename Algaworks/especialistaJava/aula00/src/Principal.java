public class Principal {
  public static void main(String[] args) {

    Pessoa proprietarioCarro = new Pessoa();
    proprietarioCarro.nome = "Joao Marcelo";
    proprietarioCarro.cpf = "111.222.333-44";
    proprietarioCarro.anoNascimento = 1972;

    // CARRO 1
    Carro carro = new Carro();
    carro.id = 1;
    carro.modelo = "Palio";
    carro.fabricante = "Fiat";
    carro.cor = "Preto";
    carro.anoFabricacao = 2005;

    //Proprietario Carro 1 - PRIMEIRA FORMA DE CRIAR
    carro.proprietario = new Pessoa();
    carro.proprietario.nome = "Marcos Augusto";
    carro.proprietario.cpf = "111.222.333-44";
    carro.proprietario.anoNascimento = 1972;

    System.out.printf("Carro ID: %d\nFabricante: %s\nModelo: %s\nCor: %s\nAno de fabricacao: %d", carro.id, carro.fabricante, carro.modelo, carro.cor,carro.anoFabricacao);
    System.out.printf("\nProprietario: %s", carro.proprietario.nome);


    // CARRO 2
    Carro carro2 = new Carro();
    carro2.id = 2;
    carro2.modelo = "CRV";
    carro2.fabricante = "Honda";
    carro2.cor = "Branco";
    carro2.anoFabricacao = 2013;

    //Proprietario Carro 2 - SEGUNDA FORMA DE CRIAR
    carro2.proprietario = proprietarioCarro;

    System.out.println("\n");
    System.out.printf("Carro2 ID: %d\nFabricante: %s\nModelo: %s\nCor: %s\nAno de fabricacao: %d", carro2.id, carro2.fabricante, carro2.modelo, carro2.cor,carro2.anoFabricacao);
    System.out.printf("\nProprietario Carro 2: %s", carro2.proprietario.nome);


    // OUTRO OBJETO

    Pessoa outraPessoa = new Pessoa();
    outraPessoa.nome = "Lucas";
    outraPessoa.cpf = "111.111.111-11";
    outraPessoa.anoNascimento = 1999;

    Carro carro3 = new Carro();
    carro3.id = 3;
    carro3.fabricante = "BMW";
    carro3.modelo = "V6";
    carro3.cor = "Branco";
    carro3.anoFabricacao = 2015;
    carro3.proprietario = outraPessoa;

    System.out.println("");
    System.out.printf("\nCarro 3: Proprietario: %s", carro3.proprietario.nome);

  }
}
