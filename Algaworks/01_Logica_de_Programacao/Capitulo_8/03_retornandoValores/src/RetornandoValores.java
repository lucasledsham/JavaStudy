//Void = NÃO tem retorno
//Return = Quando for retornar valores

public class RetornandoValores {
    public static double[] premissaInicial = new double[] {50.0, 100.0};
    public static void main(String[] args) {
        double proporcao = 20.0;

        double resultadoFinal = regraDeTres(premissaInicial, proporcao);
        System.out.println("Resultado: " + resultadoFinal);
    }

    static double regraDeTres(double[] premissa,double proporcao) {
        return (premissa[0] * proporcao)/premissa[1];
    }

}