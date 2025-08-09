import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da conta de luz: ");
        double valorConta = scanner.nextDouble();

        System.out.print("Digite o valor da conta de água: ");
        valorConta += scanner.nextDouble();

        System.out.print("Digite o valor da conta de telefone: ");
        valorConta += scanner.nextDouble();

        System.out.print("Digite o valor da escola do filho: ");
        valorConta += scanner.nextDouble();

        System.out.print("Digite o valor da fatura do cartão: ");
        valorConta += scanner.nextDouble();

        System.out.print("Digite o valor dos gastos com supermercado: ");
        valorConta += scanner.nextDouble();

        System.out.printf("O valor total gasto pela família é de R$%.2f", valorConta);

        scanner.close();
    }
}
