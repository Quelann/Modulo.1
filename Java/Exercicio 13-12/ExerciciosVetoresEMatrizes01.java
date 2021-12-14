package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

/*
 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

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
