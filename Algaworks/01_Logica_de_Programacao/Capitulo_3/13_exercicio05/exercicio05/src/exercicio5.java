import java.util.Scanner;

public class exercicio5 {
  static final int NOTA_PARA_PASSAR_DE_ANO = 70;
    public static void main(String[] args) {
      final Scanner scanner = new Scanner(System.in);

      System.out.print("Digite a note do aluno: ");
      double notaAluno = scanner.nextInt();

      boolean passouDeAno = notaAluno >= NOTA_PARA_PASSAR_DE_ANO;

      if (passouDeAno) {
        System.out.println("O aluno passou de ano!");
      } else {
        System.out.println("O aluno nao passou de ano.");
      }

      scanner.close();
      }
}

