public class App {
    public static void main(String[] args) throws Exception {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        // Ativando o aviao
        aviaoGol.ativar();
        // Desativando o aviao
        aviaoGol.desativar();

        aviaoGol.ativar();

        aviaoGol.reservarAssentos(10);

        System.out.printf("Gol (%s): %d assentos disponiveis\n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());
    }
}
