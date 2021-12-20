package br.com.generation.classes;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Aviao aviao1 = new Aviao();
		int opcao;

		System.out.println("Confirmação de decolagem");

		aviao1.escreverModelo();
		aviao1.modelo = input.nextLine();
		aviao1.escreverComprimento();
		aviao1.comprimento = input.nextDouble();
		aviao1.escreverPeso();
		aviao1.peso = input.nextDouble();
		System.out.print("\nConfirma decolagem?\n1) Sim\n2) Não\nDigite sua opção: ");
		opcao = input.nextInt();
		if (opcao == 1) {
			aviao1.liberarDecolagem(1);
		} else {
			aviao1.liberarDecolagem(0);
		}

		input.close();
	}
}