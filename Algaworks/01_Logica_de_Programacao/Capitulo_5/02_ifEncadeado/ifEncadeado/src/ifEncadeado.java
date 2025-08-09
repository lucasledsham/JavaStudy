import java.util.Scanner;

public class ifEncadeado {

    private static final double MAXIMO_PESO_LEVE = 60.00;
    private static final double MINIMO_PESO_GALO = 60.01;
    private static final double MAXIMO_PESO_GALO = 90.00;
    private static final double MINIM0_PESO_PESADO = 90.01;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();

        boolean pesoLeve = peso <= MAXIMO_PESO_LEVE;
        boolean pesoGalo = peso >= MINIMO_PESO_GALO && peso <= MAXIMO_PESO_GALO;
        boolean pesoPesado = peso >= MINIM0_PESO_PESADO;

        if (pesoLeve) {
            System.out.println("O lutador e peso Leve");
        } else if (pesoGalo) {
            System.out.println("O lutador e peso Galo");
        } else if (pesoPesado) {
            System.out.println("O lutador e peso Pesado");
        } else {
            System.out.println("O lutador nao se encaixa em categoria alguma.");
        }

        scanner.close();
    }
}
