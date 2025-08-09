//VARIAVEL STATICA EM QUALQUER PONTO QUE FOI ALTERADA VAI FAZER EFEITO EM TODOS OS LUGARES EM QUEE ESTA
//SENDO UTILIZADA
//SAO AS MESMAS PRA QUALQUER VARIAVEL, NAO MUDA
public class ClasseInstancia {
    public static void main(String[] args) {

        System.out.println("Quantidade Minima: " + Produto.quantidadeMinimaEstoque);

        Produto produto = new Produto();
        produto.quantidadeMinimaEstoque = 10;
        produto.nome = "Caneca";
        Produto produto2 = new Produto();
        produto2.nome = "Carteira";

        System.out.println("Produto 1: " + produto.nome + "\nQuantidade minima: " + produto.quantidadeMinimaEstoque);
        System.out.println("Produto 2: " + produto2.nome + "\nQuantidade minima: " + produto2.quantidadeMinimaEstoque);
        System.out.println("Quantidade minima: " + Produto.quantidadeMinimaEstoque);
    }
}