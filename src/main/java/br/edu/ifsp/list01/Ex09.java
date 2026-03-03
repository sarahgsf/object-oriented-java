package br.edu.ifsp.list01;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = new int[50];
        int i = 0;

        for (int idade = scanner.nextInt(); idade >= 0; idade = scanner.nextInt()) {
            input[i] = idade;
            i++;
        }

        Ex09 ex09 = new Ex09();

     
        System.out.println(ex09.compute(input));
    }

    String compute(int[] input) {

        int soma = 0;
        int total = 0;
        double media;
        int maioresIdade = 0;
        int idosos = 0;
        double porcentagemIdosos;

        for (int i = 0; i < input.length; i++) {

            if (input[i] < 0) {
                break;
            }

            soma += input[i];
            total++;

            if (input[i] >= 18) {
                maioresIdade++;
            }

            if (input[i] > 75) {
                idosos++;
            }
        }

        media = (double) soma / total;
        porcentagemIdosos = (double) idosos * 100 / total;

        return String.format("%.2f %d %.2f%%", media, maioresIdade, porcentagemIdosos);
    }
}


