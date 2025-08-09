//Recursividade = um metodo chamando o próprio metodo
//É possível trocar o For ou um laço qualquer pela Recursividade

public class Recursividade {
    public static void main(String[] args) {
        String[] alunos = new String[] {"Alexandre", "João", "Maria"};

        iterarNomes(alunos, 0);


    }

    static void iterarNomes(String[] nomes, int i) {
        System.out.println("Aluno: " + nomes[i]);

        if (++i < nomes.length) {
            iterarNomes(nomes, i);
        }
    }

}