public class tipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variável Verdadeira: " + variavelVerdadeira);

        Boolean variavelFalse = false;
        System.out.println("Variável Falso: " + variavelFalse);

        System.out.println("=========================================");

        Integer idade = 21;

        Boolean podeTirarCarteira = idade >= 18;

        System.out.println("Pode tirar carteira? " + podeTirarCarteira);
        
        if (podeTirarCarteira) {
            System.out.println("Você pode tirar carteira!");
        } else {
            System.out.println("Você não pode tirar carteira!");
        }
    }
}
