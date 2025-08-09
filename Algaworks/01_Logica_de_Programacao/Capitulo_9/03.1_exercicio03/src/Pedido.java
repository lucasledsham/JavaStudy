public class Pedido {

    private int codigo;
    private double subtotal;
    private double desconto;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getTotal() {
        return subtotal - desconto;
    }
}
