import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a meta de faturamento anual: ");
        double metaFaturamento = scanner.nextDouble();

        System.out.println("Digite o faturamento anual: ");
        double faturamentoAnual = scanner.nextDouble();

        System.out.println("Digite a media salarial do funcionario: ");
        double mediaSalarial = scanner.nextDouble();

        boolean ganharBonus = faturamentoAnual >= metaFaturamento;
        boolean bonusOitentaPorcento = faturamentoAnual >= (metaFaturamento * 0.8) && faturamentoAnual < metaFaturamento;

        double valorPremio;

        if (ganharBonus) {
            valorPremio = mediaSalarial;
            System.out.printf("O bonus do funcionario e de %.2f", valorPremio);
        } else if (bonusOitentaPorcento) {
            valorPremio = mediaSalarial * 0.8;
            System.out.printf("O bonus do funcionario e de %.2f", valorPremio);
        } else {
            System.out.println("O funcionario nao recebeu nenhum bonus");
        }

        scanner.close();
    }
}
