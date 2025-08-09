//Contantes nao podem ter o valor alterado.
// Nao deixar numeros soltos pelo algoritmo, sempre criar constantes.
import java.util.Scanner;

public class constantes {

    static final int IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner (System.in);

        //final int idadeMinimaParaTirarCarteira = 18;
         // Nao e possivel mais alterar o valor da variavel
 
        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele(a) pode tirar carteira.");
        } else {
            System.out.println("Nao! Ele(a) nao pode tirar carteira.");
        }

        scanner.close();
    }
}
