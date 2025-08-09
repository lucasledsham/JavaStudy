//Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
//Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tarefas = new String[5];

        for (int i = 0; i < tarefas.length; i++) {
            System.out.println("Digite qual a tarefa importante: ");
            tarefas[i] = sc.nextLine();
        }

        System.out.println("As suas tarefas mais importantes sao: ");
        for (int i = 0; i < tarefas.length; i++) {
            System.out.println(tarefas[i]);
        }

        sc.close();
    }
}