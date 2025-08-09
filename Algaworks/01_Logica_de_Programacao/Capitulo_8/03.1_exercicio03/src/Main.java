import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static double numero1;
    static double numero2;
    static String[] operacoes = new String[] {"+", "-", "x", "%"};
    static int operacaoDesejada;
    static double resultado ;

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        numero1 = sc.nextDouble();
        System.out.print("Digite outro numero: ");
        numero2 = sc.nextDouble();

        System.out.println("Operacoes existentes possiveis");
        metodoOperacoes();

        System.out.println("Digite o numero da operacao desejada: ");
        operacaoDesejada = sc.nextInt();

        boolean operacaoValida = validacaoOperacaoDesejado();
        if (!operacaoValida) {
            System.err.println("Digite um numero valido!");
            System.exit(0);
        }

        metodoSwitch();

    }

    static boolean validacaoOperacaoDesejado() {
        return operacaoDesejada > 0 && operacaoDesejada <= operacoes.length;
    }

    static void metodoOperacoes() {
        for (int i = 0; i < operacoes.length; i++) {
            System.out.println("[" + (i + 1) + "] " + operacoes[i]);
        }
    }

    static double metodoAdicao() {
        return numero1 + numero2;
    }

    static double metodoSubtracao() {
        return numero1 - numero2;
    }

    static double metodoMultiplicacao() {
        return numero1 * numero2;
    }

    static double metodoDivisao() {
        return numero1 / numero2;
    }

    static void metodoSwitch() {
        switch (operacaoDesejada) {
            case 1:
                resultado = metodoAdicao();
                resultadoConta();
                break;
            case 2:
                resultado = metodoSubtracao();
                resultadoConta();
                break;
            case 3:
                resultado = metodoMultiplicacao();
                resultadoConta();
                break;
            case 4:
                resultado = metodoDivisao();
                resultadoConta();
                break;
        }
    }

    static void resultadoConta() {
        System.out.printf("Resultado: %.2f", resultado);
    }
}