public class estruturaIf {
    public static void main(String[] args) {

        double emprestimo = 4000.0;
        double movimentacaoMedia = 1000.0;

        boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
        boolean aContaTemTempoSuficienteDeAbertura = true;
        boolean temNomeLimpo = true;

        boolean liberarEmprestimo =  movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;

        if (liberarEmprestimo) {
            System.out.println("Sim! pode liberar emprestimo.");
        } else {
            System.out.println("Nao pode liberar emprestimo.");
        }

    }
}
