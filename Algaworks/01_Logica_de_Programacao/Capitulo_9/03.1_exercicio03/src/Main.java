public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setCodigo(1);
        pedido.setSubtotal(100.5);
        pedido.setDesconto(10.5);

        System.out.println("Codigo do pedido: " + pedido.getCodigo() + "\nSubtotal: " + pedido.getSubtotal() + "\nDesconto: " + pedido.getDesconto() + "\nTotal: " + pedido.getTotal());


    }
}