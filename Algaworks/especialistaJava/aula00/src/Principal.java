public class Principal {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.id = 1;
    carro.modelo = "Palio";
    carro.fabricante = "Fiat";
    carro.cor = "Preto";
    carro.anoFabricacao = 2005;

    System.out.printf("Carro ID: %d\nFabricante: %s\nModelo: %s\nCor: %s\nAno de fabricacao: %d", carro.id, carro.fabricante, carro.modelo, carro.cor,carro.anoFabricacao);

    Carro carro2 = new Carro();
    carro2.id = 2;
    carro2.modelo = "CRV";
    carro2.fabricante = "Honda";
    carro2.cor = "Branco";
    carro2.anoFabricacao = 2013;

    System.out.println("\n");
    System.out.printf("Carro2 ID: %d\nFabricante: %s\nModelo: %s\nCor: %s\nAno de fabricacao: %d", carro2.id, carro2.fabricante, carro2.modelo, carro2.cor,carro2.anoFabricacao);
  }
}
