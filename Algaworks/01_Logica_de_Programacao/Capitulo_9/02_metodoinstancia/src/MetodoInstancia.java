public class MetodoInstancia {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Lucas";
        cliente.ultimoNome = "Nunes";
        cliente.email = "lucas@gmail.com";
        cliente.telefone = "(11) 555-1234";

        System.out.println("Nome Cliente: " + cliente.obterNomeCompleto() + "\nDDD Cliente: " + cliente.obterDDD());

    }
}