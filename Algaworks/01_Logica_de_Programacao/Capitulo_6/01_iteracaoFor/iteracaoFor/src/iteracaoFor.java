// for (inicialização; condição; atualização)
// Inicialização: Esta parte é executada apenas uma vez, no início do loop. Geralmente é usada para declarar e inicializar uma variável de contagem.
// Condição: Esta expressão é avaliada antes de cada iteração do loop. Se a condição for verdadeira, o corpo do loop é executado. Se for falsa, o loop termina.
// Atualização: Esta parte é executada após cada iteração do loop. É comumente usada para atualizar a variável de contagem.

// .length eh uma propriedade do array que guarda informacao do numero de itens contidos no array.

public class iteracaoFor {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++ ) {
        //     System.out.println("Uma frase qualquer. ");
        // } 

        double[] carrinhoDeCompras = new double [] {50.0, 51.0, 52.0};
        double total = 0.0;
        for(int i = 0; i < carrinhoDeCompras.length ; i++) {
            System.out.println("Iteracao: " + i + ", Total: " + total);
            total = total + carrinhoDeCompras[i];
        }

        System.out.println("Total: " + total);

        // PARANDO O FOR
        // for (int i = 0; i < 10; i++) {
        //     if (i == 5) {
        //         System.out.println("Vai parar!");
        //         break;
        //     }
        //     System.out.println("Iteracao: " + i);
        // }

        // CONTINUE NO FOR
        // for (int i = 0; i < 10; i++) {
        //     if (i == 5) {
        //         System.out.println("Vai conitnuar!");
        //         continue;
        //     }
        //     System.out.println("Iteracao: " + i);
        // }

        int[] produtos = new int [] {100, 225, 300};

         for (int i = 0; i < produtos.length; i++) {
            int produto = produtos[i];
            System.out.println("Produto de codigo: " + produto);

            if (produto == 225) {
                System.out.println("Produto encontrado!");
                break;
            }
        }
 

    }
}                   
