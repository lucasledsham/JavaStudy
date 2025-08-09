//Calculadora Simples

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o numero operacao deseja fazer [1 - Adicao | 2 - Subtracao | 3 - Multiplicacao | 4 - Divisao]: ");
        int operacao = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0.00;

        boolean adicao = operacao == 1;
        boolean subtracao = operacao == 2;
        boolean multiplicacao = operacao == 3;
        boolean divisao = operacao == 4;

        if (adicao) {
            resultado = numero1 + numero2;
        } else if (subtracao) {
            resultado = numero1 - numero2;
        } else if (multiplicacao) {
            resultado = numero1 * numero2;
        } else if (divisao) {
            resultado = numero1 / numero2;
        }

        System.out.println("\n");
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
