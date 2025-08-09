public class Encapsulamento {
    public static void main(String[] args) {

//        Cliente cliente = new Cliente();
//        cliente.nome = "Lucas Nunes";
//        cliente.telefone = "(11) 555-5555";
//
//        System.out.println("Nome: " + cliente.nome);

        Cliente cliente = new Cliente();
        cliente.setNomeCompleto("Lucas Nunes");
        cliente.setTelefone("(11) 5555555");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeironome());
        System.out.println("Ultimo nome: " + cliente.getUltimonome());
    }
}