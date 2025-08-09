//Parametro e colocando entre os parenteses de um metodo
//Ao invocar  metodo e preciso utilizar todos os parametros que ele possui

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avancado"};

        System.out.println("Escolha dentre os cursos abaixo: ");

        iterarEExibirPosicoesDoVetorString(cursos);

        System.out.print("O curso que voce deseja e o: ");
        int cursoEscolhidoPosicao = sc.nextInt();

        if (!verificacaoDeNumeroCorreto(cursoEscolhidoPosicao, cursos)) {
            encerrarProgragramaPorPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartao", "Boleto"};

        System.out.println("As opcoes de pagamento sao: ");

        iterarEExibirPosicoesDoVetorString(formasPagamento);

        System.out.print("A forma de pagamento escolhida e: ");
        int pagamentoEscolhidoPosicao = sc.nextInt();

        if (!verificacaoDeNumeroCorreto(pagamentoEscolhidoPosicao, formasPagamento)) {
            encerrarProgragramaPorPosicaoInvalida();
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

    static void encerrarProgragramaPorPosicaoInvalida() {
        System.err.println("O numero escolhido nao e uma opcao valida!");
        System.exit(1);
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + (i + 1) + "]" + vetor[i]);
        }
    }

     public static boolean verificacaoDeNumeroCorreto(int posicao, String[] lista) {
        return posicao > 0 && posicao <= lista.length;
    }
}