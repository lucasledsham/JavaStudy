// DENTRO DO () DO SWITCH COLOCAR O QUE VAI SER ANALISADO
// APÓS O CASE COLOCAR SEMPRE O BREAK
// DEFAULT TEM O CORPOTAMENTO DO ELSE, CASO NAO ENTRE EM NENHUMA DAS OPCOES
// SWITCH NÃO PODE SER UTILIZADO COMVARIAVEIS DO TIPO DOUBLEM

import java.util.Scanner;

public class estruturaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mês: ");
        int mes = scanner.nextInt();

        double desconto = 0.0;

        switch (mes) {
            case 1: desconto = 0.0;
                break;
            case 2: desconto = 0.0;
                break;
            case 3: desconto = 15.0;
                break;
            case 4: desconto = 30.0;
                break;
            case 5: desconto = 30.0;
                break;
            case 6: desconto = 10.0;
                break;
            case 7: desconto = 10.0;
                break;
            case 8: desconto = 10.0;
                break;
            case 9: desconto = 10.0;
                break;
            case 10: desconto = 20.0;
                break;
            case 11: desconto = 10.0;
                break;
            case 12: desconto = 0.0;  
                break;
            default: 
                System.err.println("Digite um mês válido");
                System.exit(1);
        }

        System.out.println("Seu desconto será de: " + desconto + "%");


        scanner.close();
    }
}
