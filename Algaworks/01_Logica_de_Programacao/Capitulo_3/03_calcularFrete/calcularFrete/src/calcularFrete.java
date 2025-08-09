import java.util.Scanner;

public class calcularFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.println("\n");

        System.out.println("Valor do produto: " + valorProduto);

        Double valorProdutoComFrete = valorProduto + 2;
        System.out.printf("O preço total com frete é: %.2f", valorProdutoComFrete);

        Double valorFrete = valorProdutoComFrete - valorProduto;
        System.out.printf("\nO valor do frete é: %.2f", valorFrete);
    
        scanner.close();
    }
}
