//Crie um programa que receba um número qualquer do usuário e imprima a tabuada desse número, do 0 até o 10.

//Para fazer esse trabalho você deve usar a técnica da recursividade. Crie um metodo com o nome de "imprimirTabuada" que
// receba dois parâmetros - o multiplicando e o multiplicador. O multiplicando será o número que o usuário digitou e o multiplicador
// será o número que irá ser incrementado a cada operação de multiplicação.
//Dentro do metodo "imprimirTabuada" você deve multiplicar um parâmetro pelo outro, mostrar para o usuário a multiplicação feita
// juntamente com o resultado, e, no final, incrementar o multiplicador e fazer uma nova chamada ao metodo "imprimirTabuada"
// com o multiplicador já incrementado.
//Obviamente, a primeira chamada, ao metodo "imprimirTabuada", será feita a partir do metodo "main". O parâmetro referente
// ao multiplicando você terá, pois, será o usuário que irá digitar pelo console, e o multiplicador você pode iniciar,
// na primeira chamada, com o número zero estaticamente. O metodo "imprimirTabuada" é que fará o trabalho de incrementá-lo
// para as próximas chamadas que forem feitas.

import java.util.Scanner;

public class Exercicio04 {
    static Scanner sc = new Scanner(System.in);
    static int numero;
    static int resultado;

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro para realizar a tabuada de 0 a 10: ");
        numero = sc.nextInt();

        imprimirTabuada(numero, 0);
    }

    static void imprimirTabuada(int multiplicando, int multiplicador) {

        resultado = multiplicando * multiplicador;

        System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);

        if (++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }

    }
}