import java.util.Scanner;

public class numeroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        Integer numero = scanner.nextInt();

        Integer resultado = numero * numero;

        System.out.println("\n");
        System.out.println("O numero ao quadrado e: " + resultado);

        scanner.close();
    }
}
