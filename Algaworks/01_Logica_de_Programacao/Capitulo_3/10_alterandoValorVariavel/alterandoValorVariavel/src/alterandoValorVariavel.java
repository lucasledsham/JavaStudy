import java.util.Scanner;

public class alterandoValorVariavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.println("Digite o tipo do pagamento: [1 = a Vista / 2 = a Prazo]");
        int tipoPagamento = scanner.nextInt();

        boolean pagamentoAVista = tipoPagamento == 1; // Se utilizar Integer no tipoPagamento, ficaria boolean pagamentoAVista = tipoPagamento.equal(1);

        double juros = 0.0;

        if (!pagamentoAVista) {    
            juros = 10.0;  
        }

        double acrescimo = (valorProduto * juros) / 100;

        double valorTotal = acrescimo + valorProduto;

        System.out.println("Valor Total: " + valorTotal);

        scanner.close();
    }
}
