package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

/*
 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

public class ExerciciosVetoresEMatrizes01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] leitura = new double[5];
		double maiorPontuacao = 0;

		for (int val = 0; val < leitura.length; val++) {
			System.out.println("Digite o valor");
			leitura[val] = input.nextDouble();

			System.out.println(leitura[val]);

			if (maiorPontuacao <= leitura[val]) {
				maiorPontuacao = leitura[val];
			}
		}
		System.out.println(maiorPontuacao);
	}
}
