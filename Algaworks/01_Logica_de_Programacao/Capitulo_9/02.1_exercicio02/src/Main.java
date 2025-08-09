public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.quantidadeEstoque = 30;

        if (produto.reporEstoque()) {
            System.out.println("Repor Estoque");
        } else{
            System.out.println("Sem repor estoque");
        }
    }
}