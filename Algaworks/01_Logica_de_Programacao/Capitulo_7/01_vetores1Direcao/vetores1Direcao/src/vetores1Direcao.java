import java.util.Scanner;

public class vetores1Direcao {
    public static void main(String[] args) {
//        String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//
//        System.out.println("Escolha o sabor: ");
//
//        for (int i = 0; i < cardapio.length; i++) {
//            System.out.println("[" + i + "] " + cardapio[i]);
//        }
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o numero referente ao sabor desejado: ");
//        int saborEscolhido = sc.nextInt();
//
//        System.out.println("Voce escolheu o sabor: " + cardapio[saborEscolhido]);
//
//        sc.close();


//        String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//
//        cardapio[3] = "Frango";
//
//        for (int i = 0; i < cardapio.length; i++) {
//          System.out.println("[" + i + "] " + cardapio[i]);
//        }

        String [] cardapio = new String[4];
        cardapio[0] = "Calabresa";
        cardapio[1] = "Atum";
        cardapio[2] = "Queijo";
        cardapio[3] = "Presunto";

        for (int i = 0; i < cardapio.length; i++) {
          System.out.println("[" + i + "] " + cardapio[i]);
        }

    }
}