package br.edu.ifsp.list02;

/*
    Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores A e B de tamanho N. Em seguida, o programa
    deve criar um vetor C com os elementos de A e B intercalados.

    Exemplos de entrada e saída:

    | Entrada                 | Saída                         |
    | -------                 | ------                        |
    | 6                       | 5 10 6 20 3 30 8 40 2 50 0 60 |
    | 5 6 3 8 2 0             |                               |
    | 10 20 30 40 50 60       |                               |
      ---
    | 3                       | 1 1 2 1 3 1                   |
    | 1 2 3                   |                               |
    | 1 1 1                   |                               |

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        // Leia o input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arrayA = new int[N];
        int[] arrayB = new int[N];

        for (int i = 0; i < N; i++) {
            arrayA[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            arrayB[i] = scanner.nextInt();
        }

        Ex06 ex = new Ex06();
        System.out.println(ex.compute(arrayA, arrayB));
    }

    String compute(int[] arrayA, int[] arrayB) {

        String output = "";

        int tamanho = arrayA.length;

        for (int i = 0; i < tamanho; i++) {

            output += arrayA[i] + " ";
            output += arrayB[i];

            if (i < tamanho - 1) {
                output += " ";
            }
        }

        return output;
    }
}
