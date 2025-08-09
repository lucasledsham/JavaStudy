import java.util.Scanner;

//Tipos normal utilizam iquals
// Tipo normal consegue utilizar == até o número 127, so retorna verdadeiro até o 127

public class operadoresRelacionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tresMaiorQueDois = 3 > 2; // Resultado de uma relacao e sempre um valor booleano
        System.out.println("3 > 2 " + tresMaiorQueDois);

        boolean tresMenorQueDois = 3 < 2; // Resultado de uma relacao e sempre um valor booleano
        System.out.println("3 < 2 " + tresMenorQueDois);

        boolean tresMaiorQueTres = 3 > 3; // Resultado de uma relacao e sempre um valor booleano
        System.out.println("3 > 3 " + tresMaiorQueTres);

        boolean tresMaiorouIgualQueTres = 3 >= 3; // Resultado de uma relacao e sempre um valor booleano
        System.out.println("3 >= 3 " + tresMaiorouIgualQueTres);

        boolean tresMenorouIgualQueTres = 3 <= 3; // Resultado de uma relacao e sempre um valor booleano
        System.out.println("3 <= 3 " + tresMenorouIgualQueTres);

        boolean doisIgualADois = 2 == 2;
        System.out.println("2 == 2 " + doisIgualADois);

        boolean doisDiferenteDeDois = 2 != 7;
        System.out.println("2 != 2 " + doisDiferenteDeDois);

        int quatro = 4;
        boolean quatroMaiorqueQuatro = quatro > quatro;
        System.out.println("quatro > quatro " + quatroMaiorqueQuatro);

        boolean quatroMaiorOuIgualAQuatro = quatro >= quatro;
        System.out.println("quatro >= quatro " + quatroMaiorOuIgualAQuatro);

        Integer cinco = 5;
        boolean cincoIgualACinco = cinco.equals(cinco);
        System.out.println("5 = 5 " + cincoIgualACinco);

        Integer seis = 6;
        boolean cincoIgualASeis = cinco.equals(seis);
        System.out.println("5 = 6 " + cincoIgualASeis);

        Integer centoVinteOito = 128;
        Integer centoVinteOito02 = 128;
        boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
        System.out.println("centoVinteOito.equals(centoVinteOito02) " + centoVinteOitoIgualCentoVinteOito);

        boolean centoVinteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
        System.out.println("centoVinteOito == centoVinteOito02 " + centoVinteOitoIgualCentoVinteOito02);

        // Teste com INT
        int centoVinteOitoInt = 128;
        int centoVinteOito02Int = 128;
        boolean centoVinteOitoIgualCentoVinteOitoInt = centoVinteOitoInt == centoVinteOito02Int;
        System.out.println("centoVinteOito == centoVinteOito02Int " + centoVinteOitoIgualCentoVinteOitoInt);

        scanner.close();
    }
}
