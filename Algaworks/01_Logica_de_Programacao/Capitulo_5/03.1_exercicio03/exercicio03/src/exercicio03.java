import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero (1 a 7): ");
        int numeroDigitado = scanner.nextInt();

        switch (numeroDigitado) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;    
            default:
                System.err.println("Digite um numero valido!");
                System.exit(1);
                break;
        }

        scanner.close();
    }
}
