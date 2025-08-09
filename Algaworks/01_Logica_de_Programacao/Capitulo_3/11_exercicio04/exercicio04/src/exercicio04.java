import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto desejado: ");
        double valorProduto = scanner.nextDouble();

        System.out.println("Digite a quantidade desejada do produto: ");
        int quantidadeDesejada = scanner.nextInt();

        double valorCompra = valorProduto * quantidadeDesejada;

        int desconto = 0;
        
        if (quantidadeDesejada > 10) {
            desconto = 10;
        }

        double valorDesconto = (valorCompra * desconto) / 100;


        double valorTotal = valorCompra - valorDesconto;

        System.out.println("\n");

        System.out.printf("Voce recebeu R$ %.2f de desconto!", valorDesconto);
        System.out.printf("O valor total da sua compra e de: R$ %.2f", valorTotal);

        scanner.close();
    }
}
