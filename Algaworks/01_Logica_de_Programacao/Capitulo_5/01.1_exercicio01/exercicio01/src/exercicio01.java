import java.util.Scanner;

public class exercicio01 {

    private static final int NOTA_MINIMA_PARA_PASSAR_TOTAL = 150;
    private static final int NOTA_MINIMA_PARA_PASSAR_MATERIA = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de Portugues: ");
        double notaPortugues = scanner.nextDouble();

        System.out.print("Digite a nota de Matematica: ");
        double notaMatematica = scanner.nextDouble();

        double notaFinal = notaPortugues + notaMatematica;

        boolean aprovado = notaFinal >= NOTA_MINIMA_PARA_PASSAR_TOTAL && notaPortugues >= NOTA_MINIMA_PARA_PASSAR_MATERIA && notaMatematica >= NOTA_MINIMA_PARA_PASSAR_MATERIA;

        if (aprovado) {
            System.out.println("\nO candidato esta aprovado!");
        } else {
            System.out.println("\nO candidato nao foi aprovado.");
        }

        scanner.close();
    }
}
