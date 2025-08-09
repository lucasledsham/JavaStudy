public class operadoresLogicos {
    public static void main(String[] args) {
        
        boolean carrinhoMaiorQue100 = false;
        boolean periodoDePromocao = true;

        boolean aplicarDescontoE = carrinhoMaiorQue100 && periodoDePromocao; // E - se um dos lados for falso é falso
        System.out.println("\n" + aplicarDescontoE);

        if (aplicarDescontoE) {
            System.out.println("Sim! Aplique o desconto.");
        } else {
            System.out.println("Não aplique o desconto.");
        }

        boolean aplicarDescontoOu = carrinhoMaiorQue100 || periodoDePromocao; // OU - se um dos lados for verdadeiro é verdadeiro
        System.out.println("\n" + aplicarDescontoOu);

        if (aplicarDescontoOu) {
            System.out.println("Sim! Aplique o desconto.");
        } else {
            System.out.println("Não aplique o desconto.");
        }

        boolean jaFezCompranaLoja = true;

        boolean aplicarDescontoTresVariaveis = carrinhoMaiorQue100 && periodoDePromocao && jaFezCompranaLoja; //Vai validando uma por uma da esqueda para direita
        System.out.println("\n" + aplicarDescontoTresVariaveis);

        if (aplicarDescontoTresVariaveis) {
            System.out.println("Sim! Aplique o desconto.");
        } else {
            System.out.println("Não aplique o desconto.");
        }

        boolean aplicarDescontoTresVariaveisEeOU = carrinhoMaiorQue100 && periodoDePromocao || jaFezCompranaLoja; //Vai validando uma por uma da esqueda para direita
        System.out.println("\n" + aplicarDescontoTresVariaveisEeOU);

        if (aplicarDescontoTresVariaveisEeOU) {
            System.out.println("Sim! Aplique o desconto.");
        } else {
            System.out.println("Não aplique o desconto.");
        }

        boolean pagamentoAvista = true;

        boolean aplicarDescontoQuatro = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompranaLoja) && pagamentoAvista; //Vai validando uma por uma da esqueda para direita
        System.out.println("\n" + aplicarDescontoQuatro);

        if (aplicarDescontoQuatro) {
            System.out.println("Sim! Aplique o desconto.");
        } else {
            System.out.println("Não aplique o desconto.");
        }
    }
}
