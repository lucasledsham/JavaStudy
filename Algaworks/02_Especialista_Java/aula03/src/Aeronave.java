public class Aeronave {

  boolean ativo;
  int totalAssentos;
  int assentosReservados;

  int calcularAssentosDisponiveis() {
    return totalAssentos - assentosReservados;
  }

  void reservarAssentos(int numeroAssentos) {
    if (ativo) {
      assentosReservados += numeroAssentos;
    } else {
      // Existe uma forma de fazer isso com execoes
      System.out.println("Aeronave desativada. Assentos nao reservados.");
    }
  }

  void desativar() {
    ativo = false;
  }

  void ativar() {
    ativo = true;
  }
}
