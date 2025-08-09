import java.util.Scanner;

public class tipoTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + "!");

        Character variavelChar = 'A';
        System.out.println(variavelChar);

    scanner.close();
    }
}
