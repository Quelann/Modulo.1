package Exercicios;

import java.util.Scanner;

/*
 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 * */

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("escreva um numero: ");
			num = input.nextInt();
			soma = num + soma ;
		}while(num != 0 );
		
		System.out.println(num);
		
		input.close();
	}

}
