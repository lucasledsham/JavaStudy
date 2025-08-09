//O valor do vetor de 2 dimensoes, precisa ser um vetor de 1 dimensao.

public class vetores2Dimensoes {
    public static void main(String[] args) {

        double[] faturamentoJaneiro = new double[] {1500.0,2000.0,1700.0};
        double[] faturamentoFevereiro = new double[] {1700.0,2500.0,1800.0};

        double[][] faturamentoAnual = new double[][] {faturamentoJaneiro, faturamentoFevereiro};

//        System.out.println("Faturamento 1 de Janeiro " + faturamentoAnual[0][0]);
//        System.out.println("Faturamento 3 de Fevereiro " + faturamentoAnual[1][2]);

        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Mes: " + (i + 1));

            double mes [] = faturamentoAnual[i];
            for (int j = 0; j < mes.length; j++) {
                double dia = mes[j];
                System.out.println("Dia: " + (j + 1) + ": " + dia);
            }
        }
    }
}