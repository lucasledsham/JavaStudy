public class operadoresAritmeticos {
    public static void main(String[] args) {
        int adicao = 1 + 1;
        System.out.println("Adicao: " + adicao);

        int subtracao = 1 - 1;
        System.out.println("Subtracao: " + subtracao);

        int multiplicacao = 2 * 2;
        System.out.println("Multiplicacao: " + multiplicacao);

        int divisao = 4 / 2;
        System.out.println("Divisao: " + divisao);

        //Quando se fala de modulo nao leva em conto valores decimais, e sim o que sobra
        //Resto da divisao
        int modulo = 7 % 4;
        System.out.println("Modulo: " + modulo);

        //Primeiro sao realizados as contas de multiplicacao, divisao e modulo. Tendo mais de um desses, a conta ocorre da esquerda para direita.

        int precedencia01 = 1 + 1 * 5;
        System.out.println("Precedencia 01: " + precedencia01);

        int precedencia02 = (1 + 1) * 5;
        System.out.println("Precedencia 02: " + precedencia02);

        int precedencia03 = 5 * ((1+1) + 2);
        System.out.println("Precedencia 03: " + precedencia03);

        int cinco = 5;
        int um = 1;
        int precedenciaComVariaveis = cinco * (um + um);
        System.out.println("Precedencia com variaveis: " + precedenciaComVariaveis);
    }
}