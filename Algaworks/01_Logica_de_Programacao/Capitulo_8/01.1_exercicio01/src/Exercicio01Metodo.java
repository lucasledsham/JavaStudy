//Metodo se utiliza em passagens de codigo que sao iguais

import java.util.Scanner;

public class Exercicio01Metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avancado"};

        System.out.println("Escolha dentre os cursos abaixo: ");

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("[" + (i + 1) + "]" + cursos[i]);
        }

        System.out.print("O curso que voce deseja e o: ");
        int cursoEscolhidoPosicao = sc.nextInt();

        boolean numeroValido = cursoEscolhidoPosicao > 0 && cursoEscolhidoPosicao <= cursos.length;

        if (!numeroValido) {
            posicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartao", "Boleto"};

        System.out.println("As opcoes de pagamento sao: ");
        for (int i = 0; i < formasPagamento.length; i++) {
            System.out.println("[" + (i + 1) + "]" + formasPagamento[i]);
        }

        System.out.print("A forma de pagamento escolhida e: ");
        int pagamentoEscolhidoPosicao = sc.nextInt();

        boolean pagamentoValido = pagamentoEscolhidoPosicao > 0 && pagamentoEscolhidoPosicao <= formasPagamento.length;

        if (!pagamentoValido) {
            posicaoInvalida();
        }

        imprimirTraco();

        String cursoEscolhido = cursos[cursoEscolhidoPosicao - 1];
        String pagamentoEscolhido = formasPagamento[pagamentoEscolhidoPosicao - 1];

        System.out.println("O curso esculhido foi: " + cursoEscolhido + " e o pagamento sera por: " + pagamentoEscolhido);

        sc.close();
    }

    static void imprimirTraco() {
        System.out.println("----------------------------------");

    }

    static void posicaoInvalida() {
        System.err.println("Digite um numero valido!");
        System.exit(1);
    }

}