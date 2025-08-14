import java.util.Scanner;

public class App {
    static Scanner teclado;
    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("1 - Calcula IMC do Paciente");
        System.out.println("2 - Sair");
        System.out.print("Opcao: ");
        int opcao = teclado.nextInt();

        escolhasMenu(opcao);

        teclado.close();
    }

    static void escolhasMenu(int numero) {
        switch (numero) {
            case 1 -> calcularIMCPaciente();
            case 2 -> System.exit(0);
        }
    }
    static Paciente criarPaciente() {
        Paciente paciente = new Paciente();
        paciente.nome = nomePaciente();
        paciente.altura = alturaPaciente();
        paciente.peso = pesoPaciente();
        return paciente;
    }
    static String nomePaciente() {
        System.out.print("\nDigite o nome do paciente: ");
        teclado.nextLine();
        return teclado.nextLine();
    }
    static double alturaPaciente() {
        System.out.println();
        System.out.print("Digite a altura do paciente: ");
        return teclado.nextDouble();
    }
    static double pesoPaciente() {
        System.out.print("Digite o peso do paciente: ");
        return teclado.nextDouble();
    }

    static void calcularIMCPaciente() {
        Paciente paciente = criarPaciente();
        double imc = paciente.calcularIMC();
        System.out.println("=".repeat(100));
        // System.out.println("\n");
        imprimirIMC(paciente, imc);
    }

    static void imprimirIMC(Paciente paciente, double imc) {
        System.out.println("Nome do paciente: " + paciente.nome);
        System.out.println("Altura do paciente: " + paciente.altura);
        System.out.println("Peso do paciente: " + paciente.peso);
        System.out.printf("IMC do paciente: %.2f ", imc);
    }
}
