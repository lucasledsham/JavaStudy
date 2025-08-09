import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        int valorFrete = 15;

        boolean descontoFrete = valorProduto > 100;

        if (descontoFrete) {
            valorFrete = 0;
            System.out.println("Parabéns! Você ganhou frete grátis para a sua entrega.");
        }

        double valorFinal = valorProduto + valorFrete;

        System.out.printf("O valor final da sua compra é de R$%.2f", valorFinal);

        scanner.close();
    }
}
