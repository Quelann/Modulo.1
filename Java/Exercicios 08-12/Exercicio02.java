package Exercicios01;

import java.util.Scanner;

/*
  2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos , tDias;
		
		System.out.println("Quantos dias de vida você tem ? ");
		tDias = leia.nextInt();
		
		anos = tDias/365;
		meses = (tDias % 365) / 30;
		dias = (tDias % 365) % 30;
		
				System.out.println("\nSua idade em anos é: " + anos);
				System.out.println("\nSua idade em meses é: " + meses);
				System.out.println("\nSua idade em dias é " + dias);
				
			leia.close();
	}

}
