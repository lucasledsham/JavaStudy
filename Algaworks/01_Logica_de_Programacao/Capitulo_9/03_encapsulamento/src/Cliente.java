public class Cliente {

//    String nome;

    String primeironome;
    String ultimonome;
    String telefone;

    public String getPrimeironome() {
        return primeironome;
    }

    public String getUltimonome() {
        return ultimonome;
    }

    public void setNomeCompleto(String nome) {
        String[] nomeCompleto = nome.split(" ");
        primeironome = nomeCompleto[0];
        ultimonome = nomeCompleto[1];
    }

    public String getNome() {
        return primeironome + " " + ultimonome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
}
