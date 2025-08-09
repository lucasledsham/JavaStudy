import java.util.Scanner;

public class returnExercicioAnterior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avancado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        iterarEExibirPosicoesDoVetorString(cursos);

        imprimirEContinuarNaMesmaLinha("O curso que voce deseja e o: ");
        int cursoEscolhidoPosicao = sc.nextInt();

        boolean numeroValido = verificarPosicaoEscolhidaPeloUsuario(cursoEscolhidoPosicao, cursos); //cursoEscolhidoPosicao > 0 && cursoEscolhidoPosicao <= cursos.length;

        if (!numeroValido) {
            encerrarProgragramaPorPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartao", "Boleto"};

        imprimir("As opcoes de pagamento sao: ");

        iterarEExibirPosicoesDoVetorString(formasPagamento);

        imprimirEContinuarNaMesmaLinha("A forma de pagamento escolhida e: ");
        int pagamentoEscolhidoPosicao = sc.nextInt();

        boolean pagamentoValido = verificarPosicaoEscolhidaPeloUsuario(pagamentoEscolhidoPosicao, formasPagamento); //pagamentoEscolhidoPosicao > 0 && pagamentoEscolhidoPosicao <= formasPagamento.length;

        if (!pagamentoValido) {
            encerrarProgragramaPorPosicaoInvalida();
        }

        imprimirTraco();

        String cursoEscolhido = cursos[cursoEscolhidoPosicao - 1];
        String pagamentoEscolhido = formasPagamento[pagamentoEscolhidoPosicao - 1];

        imprimir("O curso esculhido foi: " + cursoEscolhido + " e o pagamento sera por: " + pagamentoEscolhido);

        sc.close();
    }

    static boolean verificarPosicaoEscolhidaPeloUsuario(int posicao, String[] vetor) {
        return posicao > 0 && posicao <= vetor.length;
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static void imprimirEContinuarNaMesmaLinha(String texto) {
        System.out.print(texto);
    }

    static void imprimirTraco() {
        imprimir("----------------------------------");
    }

    static void encerrarProgragramaPorPosicaoInvalida() {
        System.err.println("O numero escolhido nao e uma opcao valida!");
        System.exit(1);
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            imprimir("[" + (i + 1) + "]" + vetor[i]);
        }
    }
}
