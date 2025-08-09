import java.util.Scanner;

public class calularValorTroco {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //Leitura

    System.out.print("Digite o valor do Produto: ");
    double valorProduto = scanner.nextDouble(); // Valor para Double

    System.out.print("Digite o valor pago: ");
    double valorPago = scanner.nextDouble(); // Valor para Double

    double resultado = valorProduto - valorPago;

    System.out.println("O valor do troce e: " + resultado);
    
    scanner.close();
  }

}