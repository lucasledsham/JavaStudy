import java.util.Scanner;

public class PassarAno {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a nota: ");
    Double notaAluno = scanner.nextDouble();

    Boolean alunoPassou = notaAluno >= 70;
    if (alunoPassou) {
      System.out.println("O aluno foi aprovado!");
    } else {
      System.out.println("O Aluno nao foi aprovado.");
    }

    scanner.close();
  }
}